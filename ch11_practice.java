// package vestachrono;
/*
// Question 1 and 2
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}
*/
/*
 // question 3 and 5
interface basicAnimals{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Monkeys jump");
    }
    void bite(){
        System.out.println("Monkeys bite");
    }
}

class Humans extends Monkey implements basicAnimals{
    public void eat(){
        System.out.println("Humans Eat for a living");
    }
    public void sleep(){
        System.out.println("All Animals sleep");
    }
}
 */

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelePhone{
    void ring(){
        System.out.println("You have a call from, ringing...");
    }
    void lift(){
        System.out.println("Please lift the call");
    }
    void disconnect(){
        System.out.println("The call is disconnected");
    }
}

interface TVremote{
    void powerOn();
    void powerOff();
}

interface SmartTVremote{
    void voicAssistant();
    void OttChanels();
}

class TV implements TVremote{
    public void powerOn(){
        System.out.println("Power on the TV");
    }
    public void powerOff(){
        System.out.println("Power off the TV");
    }
}

public class ch11_practice {
    public static void main(String[] args) {
        // fountainPen pen = new fountainPen();
        // pen.changeNib();
        // pen.write();

        // Monkey bs = new Humans();
        // bs.bite();

        SmartTelePhone phone = new SmartTelePhone(); 
        phone.disconnect();

        TV obj1 = new TV();
        obj1.powerOn();
    }
}
