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

    public void randomNumber() {

        Random rand = new Random();
        //int x = rand.nextInt();
        // below statement keeps our secret number in between 0 and 100
        // anyNumber % N = {0,1,2--- N-1}
        this.secretNumber = Math.abs(rand.nextInt()) % (this.max + 1);

    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            this.number = sc.nextInt();
            if (this.number > this.secretNumber) {
                System.out.println("Number is too High");
            } else if (this.number < this.secretNumber) {
                System.out.println("Number is too Small");
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
        guess.randomNumber();
        guess.playGame();

    }
}
