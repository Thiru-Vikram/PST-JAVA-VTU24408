package Week2;

public class Task8 {

    // Task 8:Weight of a hill pattern:
    // https://tests.mettl.com/authenticateKey/d612c0e6
    // tc is o(n) and sc is o(1).
    public int totalHillWeight(int input1, int input2, int input3) {
        int totalWeight = 0;

        for (int level = 1; level <= input1; level++) {
            int weightPerStar = input2 + (level - 1) * input3;
            totalWeight += level * weightPerStar;
        }

        return totalWeight;
    }

    public static void main(String[] args) {

    }

}
