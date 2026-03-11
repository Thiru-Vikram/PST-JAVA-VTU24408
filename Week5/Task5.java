package Week5;

public class Task5 {

    public int myAtoi(String s) {

        s = s.trim();
        if (s.isEmpty())
            return 0;

        int sign = 1;
        long num = 0;
        int digit = 0;
        int i = 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            digit = s.charAt(i) - '0';
            num = (num * 10) + digit;

            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (num * sign);
    }
}