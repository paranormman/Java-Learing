import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class ch14_quick_catch {
    public static void main(String[] args) {
        // Nested Try catch block
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter a index number");
            int ind = sc.nextInt();
            try{
                System.out.println("This is an outer Try");
                try{
                System.out.println("The index value is " + marks[ind]);
                flag = false;    
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("We have encountered an IndexOutOfBoundsException!");
                    System.out.println("This is a second level Exception!");
                }
            }
            catch(Exception e){
                System.out.println("This is a first level Exception");
            }
        }
        System.out.println("Thank you for using the program");
    }
}
