import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class BerlinClockTestSuite {

    @Test
    public void shouldGetCorrect() {
        BerlinClock test1 = new BerlinClock(00, 00, 00);
        BerlinClock test2 = new BerlinClock(00, 00, 00);
        assertEquals(test2.getBerlinClockFormat(), test1.getBerlinClockFormat());
    }

    @Test
    public void shouldGetCorrectString() {
        BerlinClock test1 = new BerlinClock(00, 00, 00);

        assertEquals("00:00:00 Y OOOO OOOO OOOOOOOOOOO OOOO", test1.getBerlinClockFormat());
    }

    @Test
    public void shouldGetIncorrectHours() {
        BerlinClock test1 = new BerlinClock(-13, 17, 01);
        assertEquals(false, test1.startMethod());

    }

    @Test
    public void shouldGetIncorrectMinutes() {
        BerlinClock test1 = new BerlinClock(13, -17, 01);
        assertEquals(false, test1.startMethod());

    }

    @Test
    public void shouldGetIncorrectSeconds() {
        BerlinClock test1 = new BerlinClock(13, 17, 77);
        assertEquals(false, test1.startMethod());
    }

    @Test

    public void shouldGetCorrectHours() {
        BerlinClock test1 = new BerlinClock(13, 17, 6);
        assertEquals(true, test1.startMethod());

    }

    @Test
    public void shouldGetCorrectMinutes() {
        BerlinClock test1 = new BerlinClock(13, 17, 4);
        assertEquals(true, test1.startMethod());

    }

    @Test
    public void shouldGetCorrectSeconds() {
        BerlinClock test2 = new BerlinClock(13, 17, 45);
        assertEquals(true, test2.startMethod());

    }


}


