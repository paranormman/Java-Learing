public class var_args {

    // Variable Argument (VarArgs)
    // static int sum(int a, int b){
    //     return a + b;
    // }
    // static int sum(int a, int b, int c){
    //     return a + b + c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }
    // static int sum(int ...arr){
    //     // Available as an Array[] instead of method overloading we can use array to store all values
    //     int result = 0;
    //     for(int a : arr){
    //         result += a;
    //     }
    //     return result;
    // }

    // // Recursive function
    // static int factorial(int n){
    //     // factorial (n) = n * (n - 1) * ..... * 1
    //     // factorial (5) = 5 * 4 * 3 * 2 * 1
    //     // factorial (n) = n * factorial(n - 1)
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }
    //     else{
    //         return n * factorial(n - 1);
    //     }
    // }
    
    // // factorial using Iterative method
    // static int factorial_iterative(int n){
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }
    //     else{
    //         int product = 1;
    //         for(int i =1; i<=n; i++){
    //             product *= i;
    //         }
    //         return product;
    //     }
    // }

    // Fibonacci Series using recursion
    static int series(int n){
        /*
        // To print the entire fibonacci series
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        */
        if(n == 1 || n == 2){
            return n-1;
        }
        else{
            return series(n - 1) + series(n - 2);
        }
    }

    public static void main(String[] args) {
        // // Variable Arguments (VarArgs)
        // System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        // System.out.println("The sum of 4, 3 and 5 is: " + sum(4,5, 6));
        // System.out.println("The sum of 2, 4, 3 and 5 is: " + sum(2, 4, 5, 6));

        // //Factorial using Recursive function 
        // System.out.format("The factorial of the number is %d \n", factorial(4));
        // System.out.format("The factorial of the number is %d\n", factorial_iterative(4));

        // fibonacci series
        int n = 3;
        System.out.format("Fibonacci Series : %d", series(n));
        
        // To print all the numbers in the fibonacci series
        // for(int i = 0; i <= n; i++){ 
        //     System.out.print(series(i) + " ");
        // }
    }
}
