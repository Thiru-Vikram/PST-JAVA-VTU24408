package Week5;

public class Task7 {

    // tc is o(n) and sc is o(1)
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] hash = new int[256]; // store last index+1 of each char
        int l = 0; // left pointer

        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);

            // if already seen and inside current window
            if (hash[c] > 0) {
                l = Math.max(l, hash[c]);
            }

            // update maxLength
            maxLength = Math.max(maxLength, r - l + 1);

            // store last index+1
            hash[c] = r + 1;
        }

        return maxLength;
    }

}
