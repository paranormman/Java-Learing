import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public void setNumber(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    public int getNumber(){
        return noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100); 
    }

    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        this.inputNumber = sc.nextInt(); 
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number ){
            System.out.format("You guessed the correct number %d \nThe number you guessed is %d", number, noOfGuesses);
            return true;
        }
        else if( inputNumber > number){
            System.out.println("too High...");
        }
        else if( inputNumber < number){
            System.out.println("too low...");
        }
        return false;
    }

}
public class opps_game {
    
    public static void main(String[] args) { 

        Game g = new Game();
        boolean b = false;
        while (!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}
