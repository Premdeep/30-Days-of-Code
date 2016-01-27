
package interfacepractice;

import java.util.Random;

/**
 *
 * @author Prem
 */
public class InterfacePractice {
    
    public static Character person(){
        Random rand = new Random();
        if(Math.abs(rand.nextInt())%2 == 0)
            return new Good();
        else
            return new Bad();
    }

    
    public static void main(String[] args) {
        
        Bad b = new Bad();
        b.attack();
        b.save();    
        
        Good g = new Good();
        g.attack();
        g.save();
        
        Character c = person();  
        c.attack();
        c.save();
        
        
    }

   
    }
    

