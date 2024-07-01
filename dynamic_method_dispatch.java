class phone{
    public void showTime(){
        System.out.println("Time is 8 AM");
    }

    public void on(){
        System.out.println("Powering on Phone...");
    }
}

class smartPhone extends phone{
    public void music(){
        System.out.println("Playing music on SmartPhone...");
    }
    @Override
    public void on(){
        System.out.println("Powering on Smart Phone...");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        
        // phone p = new phone();
        // p.showTime();

        smartPhone sp = new smartPhone();
        // sp.showTime();

        phone obj = new smartPhone(); // it is allowed
        obj.showTime(); // allowed as it is a reff of parent class
        obj.on(); //prints overrided method as object is created for smart phone 
        // obj.music(); // can not be called as this method is exclusively created in child class which needs an object of itself 
        sp.music(); // this can be called
        
    }
}
