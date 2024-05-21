interface I1 {}
interface I2 {}
interface I3 extends I1, I2 {}
interface I4 {}
class X implements I3 {}
class W extends X implements I4 {}

public class pract5_2 {
    public static void main(String[] args) {
        W w = new W();

        System.out.println("w instanceof I1: " + (w instanceof I1));

        System.out.println("w instanceof I2: " + (w instanceof I2));

        System.out.println("w instanceof I3: " + (w instanceof I3));

        System.out.println("w instanceof I4: " + (w instanceof I4));

        System.out.println("w instanceof X: " + (w instanceof X));
    }
}
