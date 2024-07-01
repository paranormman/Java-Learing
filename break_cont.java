public class break_cont {

    public static void main(String[] args) {
        //Break using for loop 

        // for(int i = 1; i <= 5; i++){
        //     System.out.println(i);
        //     System.out.println("This is a java program");
        //     if (i == 2) {
        //         System.out.println("Ending the loop");
        //         break;                
        //     }
        // }

        // Break Using while loop
        // int i = 0;
        // while (i<=5) {
        //     System.out.println(i);
        //     System.out.println("This is a java program");
        //     if (i == 2) {
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        //     i++;
        // }
        
        // Continue statement
        for(int i = 0; i <= 5; i++){
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;                
            }
            System.out.println(i);
            System.out.println("This is a java program");
        }
    }
}