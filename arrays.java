public class arrays {
    public static void main(String[] args) {
        
        // Array declaration types

        // int [] marks;
        // marks = new int[4];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // System.out.println(marks[2]);

        // int [] marks = new int[5];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // marks[4] = 50;
        // System.out.println(marks[3]);

        // int [] marks = {10, 20, 30, 40, 50};
        // System.out.println(marks[6]);
        // System.out.println(marks.length);

        // Printing using for-each loop
        // for(int element : marks){
        //     System.out.println(element);
        // }

        // Printing the array using for loop
        // for(int i = 0; i < marks.length; i++){
        //     System.out.println(marks[i]);
        // }

        //Printing arrays using for loop in reverse order
        // System.out.println("printing arrays in reverse order");
        // for(int i = marks.length - 1; i >= 0; i--){
        //     System.out.println(marks[i]);
        // }

        // Multidimentional Arrays
        // // printing a 2-D array
        int [][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        // flats[2][0] = 301;
        // flats[2][1] = 302;
        // flats[2][2] = 303;
        System.out.println(flats.length);

        // Printing a 2-D array using for loop
        for(int i = 0; i < flats.length; i++){
            for(int j = 0; j < flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
            System.out.println(flats[i].length);
        }


        // printing a 3-D array
        // int [][][] flats = {
        //     {{1, 2, 3}, {4, 5, 6}},
        //     {{7, 8, 9}, {10, 11, 12}},
        //     {{13, 14, 15}, {16, 17, 18}} 
        // };
        

        // // Printing a 3-D array using for loop
        // for(int i = 0; i < flats.length; i++){
        //     for(int j = 0; j < flats[i].length; j++){
        //         for(int k = 0; k < flats[i][j].length; k++){
        //             System.out.print(flats[i][j][k] + " ");
        //         }
        //         System.out.println("");
        //         }
        //         System.out.println("");
        //     }
        }

    }
