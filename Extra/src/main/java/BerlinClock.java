

public class BerlinClock {

    private int hours;
    private int minutes;
    private int seconds;
    private String yellow = "Y";
    private String red = "R";
    private String off = "O";
    private String timeString;
    public boolean start;

    public BerlinClock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void checkNumbers() {
        if (hours < 0 || hours > 24) {
            start = false;
            System.out.print("Poza zakresem - godzina!!!   ");
        } else if (minutes < 0 || minutes > 60) {
            start = false;
            System.out.print("Poza zakresem - minuty!!!   ");
        } else if (seconds < 0 || seconds > 60) {
            start = false;
            System.out.print("Poza zakresem - sekundy!!!   ");
        } else {
            start = true;
        }
    }

    public boolean startMethod() { // do testow glownie
        checkNumbers();
        return start;
    }


    String getBerlinClockFormat() {
        checkNumbers();
        return getTime() + " " + getFirstRow() + " " + getSecondRow() + " " + getThirdRow() + " " + getFourthRow() + " " + getFifthRow();
    }

    private String getTime() {
        timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return timeString;
    }

    private String getFirstRow() {
        String row1;
        if (seconds % 2 == 0) {
            row1 = yellow;
        } else {
            row1 = off;
        }
        return row1;
    }

    private String getSecondRow() {
        String row2 = "";
        for (int i = 0; i < hours / 5; i++) {
            row2 += red;
        }
        for (int n = 0; n < 4 - hours / 5; n++) {
            row2 += off;
        }
        return row2;
    }

    private String getThirdRow() {
        String row3 = "";
        for (int i = 0; i < hours % 5; i++) {
            row3 += red;
        }
        for (int n = 0; n < 4 - hours % 5; n++) {
            row3 += off;
        }

        return row3;
    }

    private String getFourthRow() {
        String row4 = "";
        for (int i = 1; i < minutes / 5 + 1; i++) {
            if (i % 3 == 0) {
                row4 += red;
            } else {
                row4 += yellow;
            }
        }
        for (int i = 0; i < 11 - minutes / 5; i++) {
            row4 += off;
        }

        return row4;
    }

    private String getFifthRow() {
        String row5 = "";
        for (int i = 0; i < minutes % 5; i++) {
            row5 += yellow;
        }
        for (int i = 0; i < 4 - minutes % 5; i++) {
            row5 += off;
        }
        return row5;
    }

}



