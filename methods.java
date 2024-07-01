public class methods {


    // Method overloading
    // Same name but with different parameters
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }

    // using void return type
    // void tellJoke(){
    static void tellJoke(){
        System.out.println(" This is a joke ");
    }

    static void change(int [] arr){
        arr[0] = 90;
    }
    
    // find greatest of two numbers an example
    static int logic(int x, int y){
    // int logic(int x, int y){
        int z;
        if (x > y) {
            z = x + y;
        }
        else{
            z = (x + y)*5;
        }
        return z;
    }

    // Sum of two numbers
    static int sum(int l, int m){
        return l + m;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        // methods obj = new methods();  //Method invocation using object createaion
        // int c = obj.logic(a, b);
        int c = logic(a, b);
        System.out.println(c);

        int a1 = 1;
        int b1 = 6;
        // int c1 = obj.logic(a1, b1);    //Method invocation using object createaion
        // int c1 = obj.logic(a1, b1);
        int c1 = logic(a1, b1);
        System.out.println(c1);

        // int p = 100;
        // int q = 500;
        // int r = sum(100, 600);
        System.out.println(sum(100, 500));  //do not have to initialize a variable

        // printing the value in void return type
        // methods obj = new methods();     //Method invocation using object createaion
        // obj.tellJoke();
        tellJoke();

        //array will be reference of the same array declared so the value will be changed
        int [] marks = {10, 20, 30, 40, 50};
        change(marks);
        System.out.println(marks[0]);

        // Method Overloading
        foo();
        foo(3000);
    }
}
