package Week2;

public class Task6 {

    // Task 6. All Digits Count:
    // https://tests.mettl.com/authenticateKey/ed6b4da
    // tc is o(n) and sc is o(1).
    public int allDigitsCount(int input1) {

        int temp = input1;
        int count = 0;
        while (temp != 0) {
            int digit = temp % 10;
            count++;
            temp = temp / 10;

        }
        return count;
    }

    public static void main(String[] args) {

    }
}
