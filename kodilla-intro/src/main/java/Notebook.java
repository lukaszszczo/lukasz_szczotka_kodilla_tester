public class Notebook {

    int weight;
    int price;
    int year;
    int switchcase;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {

//        Math.signum zwraca -1.0 jesli podany parametr jest mniejszy od 0
//        Math.signum zwraca  0.0 jesli podany parametr jest równy 0
//        Math.signum zwraca  1.0 jesli podany parametr jest większy od 0
//        Mathsignum zwraca wartość zmiennoprzecinkową typu float, która nie może być użyta w switch
//        (int) wymusza zmiane wartości float na int
        switchcase = (int)(Math.signum(price - 600) + Math.signum(price - 1000));

        switch (switchcase) {
            case -2 :
            case -1 :
                System.out.println("This notebook is cheap.");
                break;
            case 0 :
                System.out.println("The price is good.");
                break;
            case 1 :
            case 2 :
                System.out.println("This notebook is expensive.");
                break;
            default:
                System.out.println("Cannot calculate price category");
        }
    }


    public void checkWeight(){
        if ( this.weight <= 1500) {
            System.out.println("It's very light");
        } else if (this.weight > 1500 && this.weight < 2500) {
            System.out.println("It's average weight");
        } else {
            System.out.println("it;s heavy");
        }
        }

     public void isItWorth(){
       if (this.year < 2015 && this.price < 1200) {
           System.out.println("It's good deal. Go for it ! :P");
       } else if ( this.year < 2010 && this.price > 2000) {
           System.out.println("Don't buy it");
       } else{
           System.out.println("Hard choice");
       }
       }

     }


