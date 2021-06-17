package Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJobFull;
    Job twinJob1;
    Job twinJob2;
    Job emptyJob;

    @Before
    public void createTestJob() {
        testJobFull = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        twinJob1 = new Job("Super soldier",
                new Employer("Lexcorp"),
                new Location("The moon"),
                new PositionType("Minion"),
                new CoreCompetency("Willingness"));
        twinJob2 = new Job("Super soldier",
                new Employer("Lexcorp"),
                new Location("The moon"),
                new PositionType("Minion"),
                new CoreCompetency("Willingness"));
        emptyJob = new Job("Super soldier",
                new Employer(""),
                new Location(""),
                new PositionType("Minion"),
                new CoreCompetency("Willingness"));
        }


   @Test
    public void testSettingJobID() {
        assertEquals(14, twinJob1.getId());
        assertEquals(15, twinJob2.getId());

    }
@Test
    public void testJobConstructorSetsAllFields() {

    assertEquals(9, testJobFull.getId());
    assertEquals("Product tester", testJobFull.getName());
    assertTrue(testJobFull.getEmployer() instanceof Employer);
    assertEquals("ACME", testJobFull.getEmployer().getValue());
    assertTrue(testJobFull.getLocation() instanceof Location);
    assertEquals("Desert", testJobFull.getLocation().getValue());
    assertTrue(testJobFull.getPositionType() instanceof PositionType);
    assertEquals("Quality control", testJobFull.getPositionType().getValue());
    assertTrue(testJobFull.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Persistence", testJobFull.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
    assertNotEquals(twinJob1, twinJob2);
    }


    @Test
    public void testToString() {

        assertTrue(testJobFull.toString(), testJobFull.toString().contains("\n"));
        assertTrue(testJobFull.toString().contains(testJobFull.getName()));
        assertTrue(testJobFull.toString().contains(testJobFull.getEmployer().getValue()));
        assertTrue(testJobFull.toString().contains(testJobFull.getLocation().getValue()));
        assertTrue(testJobFull.toString().contains(testJobFull.getPositionType().getValue()));
        assertTrue(testJobFull.toString().contains(testJobFull.getCoreCompetency().getValue()));
        assertEquals(8, emptyJob.getId());
        assertTrue(emptyJob.toString().contains("Data not available"));

    }
}