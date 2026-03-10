package Week4;

public class Task6 {

    // tc is o(n), sc is o(1)
    public void moveZeroes(int[] array) {
        int j = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
    }

}
