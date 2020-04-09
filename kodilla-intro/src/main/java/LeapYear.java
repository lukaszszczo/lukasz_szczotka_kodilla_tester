public class LeapYear {

    int leapYear;

    public LeapYear(int leapYear) {
        this.leapYear = leapYear;

    }
    public boolean isLeap() {
        if ((this.leapYear % 4 == 0) && (this.leapYear%100 > 0) || (this.leapYear%400 == 0) ){
            return true;
        }   else
        {
            return false;
        }

    }
    public void isItLeap(){
        if (isLeap() == true) {
            System.out.println("Ten rok jest rokiem przestępnym");
        }else {
            System.out.println("Nie jest rokiem przestepnym");
            }
        }
    }

// hmm nie wiem czy to dobrze bo są dwie metody a nie jedna.
//




