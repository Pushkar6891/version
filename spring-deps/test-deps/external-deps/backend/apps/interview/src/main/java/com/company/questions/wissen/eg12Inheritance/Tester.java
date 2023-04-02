package company.questions.wissen.eg12Inheritance;

public class Tester {
    public static void main(String[] args) {
        Parent p = new Child();
        p.run();
        p.walk();
    }
}

class Parent {
    public void run() {
        System.out.println("Parent run");
        walk();
    }

    public void walk() {
        System.out.println("Parent walk");
    }
}

class Child extends Parent {
    public void run() {
        System.out.println("Child run");
        super.run();
    }

    public void walk() {
        System.out.println("Child walk");
        super.walk();
    }
}