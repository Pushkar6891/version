package com.company.eg004.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws IOException {
        int n1, n2, result;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter n1");
        n1 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter n2");
        n2 = Integer.parseInt(bufferedReader.readLine());

        result = n1 + n2;
        System.out.println("Result : " + result);
    }
}
