package Week4;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int half = n / 2;

            int[] freq = new int[26];
            for (int i = 0; i < half; i++)
                freq[s.charAt(i) - 'a']++;
            for (int i = n - half; i < n; i++)
                freq[s.charAt(i) - 'a']--;

            boolean lapindrome = true;
            for (int f : freq)
                if (f != 0) {
                    lapindrome = false;
                    break;
                }

            System.out.println(lapindrome ? "YES" : "NO");
        }
    }
}
