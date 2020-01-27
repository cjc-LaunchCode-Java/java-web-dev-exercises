package exercises.technology.testing;

import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class testSmartPhone {
    SmartPhone test_SmartPhone;
    @Before
    public void createSmartPhone() {
        test_SmartPhone = new SmartPhone("Carol's iPhone", "iOS 13.3", true, true);
    }





    @Test
    public void checkLaptopOwner () {
        assertEquals("Carol's iPhone", test_SmartPhone.getOwnerName());
    }

    @Test
    public void checkOperatingSystem () {
        assertEquals("iOS 13.3", test_SmartPhone.getOperatingSystem());
    }

    @Test
    public void checkTouchscreen () {
        assertEquals(true, test_SmartPhone.getTouchscreen());
    }

    @Test
    public void checkProtectiveCase () {
        assertTrue(test_SmartPhone.getProtectiveCase());
    }

    @Test
    public void checkProtectiveCaseOutputTrue () {
        test_SmartPhone.putOnCase(true);
        assertTrue(test_SmartPhone.getProtectiveCase());
    }

    @Test
    public void checkProtectiveCaseOutputFalse () {
        test_SmartPhone.putOnCase(false);
        assertFalse(test_SmartPhone.getProtectiveCase());
    }

    @Test
    public void checkProtectiveCaseOutputFalseDisplay () {
        assertEquals("Protective case information has been updated.", test_SmartPhone.putOnCase(false));
    }

    @Test
    public void checkProtectiveCaseOutputTrueDisplay () {
        assertEquals("Protective case information has been updated.", test_SmartPhone.putOnCase(true));
    }

}
