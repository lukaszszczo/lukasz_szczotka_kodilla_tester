/**
 * The Berlin Clock is composed of four rows of lights and a yellow lamp on the top
 * The top yellow light blinks every couple of seconds(on for even seconds,off for odd seconds).
 * The top two rows represent hours.The lights on the top row represent five hours each,while the bottom row lamps represent one hour each.
 * The bottom two rows represent minutes.Again,each third-row lamp represents 5minutes,so there are 11of them.Each bottom row lamp represents one minute.
 * For example,4pm(16hours)is represented by 3lamps on of the first row and 1light on of the second row(3x5+1).Equally,27minutes is represented by 5lights on the third row and 2on the very bottom row(5x5+2).
 * You may notice that lamps on the third row are all yellow,apart from the 3rd,6th and 9th lamps which show quarters of an hour.This is just a visual convenience as they still represent 5minutes like the yellow lamps.
 * Here is the colour code for lamps:
 * Y=Yellow
 * R=Red
 * O=Off
 */

public class BerlinClockApp {
    public static void main(String[] args) {

        BerlinClock test1 = new BerlinClock(00, 00, 00);
        BerlinClock test2 = new BerlinClock(13, 17, 01);
        BerlinClock test3 = new BerlinClock(23, 59, 59);
        BerlinClock test4 = new BerlinClock(24, 00, 00);

        test1.getBerlinClockFormat();
        test2.getBerlinClockFormat();
        test3.getBerlinClockFormat();
        test4.getBerlinClockFormat();
    }
}
