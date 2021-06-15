package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name,Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public String toString() {

        String newLine= "\n";
        String output;
        List<Object> labels = new ArrayList<>(List.of(" Id:", "Name:", "Employer:", "Location:", "Position type:", "Core competency:"));
        List<Object> data = new ArrayList<>(List.of(id));
              for (int i = 0; i < 5; i++) {
                  data.add(name);
                  data.add(employer);
                  data.add(location);
                  data.add(positionType);
                  data.add(coreCompetency);
              }
        List<Object> collection= new ArrayList<>(List.of());
        for (int i =0; i < labels.size(); i++){
            Object aInfo = labels.get(i);
            Object aData = data.get(i);
            String nullField = "Data not available";
//            String emptyJob = ("OOPS! This job does not seem to exist.");
            if (data.get(i) != null) {
//                Object aInfo = labels.get(i);
//                Object aData = data.get(i);
                collection.add(aInfo);
                collection.add(aData);
            }
                else {
                collection.add(aInfo);
                collection.add(nullField);
            }
            collection.add(newLine);
        }
        collection.add(newLine);
        output = collection.toString().replace("[","").replace("]","").replace(",","");
        return output;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
