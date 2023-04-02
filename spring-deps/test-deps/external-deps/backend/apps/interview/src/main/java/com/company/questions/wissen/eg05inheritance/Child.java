package company.questions.wissen.eg05inheritance;

public class Child extends Parent {
    public void walk(){
        System.out.println("Child walk");
        super.walk();

    }

    public void run(){
        System.out.println("Child run");
        super.run();
    }
}
