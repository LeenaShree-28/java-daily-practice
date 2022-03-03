package inheritance.hybridinheritance;

public class ClassD  extends ClassA implements InterfaceB, InterfaceC { // classD implement both interfaces and extend classA

    @Override
    public void show() {
        System.out.println("show() method implementation");
    }

    public void fun() {
        System.out.println("fun() method of ClassD");
    }

    public static void main(String[] args) {
        ClassD c = new ClassD();
        c.fun();
        c.show();
        c.display();
    }

    // In this case we didn’t have ambiguity even though both the interfaces are having same method.
}
