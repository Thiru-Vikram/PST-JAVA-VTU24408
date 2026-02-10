package Week3;

class Task10 {

    public int AddSub(int input1, int input2) {

        int N = input1;
        int opt = input2;

        int result = N;

        if (opt == 1) {

            boolean subtract = true;

            for (int i = N - 1; i >= 1; i--) {
                if (subtract) {
                    result -= i;
                } else {
                    result += i;
                }
                subtract = !subtract;
            }
        } else if (opt == 2) {

            boolean add = true;

            for (int i = N - 1; i >= 1; i--) {
                if (add) {
                    result += i;
                } else {
                    result -= i;
                }
                add = !add;
            }
        }

        return result;
    }
}