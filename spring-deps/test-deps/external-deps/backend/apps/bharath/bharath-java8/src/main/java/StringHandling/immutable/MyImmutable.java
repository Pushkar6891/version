package StringHandling.immutable;

public class MyImmutable {
    int x;

    MyImmutable(int x) {
        this.x = x;
    }

    public MyImmutable change(int x) {
        if (this.x == x) {
            return this;
        } else {
            return new MyImmutable(x);
        }
    }

    public static void main(String[] args) {
        MyImmutable m1 = new MyImmutable(10);
        MyImmutable m2 = m1.change(10);
        MyImmutable m3 = m2.change(20);

        System.out.println(m1 == m2);
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));

        System.out.println(m2 == m3);
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());
        System.out.println(m2.equals(m3));
    }
}
