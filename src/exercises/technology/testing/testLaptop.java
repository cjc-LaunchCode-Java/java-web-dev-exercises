package exercises.technology.testing;


import exercises.technology.Laptop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testLaptop  {
    Laptop mine;

    @Before
    public void createMyLaptop(){
        mine = new Laptop("Carol", "Windows 10",false, 8.0);
    }


    @Test
    public void checkLaptopOwner () {
        assertEquals("Carol", mine.getOwnerName());
    }

    @Test
    public void checkOperatingSystem () {
        assertEquals("Windows 10", mine.getOperatingSystem());
    }

    @Test
    public void checkTouchscreen () {
        assertEquals(false, mine.getTouchscreen());
    }

    @Test
    public void checkMemory() {
        assertEquals(8.0, mine.getMemory(), .001);
    }

    @Test
    public void checkAddMemoryWithPositive() {
        mine.addMemory(4.0);
        assertEquals(12.0, mine.getMemory(), .001);
    }

    @Test
    public void checkAddMemoryWithNegative() {
        mine.addMemory(-4.0);
        assertEquals(4.0, mine.getMemory(), .001);
    }

    @Test
    public void checkAddMemoryWithZero() {
        mine.addMemory(0.0);
        assertEquals(8.0, mine.getMemory(), .001);
    }
}
