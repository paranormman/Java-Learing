import java.util.InputMismatchException;
import java.util.Scanner;

public class ch14_try_meth {
    public static void main(String[] args) {

        // General Exception handling
        // int k;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number you want to divide");
        // k = sc.nextInt();
        // // This is without using try catch method
        // // System.out.println("The quotient of 1000 divided by k is " + 1000/k);

        // // This is using Try catch
        // try{
        //     System.out.println("The quotient of 1000 divided by k is " + 1000/k);
        // }
        // catch(Exception e){
        //     System.out.println("The number you have entered can not be used to divide");
        //     System.out.println(e);
        // }
        // System.out.println("This is a end of the program");

        // Handling specific Exceptions
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array index value that you need to divide ");
        int ind = sc.nextInt();

        System.out.println("Enter the number from which you need to divide ");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is " + marks[ind]);
            System.out.println("The value at array-Value/number is " + marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("We encountered an Arithmetic Exception!");
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("We encountered an IndexOutOfBoundsException Exception");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("We encountered an other Exception");
            System.out.println(e);
        }

        
    }
}
