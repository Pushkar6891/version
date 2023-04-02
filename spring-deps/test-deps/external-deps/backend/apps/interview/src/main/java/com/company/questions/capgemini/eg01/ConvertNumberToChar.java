package com.company.questions.capgemini.eg01;

public class ConvertNumberToChar {
    public static void main(String[] args) {
        ConvertNumberToChar obj = new ConvertNumberToChar();
        System.out.println(obj.convertNumberToChar("a2b3c4a3"));
        System.out.println(obj.runLengthEncoding("aabbbccccaaa"));
    }

    private String convertNumberToChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                result += str.charAt(i);
            } else {
                int a = Character.getNumericValue(str.charAt(i));
                for (int j = 1; j < a; j++) {
                    result += str.charAt(i - 1);
                }
            }
        }
        return result;
    }

    private String runLengthEncoding(String inputString) {
        String outputString = "";

        int count = 1;
        for (int i = 0; i < inputString.length(); i++) {

            // resetting to 1 for every new character (counting current character).
            count = 1;
            while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
                i++;
            }
            outputString = outputString + inputString.charAt(i) + count;
        }
        // System.out.println("Input data string : " + inputString);
        return outputString;
    }

}
