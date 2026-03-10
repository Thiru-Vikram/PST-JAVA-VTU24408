package Week4;

import java.util.*;

public class Task5 {

    static String timeConversion(String s) {
        String period = s.substring(s.length() - 2); // AM or PM
        String[] parts = s.substring(0, s.length() - 2).split(":");

        int hour = Integer.parseInt(parts[0]);

        if (period.equals("AM")) {
            hour = (hour == 12) ? 0 : hour;
        } else {
            hour = (hour == 12) ? 12 : hour + 12;
        }

        return String.format("%02d:%s:%s", hour, parts[1], parts[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(timeConversion(sc.next()));
    }
}
