
package dictionarychallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Prem
 */
public class DictionaryChallenge {   

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Map <String,Integer> Dic;
        Dic = new HashMap <>();  
        
        
      String s = sc.nextLine();
         
        
        Dic.put("one",1);
        Dic.put("two",2);
        Dic.put("three",3);
        Dic.put("four",4);
        Dic.put("five",5);
        Dic.put("six",6);
        Dic.put("seven",7);
        
        // prints out dictionary to console in string format
        System.out.println(Dic.toString());
        
        // printing keys in the dictionary
        System.out.println(Dic.keySet());
        
        // printing values in a dictionary
        System.out.println(Dic.values());
        
        // checks whether a value is present in the dictionary or not
        System.out.println(Dic.containsValue(0));
        
        // checks whether a key is present in the dictionary or not
        System.out.println(Dic.containsKey("three"));
        System.out.println(Dic.containsKey("nine"));
        
        // prints array of the entire Dictionary
        System.out.println(Dic.entrySet());
        
        // checks whether a value is present in  a key or not
            System.out.println(s.equals("prem"));
        
        Dic.remove("six"); // removes key six and prints rest         
        System.out.println(Dic.toString());
        
        
        
        
        
        
        
              
        
    }
        
        
    }
    

