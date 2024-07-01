class newEmployees{
    private int id;
    private String name;

    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
    
    public void setName(String m){
        name = m;
    }
    public String getName(){
        return name;
    }

    // Method overloading can be done in constructors. 
    public newEmployees(){
        id = 10;
        name = "This is your name";
    }
    
    // Constructors in Java, method as the class name.
    public newEmployees(String myName, int myId){
        id = myId;
        name = myName;
    }
}

public class ch9_access_mod {
    
    public static void main(String[] args) {
        // newEmployees manoj = new newEmployees();
        newEmployees manoj = new newEmployees("programming with manoj", 33);
        // manoj.setId(10);
        // manoj.setName("Manoj Shivaprakash");
        // System.out.println(manoj.getId());
        // System.out.println(manoj.getName());
        System.out.println(manoj.getId());
        System.out.println(manoj.getName());
        
    }
}
