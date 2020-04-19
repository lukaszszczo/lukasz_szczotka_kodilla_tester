
import java.util.Random;

public class RandomNumbers {


    int maxRandom;
    int temp;
    int tempMin;
    int tempMax;

    public RandomNumbers(int maxRandom, int temp, int tempMin, int tempMax) {
        this.maxRandom = maxRandom;
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public void RandomNumber() {
        Random random = new Random();
        int sum = 0;

        while (sum <= maxRandom) {
            temp = random.nextInt(31);
            sum = sum + temp;
            System.out.println(temp);
            if (temp < tempMin) {
                tempMin = temp;


            }
            if (temp > tempMax) {
                tempMax = temp;

            }
        }
    }

    public void getMin() {
        System.out.println("minimalna wylosowana liczba to = " + tempMin);


    }

    public void getMax() {
        System.out.println("maxksymalna wylosowana liczba to = " + tempMax);

    }

}

