import java.util.Scanner;

public class ch14_errorsdemo {
    public static void main(String[] args) {
         
        // SYNTAX ERROR
        // int a = 10 --> Error: Semicolon not inserted
        // b = 10; --> Error: variable not declared

        // LOGICAL ERROR
        // we get 2, 3, 5, 9, 11, 13 where 9 is not a prime number but it is in the output. 
        // System.out.println(2);
        // for(int i = 1; i < 7; i++){
        //     System.out.println(2 * i + 1);
        // }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("The quotient of 1000 divided by k is " + 1000/k);

    }
}
