// package vestachrono;

abstract class Parent1{
    public Parent1(){
        System.out.println("This is a constructor of parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void switchOff();
}

class Child1 extends Parent1{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void switchOff(){
        System.out.println("This is a new ringtone display");
    }
}

abstract class Child2 extends Parent1{
    public void nh(){
        System.out.println("I am good"); // You need to override the greet methid so as to keep the class non abstract.
    }
}


public class ch11_abstract {
    public static void main(String[] args) {
        // Parent1 p = new Parent1(); // can not create an object as it is an abstract class
        Child1 c = new Child1();   // can create an object as it is a concrete class
        // Child2 c2 = new Child2();  // can not create an object as it is an abstract class
        c.switchOff();
    }
}
