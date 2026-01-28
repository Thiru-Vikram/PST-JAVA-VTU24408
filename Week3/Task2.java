package Week3;

import java.util.*;

public class Task2 {

    // tc is o(n) and sc is o(1)
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Generate all substrings of length k and compare
        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            // Compare lexicographically
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}