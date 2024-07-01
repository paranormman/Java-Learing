import java.util.Scanner;

class Myclass extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return  "This is a negative value exception";
    }
}

public class ch14_custom_excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num < 9){
            try{
                throw new Myclass();
                // throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
        } 
        System.out.println("The process is finished");
        
    }
}
