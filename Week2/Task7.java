package Week2;

import java.time.LocalDate;

public class Task7 {

    // Task 7: https://www.hackerrank.com/challenges/java-date-and-time/problem
    // tc is o(1) and sc is o(1)
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {

    }
}
