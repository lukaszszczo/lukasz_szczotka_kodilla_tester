public class LeapYear {

    int leapYear;

    public LeapYear(int leapYear) {
        this.leapYear = leapYear;

    }

    public boolean isLeap() {
        if ((leapYear % 4 == 0) && (leapYear % 100 > 0) || (leapYear % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public void isItLeap() {
        if (isLeap() == true) {
            System.out.println(leapYear + " rok jest rokiem przestępnym");
        } else {
            System.out.println(leapYear + " rok nie rokiem przestępnym");
        }
    }
}

// hmm nie wiem czy to dobrze bo są dwie metody a nie jedna.
//




