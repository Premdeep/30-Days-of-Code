
package arraypractice;

import java.util.Arrays;

/**
 *
 * @author Prem
 */
public class ArrayPractice {
    
    public static void printArray(int [] array){
        System.out.print("[");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if(i<array.length - 1)
                System.out.print(", ");            
        }
        System.out.print("]");
        System.out.println();
    }

   
    public static void main(String[] args) {
        int [] a;   // declaration
        int [] b = new int [5]; // allocation
        int [] c = {1,3,5,7,9};  // initialization
        int [] d = {5,2,9,4,1};
        
        System.out.println(Arrays.toString(c));
        printArray(d);
        
        // special loop in Java which is similar to for loop in Python.
        for (int i: c){
            System.out.println(i);           
            System.out.println(c.length);
        }
        
        // Here we can't use the direct printing of arrays like below !!
        //System.out.println(c);
        
    }
    
}
