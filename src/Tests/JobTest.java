package Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    public JobTest() {
        testJobFull = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    }

    @Test
    public void testTest() {
        assertEquals(10,10,.001);

    }
Job testJobFull;
    @Before
    public void createTestJob() {
    }

   @Test
    public void testSettingJobID() {
    Job testJob1 = new Job();
    Job testJob2 = new Job();
        assertEquals(8, testJob1.getId());
        assertEquals(9, testJob2.getId());

    }
@Test
    public void testJobConstructorSetsAllFields() {

    assertEquals(6, testJobFull.getId());
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
    Job twinJob1 = new Job("Super soldier",
            new Employer("Lexcorp"),
            new Location("The moon"),
            new PositionType("Minion"),
            new CoreCompetency("Willingness"));
    Job twinJob2 = new Job("Super soldier",
            new Employer("Lexcorp"),
            new Location("The moon"),
            new PositionType("Minion"),
            new CoreCompetency("Willingness"));
    assertNotEquals(twinJob1, twinJob2);
    }

}
