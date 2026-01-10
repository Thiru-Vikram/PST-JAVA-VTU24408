package Week2;

public class Task10 {

    // Task 10:Sum of Sums of Digits in Cyclic order :
    // https://tests.mettl.com/authenticateKey/1ddbe65e
    // tc is o(d) means no of digits or o(log n), sc is o(1)
    public static int sumOfSumsOfDigits(int n) {
        int totalSum = 0;
        int multiplier = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            totalSum += digit * multiplier;
            multiplier++;
            temp /= 10;
        }

        return totalSum;
    }

    public static void main(String[] args) {

    }
}
