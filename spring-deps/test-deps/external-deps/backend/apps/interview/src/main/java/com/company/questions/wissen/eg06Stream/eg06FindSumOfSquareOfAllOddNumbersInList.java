package company.questions.wissen.eg06Stream;

import java.util.Arrays;
import java.util.List;

public class eg06FindSumOfSquareOfAllOddNumbersInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // 1 + 4 + 9 + 16 + 25 = 55
        // 1 + 9 + 25 = 35
        int sum = list.stream().filter(n -> n % 2 != 0).mapToInt(n -> n * n).sum();
        System.out.println(sum);
        System.out.println();
        list.stream().forEach(System.out::println);
    }
}
