public class DivisibleSumPairs {

    public static void main(String[] args) {

    }

    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = ar[i];
            if (i == n - 1)
                break;
            for (int j = i + 1; j < n; j++) {
                if (i < j && (num + ar[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
