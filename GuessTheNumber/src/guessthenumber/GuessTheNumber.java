package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Prem
 */
public class GuessTheNumber {
   
    int max;
    int secretNumber;
    
    
    // The constructor should be as same as the class name with out any return type before it
    
    public GuessTheNumber(){
        Random rand = new Random();
        max = 100;
       secretNumber = Math.abs(rand.nextInt()) % (max + 1);
      
    }
  

    public void playGame() {
        
         System.out.println("The secret number is : "+secretNumber);

        while (true) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number > secretNumber) {
                System.out.println("Your Number is too High");
            } else if (number < secretNumber) {
                System.out.println("Your Number is too Small");
            } else {
                System.out.println("Hurray you got the correct Number");
                break;
            }

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hiii welocme to Guess the number game. our secret number will be in between 0 and 100");
        System.out.println("LEts start the Game,"
                + " Please guess the number");
        GuessTheNumber guess = new GuessTheNumber();      
        guess.playGame();

    }
}