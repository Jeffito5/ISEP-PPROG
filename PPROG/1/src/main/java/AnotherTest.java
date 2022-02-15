/**
 * @author Luís Araújo
 */
public class AnotherTest {
    public static void main(String[] args) throws Exception {
        B obj = new B();
        obj.j = 2;
        obj.display();
    }
}

class A {
    int i;

    void display() {
        System.out.println(i);
    }

}

class B extends A {
    int j;

    void display() {
        System.out.println(j);
    }
}

class teste123 implements TesteInterface, TesteInterface2 {
    /*public void metodo() {
        System.out.println("Hello␣world!");
    }*/
    /*int var1 ;
    public teste123(){
        var1 = a + b ;
    }*/
}

class A6 {
    private int intVar=10;
    public void metodo(){
        System.out.println("IntVar: " + intVar);
    }
}

