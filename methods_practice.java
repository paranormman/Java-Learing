import java.util.Scanner;

public class methods_practice {

    // Multiplication using Methods(function)
    static void multi(int m){
        for(int i = 1; i <= 10; i++){
            System.out.format("%d x %d = %d\n", m, i, m*i);
        }
    }

    // Ascending Pyramid
    static void ascending(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ascending Pyramid using recursion
    static void ascending_rec(int n){
        if(n > 0){
            ascending_rec(n - 1);
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // Decending Pyramid
    static void decending(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void descending_rec(int n){
        if(n > 0){
            // descending_rec(n);
            for(int j = n; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // sum of first n Natural numbers
    static int sum(int n){
        int result = 0;
        result = (n * (n + 1)) / 2;
        // System.out.println(result);
        return result;
    }

    // sum of first n Natural numbers using Arguments
    static float sumArgs(float a, float b, float c, float d){
        return (a + b + c + d)/4f;
    }

    //Sum of n natural numbers using recursion 
    // Sum(n) = n + n+1 + n+2 + .... + n-1 + n
    // Sum(n) = Sum(n - 1) + n
    // Sum(3) = 3+2+1
    static int sumRec(int n){
        // base condition
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

    // Fibonacci Series using recursion
    static void series(int n){
        if(n == 0){
            System.out.println(0);
            // return 0;
        }
        else if(n == 1){
            // return 1;
            System.out.println(1);
        }
        else{
            int fib = 0;
            fib = (n - 1) + (n - 2);
            System.out.println(fib);
        }

    }
    
    // converting temperature from C to F
    static void temp(float c){
        float f = 0;
        f = (c * 1.8f) + 32;
        System.out.format("Temperature from %.2f°C to °F is %.2f°F", c, f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Multiplication using Methods(function)
        System.out.print("Enter the number you need multiple tale of: ");
        int x = sc.nextInt();
        multi(x);

        // Ascending Pyramid
        // ascending(8);

        // Ascending Pyramid using recursion
        // ascending_rec(3);

        // sum of first n Natural numbers
        // System.out.println(sum(3));

        // Decending Pyramid
        // decending(4);

        // descending_rec(3);

        // Fibonacci Series using recursion
        // int n = 4;
        // System.out.println("Fibonacci Series :");
        // for(int i = 0; i <= n; i++){
        //     series(i);
        // }

        // converting temperature from C to F
        // temp(32);

        // sum of first n Natural numbers using Arguments
        // System.out.println("The Average of 2, 4, 3 and 5 is: " + sumArgs(2, 4, 3, 6));

    }
    
}
