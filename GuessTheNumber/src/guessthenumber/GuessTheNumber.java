
package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Prem
 */
public class GuessTheNumber {

   int number;
   int max = 100;
   int secretNumber;
   
   public void randomNumber(){
       
       Random rand = new Random();
       //int x = rand.nextInt();
       this.secretNumber = Math.abs(rand.nextInt()) % (this.max+1);
       
   }
   
   public void playGame(){
     Scanner sc = new Scanner(System.in);
       
        while(true){
            this.number = sc.nextInt();
            if(this.number > this.secretNumber ){
                 System.out.println("Number is too High");
            }
               
            else if (this.number < this.secretNumber){
                 System.out.println("Number is too Small");
            }
               
            else{
                 System.out.println("Hurray you got the correct Number");
                break;
            }
               
        }
        
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hiii welocme to Guess the number game. Dare to win top prizes by guessing our secret number ");
        System.out.println("LEts start the Game, Please guess the number");
        GuessTheNumber guess = new GuessTheNumber();
        guess.randomNumber();
        guess.playGame();
        
    }
}