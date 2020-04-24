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
        String timeString;

        timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.print(timeString + " ");

        if (seconds % 2 == 0) {
            System.out.print(yellow);
        } else {
            System.out.print(off);
        }

        System.out.print(" ");
        for (int i = 0; i < hours / 5; i++) {
            System.out.print(red);
        }
        for (int n = 0; n < 4 - hours / 5; n++) {
            System.out.print(off);
        }
        System.out.print(" ");
        for (int i = 0; i < hours % 5; i++) {
            System.out.print(red);
        }
        for (int n = 0; n < 4 - hours % 5; n++) {
            System.out.print(off);
        }
        System.out.print(" ");
        for (int i = 1; i < minutes / 5 + 1; i++) {
            if (i % 3 == 0) {
                System.out.print(red);
            } else {
                System.out.print(yellow);
            }
        }
        for (int i = 0; i < 11 - minutes / 5; i++) {
            System.out.print(off);
        }
        System.out.print(" ");
        for (int i = 0; i < minutes % 5; i++) {
            System.out.print(yellow);
        }
        for (int i = 0; i < 4 - minutes % 5; i++) {
            System.out.print(off);

        }

        System.out.println();
        return "";
    }


}
