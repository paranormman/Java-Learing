/* interface is creating methods with empty bodies which must be used in the classes that is created subsequently, many interfaces
can be declared in a class. 
 */

interface bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface blowHorn{
    void blowTune();
    void blowTrumpet();

}

interface mySample extends bicycle{
    void meth1();
} 

//Interfaces can be inherited but all the methods should be implemeted in the class 

class mySampleClass implements mySample{
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Increasing the Speed");
    }
    public void meth1(){
        System.out.println("Increasing the Speed");
    }
} 

class avonCycle implements bicycle, blowHorn{
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Increasing the Speed");
    }

    public void blowTune(){
        System.out.println("This a tune of horn");
    }
    public void blowTrumpet(){
        System.out.println("This is another tune");
    }
}

public class ch11_interfaces {
    public static void main(String[] args) {
        avonCycle cycle = new avonCycle();
        cycle.applyBreak(10);
        // you can create properties in interfaces
        System.out.println(cycle.a);
        // you can not modify the properties in interfaces
        // cycle.a = 13;

        cycle.blowTrumpet();
        cycle.blowTune(); 

        
    }
}
