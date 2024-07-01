package calci;
import java.util.*;

class calculator{
    public void calculate(int a, int b){
        System.out.println("The sum of two numbers " + (a+b));
    }
}

class Sccalculator{
    public void calculate(int a, int b){
        System.out.println("The sum of two numbers " + Math.sin(a+b));
    }
}

class Hycalculator{
    public void calculate(int a, int b){
        System.out.println("The sum of two numbers " + Math.sin(a+b));
        System.out.println("The sum of two numbers " + (a+b));
    }
}
public class ch12_problem {
    public static void main(String[] args) {
        Scanner ec = new Scanner(System.in);
        System.out.println("Please Enter a number ");
        int x = ec.nextInt();
        System.out.println("The number you entered is " + x); 
        System.out.println("I am a Method");
        Sccalculator sc = new Sccalculator();
        sc.calculate(10, 12);
        Hycalculator hy = new Hycalculator();
        hy.calculate(2, 4);
    }
}
