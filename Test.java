/**
 * Test

interface Car{
    void engine();
    void clutch();
}

interface Exterior extends Car{
    void chasis();
    void windShield();
}

class newCar implements Exterior{
    public void engine(){
        System.out.println("The Car has a V-8 Engine");
    }
    public void clutch(){
        System.out.println("This car has a Clutch plate");
    }
    public void chasis(){
        System.out.println("The Chasis number is XXXX-3452");
    }
    public void windShield(){
        System.out.println("The Windshield is Thoughned Glass");
    }
    
}
 */

// class nextCar extends newCar



public class Test {
    int marks[];
    int length;
    int capacity;
    public Test(int capacity){
        this.capacity = capacity;
        this.length = 0;
        this.marks = new int[this.capacity];
    }

    public int getI(int i){
        return marks[i];
    }
    
    public int setI(int i, int n){
        return marks[i] = n;
    }
    
    public void pushback(int n){
        if(length == capacity){
            resize();
        }
        marks[length] = n;
        length++;
    }

    private void resize(){
        capacity *= 2;
        int[] newMarks = new int[capacity];
        for(int i = 0; i < length; i++){
            newMarks[i] = marks[i];
        }
        marks = newMarks;
    }

    public static void main(String[] args) {

        Test sc = new Test(3);
        // sc.getI(1);
        System.out.println(sc.getI(2));
        System.out.println(sc.setI(1, 23));
        
        // newCar cs = new newCar();
        // cs.engine();
        // cs.clutch();

        // computer cs = new computer();
        // cs.setName("Manasa");
        // System.out.println(cs.getName());
        

    }
}