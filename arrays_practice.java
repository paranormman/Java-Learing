public class arrays_practice {
    public static void main(String[] args) {
        
        // create a float array and add them
        /*
        float [] marks = {80.5f, 90.5f, 100f, 75.5f, 98.5f};
        float sum = 0;
        for(float element : marks){
            sum += element;
        }
        System.out.printf("The sum of the array is %.2f", sum);

        // Finding a number in an array.
        float [] marks = {80.5f, 90.5f, 100f, 75.5f, 98.5f};
        float num = 80.5f;
        boolean isInArray = false;
        for(float element : marks){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray == true){
            System.out.println("The number is in the Array");
        }
        else{
            System.out.println("The number is not in the Array");
        }


        // Average marks of the students in an Array using for-each loop
        int [] marks = {80, 90, 100, 75, 98};
        int avg = 0;
        for(int element : marks){
            avg = (avg + element);
        }
        System.out.println(marks.length);
        System.out.println("The avg of the students in Physics is "+ avg/marks.length);

        //program to add two 2x3 matrices
        int [][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] mat2 = {{2, 3, 1}, {6, 8, 1}};
        int [][] result = {{0, 0, 0}, {0, 0, 0}};
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


        // Reverse an Array
        int [] marks = {80, 90, 100, 75, 98};
        int tmp = 0;                    // initialize a temporary variable
        int l = marks.length;           //length of the array
        int n = Math.floorDiv(l, 2);  //gets the greatest integer "if result after dividing is 2.5 the value taken is 2"  
        for(int i = 0; i < n; i++){
            // |3| |4| | |
            tmp = marks[i];             //tmp stores the value in a[i]
            marks[i] = marks[l - i - 1];//a[i] stores the vlue in the last box a[l-i-1] 
            marks[l-i-1] = tmp;         //move the number bact to a[i] from tmp
        }
        for(int element : marks){
            System.out.print(element + " ");
        }

        // swap two numbers
        int a = 10;
        int b = 20;
        int tmp = 0;
        System.out.format("numbers before swapping %d, %d \n", a, b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.format("numbers after swapping %d, %d", a, b);


        // Max number in the array
        int [] arr1 = {80, 10, 50, 95, 28};
        int max = Integer.MIN_VALUE;
        for(int element : arr1){
            if(element > max){
                max = element;
            }
        }     
        System.out.println("The maximum value is " + max);


        // min number in an array
        int [] arr = {8, 10, 50, 95, 28};
        int min = Integer.MAX_VALUE;
        for(int element : arr){
            if(element < min){
                min = element;
            }
        }     
        System.out.println("The minimum value is " + min);

        // System.out.println(Integer.MIN_VALUE);  // -2147483648 value to find out Maximum num in an array
        // System.out.println(Integer.MAX_VALUE);  // -2147483648 value to find out Minimum num in an array
        
        */
        // Check if the given array is sorted
        Boolean isSorted = true;
        int [] arr = {1, 2, 4, 5, 6};
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}
