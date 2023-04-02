package com.company.questions.hcl.eg16Polymorphism;

public class ImportantTester {
    public static void main(String[] args) {
        P p = new C();
        p.display();
    }
}

class P {
    void display() {
        System.out.println("P display()");
    }
}

class C extends P {
     void display() {
        System.out.println("C display()");
    }
}
