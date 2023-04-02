package com.company.javafullcourse;

public class Eg22Methods {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String brand = "Apple";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("A"));
        System.out.println(brand.endsWith("A"));
        System.out.println(brand.contains("l"));

        char[] letters = {'A', 'p', 'p', 'l', 'e'};
        char searchKey = 'p';
        System.out.println(countLetterOccurrence(letters, searchKey));
    }

    public static int countLetterOccurrence(char[] letters, char searchKey) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchKey) {
                count++;
            }
        }
        return count;
    }
}
// built in method
// user defined methods