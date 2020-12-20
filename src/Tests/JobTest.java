package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class JobTest {

//    Car test_car;
//
//    @Before
//    public void createCarObject() {
//        test_car = new Car("Toyota", "Prius", 10, 50);
//    }
    Job job1;
    Job job2;

    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
    }


    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() { assertFalse(job1.equals(job2));}

    @Test
    public void job2ShouldBe1MoreThanJob1() { assertTrue(job2.getId() -
            job1.getId() == 1);}

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
            PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job1.getName(), "Product tester");
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");

        assertTrue(job1 instanceof Job);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }

    //TODO: Tests for toString() method - when passed a Job object, it should return a string that contains a blank
    // line before and after the job information.

    @Test
    public void jobObjectStringBeginsWithBlankLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job1.toString().indexOf("\n"), 0);
    }

//    @Test
//    public void jobObjectStringEndsWithBlankLine() {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
//                PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//        String jobString = job1.toString();
//        String substring = jobString.substring(1);
//
//       assertTrue(substring.equals("\n"));
//        assertEquals(substring, "\n");
//    }
    //TODO: Tests for toString() method - the string should contain a label for each field, followed by the data stored
    // in that field. Each field should be on its own line.
    @Test
    public void jobObjectStringContainsLabelDataAndNewLineForEachField() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job1.toString().contains("ID: " + job1.getId() + "\n"));
        assertTrue(job1.toString().contains("Name: " + job1.getName() + "\n"));
        assertTrue(job1.toString().contains("Employer: " + job1.getEmployer() + "\n"));
        assertTrue(job1.toString().contains("Location: " + job1.getLocation() + "\n"));
        assertTrue(job1.toString().contains("Position Type: " + job1.getPositionType() + "\n"));
        assertTrue(job1.toString().contains("Core Competency: " + job1.getCoreCompetency() + "\n"));
    }

    //TODO: Tests for toString() method - If a field is empty, the method should add, “Data not available” after the
    // label.
    @Test
    public void jobObjectStringShouldAddDataNotAvailableIfFieldEmpty() {
        Job job1 = new Job("Product tester", new Employer(), new Location(), new
                PositionType(), new CoreCompetency());

        assertTrue(job1.toString().contains("Location: Data not available"));
        assertTrue(job1.toString().contains("Employer: Data not available"));
        assertTrue(job1.toString().contains("Position Type: Data not available"));
        assertTrue(job1.toString().contains("Core Competency: Data not available"));
    }

    //TODO: Tests for toString() method - (Bonus) If a Job object ONLY contains data for the id field, the method
    // should return, “OOPS! This job does not seem to exist.”


}
