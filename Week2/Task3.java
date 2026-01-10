package Week2;

import java.util.List;

public class Task3 {

    // Task 3. https://www.hackerrank.com/challenges/mini-max-sum/problem
    // tc is O(n) and sc is o(1)
    public static void miniMaxSum(List<Integer> arr) {

        long totalSum = 0;
        long min = arr.get(0);
        long max = arr.get(0);

        for (int num : arr) {
            totalSum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

    }

}
