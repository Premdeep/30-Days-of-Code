
package generics;

import java.util.Arrays;


/**
 *
 * @author Prem
 */

// Implementing Generics in Java
public class Generics {
    
    public static <E> void printArray(E[] a){
        for (E a1 : a) {
            System.out.print(a1 + " ");
        } 
        System.out.println("");
    } 
    
    public static <T extends Comparable<T>> T max(T a, T b){
        int c = a.compareTo(b);
        if(c <= 0){
            return b;
        }else{
            return a;
        }
    }

  
    public static void main(String[] args) {
        // TODO code application logic here
        Integer [] array = {5,3,7,9};
        
        String [] strArray = {"Hell0", "Workd", "how", "are", "you"};
        
        System.out.println(Arrays.toString(array));
        
        printArray(array);
        
        System.out.println("");
        
        printArray(strArray);
        
        System.out.println(max("prem","deep"));
        System.out.println(max(3,5));        
        System.out.println(max('a','A'));
        
        
    }
    
}
