package company.questions.wissen.eg11String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringInArray {
    public static void main(String[] args) {
        LongestStringInArray obj = new LongestStringInArray();
        String str = "Honesty is the best policy, All the power is within you.";
        System.out.println(obj.findLongestString(str));
        System.out.println(obj.findLongestStringLength(str));
    }

    public String findLongestString(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        return list.stream().max(Comparator.comparingInt(String::length)).get();
    }

    public int findLongestStringLength(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        return list.stream().map(String::length).max(Integer::compareTo).get();
    }
}


