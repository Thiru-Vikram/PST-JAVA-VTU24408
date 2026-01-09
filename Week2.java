import java.util.*;

interface performOperation {
    boolean check(int num);
}

public class Week2 {

    // Session 1
    // https://www.hackerrank.com/challenges/java-lambda-expressions/problem
    public static performOperation isOdd() {
        return (int n) -> {
            if (n % 2 != 0)
                return true;
            return false;
        };
    }

    public static performOperation isPrime() {
        return (int n) -> {
            if (n <= 1)
                return false;
            if (n == 2)
                return true;
            if (n % 2 == 0)
                return false;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    public static performOperation isPalindrome() {
        return (int n) -> {
            String str = String.valueOf(n);
            String revStr = new StringBuilder(str).reverse().toString();
            if (str.equals(revStr)) {
                return true;
            }
            return false;
        };
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int testCase = scan.nextInt();
            int num = scan.nextInt();

            performOperation obj;

            if (testCase == 1) {
                obj = isOdd();
                System.out.println(obj.check(num) ? "ODD" : "EVEN");
            } else if (testCase == 2) {
                obj = isPrime();
                System.out.println(obj.check(num) ? "PRIME" : "COMPOSITE");
            } else if (testCase == 3) {
                obj = isPalindrome();
                System.out.println(obj.check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }

        scan.close();
    }

}
