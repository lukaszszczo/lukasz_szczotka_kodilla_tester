public class BerlinClock {

    private int hours;
    private int minutes;
    private int seconds;

    public BerlinClock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    String getBerlinClockFormat() {
        char yellow = 'Y';
        char red = 'R';
        char off = 'O';
        int row1 = hours / 5;
        int row2 = hours % 5;
        int row3 = minutes / 5;
        int row4 = minutes % 5;
        String timeString;

        timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.print(timeString + " ");

        if (seconds % 2 == 0) {
            System.out.print(yellow);
        } else {
            System.out.print(off);
        }

        System.out.print(" ");
        for (int i = 0; i < row1; i++) {
            System.out.print(red);
        }
        for (int n = 0; n < 4 - row1; n++) {
            System.out.print(off);
        }
        System.out.print(" ");
        for (int i = 0; i < row2; i++) {
            System.out.print(red);
        }
        for (int n = 0; n < 4 - row2; n++) {
            System.out.print(off);
        }
        System.out.print(" ");
        for (int i = 1; i < row3 + 1; i++) {
            if (i % 3 == 0) {
                System.out.print(red);
            } else {
                System.out.print(yellow);
            }
        }
        for (int i = 0; i < 11 - row3; i++) {
            System.out.print(off);
        }
        System.out.print(" ");
        for (int i = 0; i < row4; i++) {
            System.out.print(yellow);
        }
        for (int i = 0; i < 4 - row4; i++) {
            System.out.print(off);

        }

        System.out.println();
        return "";
    }


}
