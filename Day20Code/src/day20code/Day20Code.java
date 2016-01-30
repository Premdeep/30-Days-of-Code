
package day20code;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Prem
 */
public class Day20Code {

    // In this program we see how a String tokenizer works to separate the tokens with in a string
    
    // The documentation for the String tokenizer is found at this below link
    
    // http://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html#nextToken()
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();        
        System.out.println("THe entered string is : "+s);
       
       // Instantianting the String Tokenizer to print the words separated by spaces ans other delimiters on the different lines
        
        StringTokenizer st = new StringTokenizer(s, "![,?.\\_'@+] ", false);
        
        int count = st.countTokens();
        
        System.out.println(count);
        
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
        
     }
     
     
    }
    
}
