package com.company.codingquestions.codingques001;

/*
  Java program to print all words that have the same unique character set
 */

import java.util.Arrays;

public class GroupingWordsTester {

    public void wordsWithSameSetOfCharacters(String[] words) {
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].length() == 0) {
                continue;
            }
            boolean[] charSet1 = new boolean[26];
            for (int l = 0; l < words[i].length(); l++) {
                charSet1[words[i].charAt(l) - 'a'] = true;
            }
            for (int j = i; j < n; j++) {
                boolean[] charSet2 = new boolean[26];
                for (int l = 0; l < words[j].length(); l++) {
                    charSet2[words[j].charAt(l) - 'a'] = true;
                }
                if (Arrays.equals(charSet2, charSet1)) {
                    System.out.print(words[j] + ", ");
                    words[j] = "";
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GroupingWordsTester groupingWords = new GroupingWordsTester();
        String[] words = {"may", "student", "students", "dog", "god", "cat", "act", "tab", "bat", "flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle"};
        groupingWords.wordsWithSameSetOfCharacters(words);
    }
}
