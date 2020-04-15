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

        if (this.price <= 600) {
            switchcase = 0;
        } else if (this.price > 600 && this.price < 1000) {
            switchcase = 1;
        } else {
            switchcase = 2;
        }

        switch (switchcase) {
            case 0:
                System.out.println("This notebook is cheap.");
                break;
            case 1:
                System.out.println("The price is good.");
                break;
            default:
                System.out.println("This notebook is expensive.");
        }
    }


    public void checkWeight() {
        if (this.weight <= 1500) {
            System.out.println("It's very light");
        } else if (this.weight > 1500 && this.weight < 2500) {
            System.out.println("It's average weight");
        } else {
            System.out.println("it;s heavy");
        }
    }

    public void isItWorth() {
        if (this.year < 2015 && this.price < 1200) {
            System.out.println("It's good deal. Go for it ! :P");
        } else if (this.year < 2010 && this.price > 2000) {
            System.out.println("Don't buy it");
        } else {
            System.out.println("Hard choice");
        }
    }

}


