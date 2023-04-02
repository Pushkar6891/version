package com.company.junit5.utility;

import java.util.List;

public class ListUtility {

    public static int getMaxElement(List<Integer> numbers) {
        if (numbers.size() == 0 || numbers.isEmpty()) {
            return -1;
        }

        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}
