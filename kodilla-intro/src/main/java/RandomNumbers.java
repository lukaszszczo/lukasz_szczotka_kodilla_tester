
import java.util.Random;

public class RandomNumbers {


    int maxRandom;
    int tempMin;
    int max;

    public RandomNumbers(int maxRandom) {
        this.maxRandom = maxRandom;
    }

    public void genNumber() {
        int temp = 0;
        int sum = 0;
        tempMin = maxRandom;
        max = 0;

        Random random = new Random();

        while (sum <= maxRandom) {
            temp = random.nextInt(31);
            sum = sum + temp;
            System.out.println(temp);
            if (temp < tempMin) {
                tempMin = temp;


            }
            if (temp > max) {
                max = temp;

            }
        }
    }

    public void getMin() {
        System.out.println("minimalna wylosowana liczba to = " + tempMin);


    }

    public void getMax() {
        System.out.println("maxksymalna wylosowana liczba to = " + max);

    }

}

