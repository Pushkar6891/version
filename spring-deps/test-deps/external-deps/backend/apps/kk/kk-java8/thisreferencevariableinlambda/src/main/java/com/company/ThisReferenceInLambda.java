package com.company;

public class ThisReferenceInLambda {

    public void process() {
        doOperate(30, n -> {
            System.out.println(30 + n);
            System.out.println(this);
        });

    }

    public static void main(String[] args) {
        int b = 90;
        ThisReferenceInLambda.doOperate(b, n -> {
            System.out.println(b + n);
            // System.out.println(this);
        });
        new ThisReferenceInLambda().process();
    }

    private static void doOperate(int i, Operation o) {
        o.operate(i);
    }
}
