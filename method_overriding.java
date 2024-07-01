class A{
    int a;
    public int manoj(){
        return a;
    }
    public void meth2(){
        System.out.println("This is a method 2 of class A");
    }
}

class B extends A{
    // Method Overriding.
    @Override
    public void meth2(){
        System.out.println("This is a method 2 of class B");
    }

    public void meth3(){
        System.out.println("This is a method 3 of class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
        
    }
}
