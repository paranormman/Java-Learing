import java.util.Scanner;

class maxRetiresException extends Exception{
    @Override
    public String toString(){
        return "You have exceeded the limit of 5 tries";
    }

    @Override
    public String getMessage(){
        return "You have exceeded the limit of 5 tries";
    }
}

public class ch14_practice {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int i= 0;
        while(flag && i<5){
            try{
                System.out.println("Enter a value of the index");
                int index = sc.nextInt();
                System.out.println("The Value of Index marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        try{
            if(i>=5){
                throw new maxRetiresException();
            }
        }
        catch(maxRetiresException e){
            System.out.println(e);
        }
        
    }
}
