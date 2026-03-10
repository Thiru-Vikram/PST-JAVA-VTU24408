package Week4;

import java.util.*;

public class Task3 {

    static int[] compareTriplets(int[] a, int[] b) {
        int[] result = new int[2];
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i])
                result[0]++;
            else if (a[i] < b[i])
                result[1]++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < 3; i++)
            b[i] = sc.nextInt();

        int[] result = compareTriplets(a, b);
        System.out.println(result[0] + " " + result[1]);
    }
}
