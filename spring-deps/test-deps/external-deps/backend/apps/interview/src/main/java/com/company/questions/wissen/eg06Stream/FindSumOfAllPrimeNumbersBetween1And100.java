package company.questions.wissen.eg06Stream;

import java.util.stream.IntStream;

public class FindSumOfAllPrimeNumbersBetween1And100 {
    public static void main(String[] args) {
        FindSumOfAllPrimeNumbersBetween1And100 obj = new FindSumOfAllPrimeNumbersBetween1And100();
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            boolean result = obj.isPrime(i);
            if (result) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public boolean isPrime(int n) {
        return n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);
    }
}
