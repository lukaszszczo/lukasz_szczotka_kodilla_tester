public class Application {
    public static void main(String[] args) {

        RandomNumbers start = new RandomNumbers(50); // na mniejszym maxRandom lepiej widac efekt.
        start.genNumber();
        start.getMin();
        start.getMax();
        start.genNumber();
        start.getMin();
        start.getMax();

    }
}