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
    Job test_job_1;
    Job test_job_2;

    @Before
    public void createJobObjects() {
        test_job_1 = new Job();
        test_job_2 = new Job();
    }


    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() { assertFalse(test_job_1.equals(test_job_2));}

    @Test
    public void job2ShouldBe1MoreThanJob1() { assertTrue(test_job_2.getId() -
            test_job_1.getId() == 1);}

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
            PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job3.getName(), "Product tester");
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");

        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);


    }
}
