
package cointoss;

import java.util.Random;

/**
 *
 * @author Prem
 */
public class CoinToss {

   public String toss(){
       Random rand = new Random();
       int toss = Math.abs(rand.nextInt()) % 2;
       
       if (toss == 1)
           return "Heads";
       else
           return "Tails";
       
       /*int toss = rand.nextInt();
       if (toss > 0){
           return "Heads";
       }
       else
           return "Tails"; */
       
    
      
   }
    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss coin = new CoinToss();
        System.out.println(coin.toss());
        System.out.println(coin.toss());
        System.out.println(coin.toss());
        System.out.println(coin.toss());
        System.out.println(coin.toss());
        
    }
    
}
