package exercises.technology.testing;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class testComputer {
    Computer test_computer;
    @Before
    public void createTestComputer(){
        test_computer = new Computer("Carol's Dell", "Windows 7", false);
    }

    @Test
    public void checkOwnerName(){
        assertEquals("Carol's Dell", test_computer.getOwnerName());
    }

    @Test
    public void checkOperatingSystem () {
        assertEquals("Windows 7", test_computer.getOperatingSystem());
    }

    @Test
    public void checkTouchscreen () {
        assertEquals(false,test_computer.getTouchscreen());
    }

    @Test
    public void checkUpdateOperatingSystem () {
        test_computer.updateOperatingSystem("Windows 10");
        assertEquals("Windows 10", test_computer.getOperatingSystem());
    }

    @Test
    public void checkUpdateOperatingSystemOutput () {
        assertEquals("Carol's Dell's new operating system is Windows 10.", test_computer.updateOperatingSystem("Windows 10"));
    }

    @Test
    public void checkUpdateOwner () {
        test_computer.updateOwner("Sam");
        assertEquals("Sam", test_computer.getOwnerName());
    }

    @Test
    public void checkUpdateOwnerOutput () {
        assertEquals("Sam now owns this computer.", test_computer.updateOwner("Sam"));
    }

    @Test
    public void checkBoughtNewScreenTrue () {
        test_computer.boughtNewScreen(true);
        assertTrue(test_computer.getTouchscreen());
    }

    @Test
    public void checkBoughtNewScreenFalse () {
        test_computer.boughtNewScreen(false);
        assertFalse(test_computer.getTouchscreen());
    }

    @Test
    public void checkBoughtNewScreenTrueOutput () {
        assertEquals("Carol's Dell's new screen is a touchscreen.", test_computer.boughtNewScreen(true));
    }

    @Test
    public void checkBoughtNewScreenFalseOutput () {
        assertEquals("Carol's Dell's new screen is NOT a touchscreen.", test_computer.boughtNewScreen(false));
    }

}
