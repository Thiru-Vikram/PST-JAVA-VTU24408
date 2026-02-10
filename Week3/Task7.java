package Week3;

class Task7 {

    public int NthPrime(int input1) {

        if (input1 == 1)
            return 2;

        int count = 1;
        int candidate = 3;

        while (count < input1) {
            if (isPrime(candidate)) {
                count++;
            }
            if (count < input1) {
                candidate += 2;
            }
        }

        return candidate;
    }

    private boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
