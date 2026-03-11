package Week5;

import java.util.List;

public class Task3 {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        // Max subarray: Kadane's algorithm
        int maxSub = arr.get(0), current = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            current = Math.max(arr.get(i), current + arr.get(i));
            maxSub = Math.max(maxSub, current);
        }

        // Max subsequence: sum all positives, or take max element if all negative
        int maxSeq = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > 0)
                maxSeq += x;
            maxVal = Math.max(maxVal, x);
        }
        if (maxSeq == 0)
            maxSeq = maxVal; // all negatives case

        return List.of(maxSub, maxSeq);
    }
}