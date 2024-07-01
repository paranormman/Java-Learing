class base{
    int x;
    base(){
        System.out.println("this is a base constructor");
    }
    // constructor overloading
    base(int x){
        System.out.println("This is a overloaded base constructor with a value of a: "+ x);
    }
}

class derived extends base{
    int y;
    derived(){
        // use super keyword to call the constructor with arguments, by default it takes base constructor
        // super(x);
        System.out.println("This is a derived constructor");
    }
    derived(int x, int y){
        super(x);
        System.out.println("This is a overloaded derived constructor with a value of y: "+ y);
    }
}

class subClass extends derived{
    int z;
    subClass(){
        System.out.println("This is a subclass constructor");
    }
    
    subClass(int x, int y, int z){
        super(x, y);
        System.out.println("This is a overloaded subclass constructor with a value of z: "+ z);
    }
}

public class ch10_inheritance {
    public static void main(String[] args) {
        // subClass sc = new subClass();
        // sc.setX(10);
        // sc.setZ(15);
        // System.out.println(sc.sumNum());
        // derived d = new derived();
        // d.setX(14);
        // d.setY(10);
        // System.out.println(d.mulVal());
        subClass sub = new subClass(2, 3, 4);

        
    }
}
