package Week2;

public class Task5 {

    // Task 5. Is Palindrome (string) :
    // https://tests.mettl.com/authenticateKey/ffe8042
    // tc is o(n) and sc is O(1).
    public int isPalindrome(String input1) {
        int left = 0;
        int right = input1.length() - 1;

        while (left < right) {
            char c1 = Character.toLowerCase(input1.charAt(left));
            char c2 = Character.toLowerCase(input1.charAt(right));

            if (c1 != c2) {
                return 1; // Not a palindrome
            }
            left++;
            right--;
        }
        return 2; // Palindrome
    }

    public static void main(String[] args) {

    }

}
