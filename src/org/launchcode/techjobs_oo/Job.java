package org.launchcode.techjobs_oo;

import java.util.ArrayList;
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
            String emptyField = "Data not available";
            String emtpyData = "";
            if (data.get(i).toString() == emtpyData) {
                collection.add(aInfo);
                collection.add(emptyField);
            } else {
                collection.add(aInfo);
                collection.add(aData);
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

}
