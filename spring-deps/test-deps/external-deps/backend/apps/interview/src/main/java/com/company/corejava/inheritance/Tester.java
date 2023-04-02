package com.company.springbootappinterview.corejava.inheritance;

class P {
    public P() {
        System.out.println("P()");
    }

    public void show() {
        System.out.println("P:show()");
    }
}

class C extends P {
    public C() {
        System.out.println("C()");
    }

    public void show() {
        System.out.println("C:show()");
    }
}

public class Tester {
    public static void main(String[] args) {

        P p1 = new P();
        System.out.println("******");
        p1.show();
        System.out.println("--------");
        P p2 = new C();
        System.out.println("******");
        p2.show();
        System.out.println("--------");
        C c1 = new C();
        System.out.println("******");
        c1.show();
        System.out.println("--------");
        //C c2 = (C) new P();
        //c2.show();

    }
}
