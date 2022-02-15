/**
 * @author Luís Araújo
 */
public class OneMoreTest {
    public static void main(String[] args) {
        A2.print();
        B2.print();
        C2.print();
        C2 inst = new C2();
        inst.print2();
    }

    static class A2 {
        public static void print() {
            System.out.print("A␣");
        }
    }

    static class B2 extends A2 {
        public static void print() {
            System.out.print("B␣");
        }
    }

    static class C2 extends B2 {
        public void print2() {
            System.out.print("C␣");
        }
    }
}
