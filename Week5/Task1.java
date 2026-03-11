package Week5;

public class Task1 {

    public int maxSubArray(int[] array) {

        int max = Integer.MIN_VALUE, sum = 0;

        if (array.length == 1) {
            return array[0];
        }

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

}