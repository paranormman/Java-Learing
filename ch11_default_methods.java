// package vestachrono;

interface myCamera{
    void takeSnap();
    void recordVideo(); 
    private void greet(){
        System.out.println("Good Morining");
    }
    default void record4K(){
        greet();
        System.out.println("Recording in 4K"); // we can also override in the class
    }
}

interface myWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling..."+ phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting...");
    }
}

class mySmartPhone extends myCellPhone implements myWifi, myCamera{
    public void takeSnap(){
        System.out.println("taking a Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetwork(){
        System.out.println("Getting List of Networks");
        String[] networklist = {"Manumanas5G","MyJio4G","Unidentified"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to network" + network);
    }
    // public void record4K(){
    //     System.out.println("Take snap and recording in 4K...");
    // }
}

public class ch11_default_methods {
    public static void main(String[] args) {
        // mySmartPhone ms = new mySmartPhone();
        // String[] ar = ms.getNetwork();
        // for (String item : ar) {
        //     System.out.println(item);
        // }
        // ms.record4K();
        // ms.greet(); //Throws an error as it is in Private access modifier
        myCamera cam1 = new mySmartPhone();
        cam1.takeSnap();
        myWifi wif = new mySmartPhone();
        wif.connectToNetwork("Manumanas5G");
    }
}
