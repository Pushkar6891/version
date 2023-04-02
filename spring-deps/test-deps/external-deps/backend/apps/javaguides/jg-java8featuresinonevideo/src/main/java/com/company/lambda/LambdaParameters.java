package com.company.lambda;

public class LambdaParameters {
    public static void main(String[] args) {
        Addable addable = (a, b) -> (a + b);
        System.out.println(addable.add(10, 20));

        Addable addableWithMultipleStatements = (a,b) -> {
            int c = a + b;
            return c;
        };
        System.out.println(addableWithMultipleStatements.add(10,20));
    }
}

interface Addable {
    int add(int a, int b);
}
