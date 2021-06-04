package Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJobFull;
//    Job testJob1;
//    Job testJob2;
    Job twinJob1;
    Job twinJob2;

    @Before
    public void createTestJob() {
//        testJob1 = new Job();
//        testJob2 = new Job();
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
    }

   @Test
    public void testSettingJobID() {
//    Job testJob1 = new Job();
//    Job testJob2 = new Job();
        assertEquals(11, twinJob1.getId());
        assertEquals(12, twinJob2.getId());

    }
@Test
    public void testJobConstructorSetsAllFields() {

    assertEquals(7, testJobFull.getId());
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
        assertTrue("Product tester", testJobFull.toString().contains(testJobFull.getName()));
        assertTrue("ACME", testJobFull.toString().contains(testJobFull.getEmployer()));
    }
}
