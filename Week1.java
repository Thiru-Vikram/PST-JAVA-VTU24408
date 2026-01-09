import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Week1 {

    // Task 1: https://tests.mettl.com/authenticateKey/2bd025dc
    // to check the given num is even or odd.
    // tc is O(1) and sc is o(1).
    public int checkEvenOrOdd(int num) {

        if (num == 0)
            return 2;

        if (num % 2 == 0) {
            return 2;
        }

        return 1;
    }

    // Task 2. Access and print the element at a given index in an array
    // tc is o(1) and sc is o(1).
    public static int accessArrayEle(int[] arr, int n) {

        if (n >= 0 && n < arr.length) {
            return arr[n];
        }
        return -1;
    }

    // Task 3. Search for a given element in a sorted array using Binary Search.
    // tc is o(log n) and sc is o(1).
    public static int binarySearch(int[] arr, int target) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }

    // Task 4. Find the maximum element in an array of n integers
    // tc is o(n) and sc is o(1).
    public static int maxEle(int[] arr) {

        int n = arr.length;
        int maxEle = arr[0]; // for better space.

        for (int i = 0; i < n; i++) {
            maxEle = Math.max(maxEle, arr[i]);
        }

        return maxEle;
    }

    // Task 5. Given an array of integers and a positive integer K, write a program
    // brute force - tc is o(n log n) for sorting and sc is o(1).
    public static int kthSmallestEle(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1]; // k-1 because array is 0-indexed
    }

    // optimal - tc is o(n log k) everytime stores k ele in maxheap, sc is o(k).
    public static int kthSmallestEle2(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.offer(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }

    // Task 6. Print all possible pairs of elements from an array of size n
    // no other solu tc is o(n^2) and sc is o(n^2) for sorting.
    public static ArrayList<ArrayList<Integer>> allPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                ans.add(temp);
            }
        }

        return ans;
    }

    // Task 7: digitSum opt: sum of even or odd digits
    // tc is o(n) and sc is o(1).
    public int EvenOddDigitSum(int input1, String input2) {

        int temp = input1;
        int sum = 0;

        if (input2.equals("even")) {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                temp = temp / 10;
            }
        }

        if (input2.equals("odd")) {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit % 2 != 0) {
                    sum += digit;
                }
                temp = temp / 10;
            }
        }

        return sum;
    }

    // Task 8:Nth Fibonacci
    // tc is o(n) ans sc is o(1).
    public long nthFibonacci(int input1) {

        if (input1 <= 0)
            return 0;
        if (input1 == 1)
            return 0;
        if (input1 == 2)
            return 1;

        long first = 0;
        long sec = 1;

        for (int i = 2; i < input1; i++) {
            long third = first + sec;
            first = sec;
            sec = third;
        }

        return sec;
    }

    // Task 9: Is Palindrome Number?
    // tc is o(n) and sc is o(1).
    public int isPalinNum(int input1) {

        if (input1 < 0)
            return 1;

        int temp = input1;
        int revNum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp = temp / 10;
        }

        if (input1 == revNum)
            return 2;

        return 1;
    }

    // Task 10: Sum of last digit of two given numbers
    // tc is o(1) cause using break and sc is o(1).
    public int addLastTwoDigits(int input1, int input2) {
        int first = 0;
        int temp1 = Math.abs(input1);
        while (temp1 != 0) {
            first = temp1 % 10;
            break;
        }

        int sec = 0;
        int temp2 = Math.abs(input2);
        while (temp2 != 0) {
            sec = temp2 % 10;
            break;
        }

        int result = first + sec;

        return result;
    }

    public static void main(String[] args) {

    }

}
