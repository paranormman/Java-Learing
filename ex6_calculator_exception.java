import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Please Input a Valid Number other than 8 or 9";
    }
    @Override
    public String getMessage() {
        return "Please Input a Valid Number other than 8 or 9";
    }
}

class DivideZeroException extends Exception{
    @Override
    public String toString() {
        return "A Number Can not be divided by Zero";
    }
    @Override
    public String getMessage() {
        return "A Number Can not be divided by Zero";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input Number can not be greater than 10000";
    }
    @Override
    public String getMessage() {
        return "Input Number can not be greater than 10000";
    }
}

class MaxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "Multiplier can not be greater than 7000";
    }
    @Override
    public String getMessage() {
        return "Multiplier can not be greater than 7000";
    }
}
/**
 * This is to demonstrate how javadocs work and how the docs are created
 * @author Manoj Shivaprakash
 * @version 1.0
 * @since 2023
 * @see <a href = "https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/List.html" target = "_blank_"> Java DOcs </a>
 */


public class ex6_calculator_exception {

    public static int addition(int a, int b) throws InvalidInputException{
        if(a == 8 || b == 9){
            throw new InvalidInputException();
        }
        int sumResult = a + b; 
        return sumResult;
    }
    
    public static int subtraction(int a, int b) throws InvalidInputException{
        int difResult = a - b;
        return difResult;
    }
    
    public static int division(int a, int b) throws InvalidInputException, DivideZeroException,MaxInputException{
        if(b >= 10000){
            throw new MaxInputException();
        }
        if(b == 0){
            throw new DivideZeroException();
        }
        else{
            int quoResult = a / b;
            return quoResult;
        }
        
    }
    
    public static int multiplication(int a, int b) throws InvalidInputException, MaxMultiplierException, MaxInputException{
        if(b >= 7000){
            throw new MaxMultiplierException();
        }
        if(a >= 10000){
            throw new MaxInputException();
        }
        else{
        int productResult = a * b;
        return productResult;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("This is Addition of two numbers");
            System.out.println("enter number a");
            int a = sc.nextInt();
            System.out.println("Enter number b");
            int b = sc.nextInt();   
            int x = addition(a, b);
            System.out.println("The sum of numbers " + a + " and " + b + " is " + x);
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
        
        try{
            System.out.println("This is Subtraction of two numbers");
            System.out.println("enter number a");
            int a = sc.nextInt();
            System.out.println("Enter number b");
            int b = sc.nextInt(); 
            int y = subtraction(a, b);
            System.out.println("The Difference of numbers " + a + " and " + b + " is " + y);
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }

        try{
            System.out.println("This is Division of two numbers");
            System.out.println("enter number a");
            int a = sc.nextInt();
            System.out.println("Enter number b");
            int b = sc.nextInt(); 
            int z = division(a, b);
            System.out.println("The Quotient of numbers " + a + " and " + b + " is " + z);
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
        catch(MaxInputException e){
            System.out.println(e);
        }
        catch(DivideZeroException e){
            System.out.println(e);
        }

        try{
            System.out.println("This is Multiplication of two numbers");
            System.out.println("enter number a");
            int a = sc.nextInt();
            System.out.println("Enter number b");
            int b = sc.nextInt(); 
            int d = multiplication(a, b);
            System.out.println("The Product of numbers " + a + " and " + b + " is " + d);
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
        catch(MaxInputException e){
            System.out.println(e);
        }
        catch(MaxMultiplierException e){
            System.out.println(e);
        }
        
    }
}
