
package recursion;

import java.util.Scanner;

/**
 *
 * @author Prem
 */
public class Recursion {
    
    // Recursion for addition of n integers
    public static int addRec(int x){
        if(x == 0)
            return 0;
        else
            return x+addRec(x-1);
    }
    
    public static int powerRecursion(int a, int n){
        if(n < 1)
            return 1;
        else
            return a*powerRecursion(a,n-1);
    } 
    
    
   

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // TODO code application logic here
         int i = 0;
         System.out.println("Enter a  number n");
         // Taking inputs
         int n = sc.nextInt();
         int[] a = new int[n];
         
         while(i<n) {
             //Taking inputs in to a[] array
             a[i] = sc.nextInt();
             i++;
         }
         int j = 0;
         while(j<n){   
             // performing operation on each element of the array starting
             // from index [0]
              String s = "";
            // checking for the final condition in a division for binary  
         while(a[j]>=1){
             Integer b = a[j]%2;
             a[j] = a[j]/2;
             s = s + b.toString(); // creating a string concantenation by converting b to string
            
         }
         // string reverse
         String s1 = "";
         for(int k = s.length()-1; k>=0;k--){
             s1 = s1+s.charAt(k); // s[i] == s.charAt(i)
         }
         
         System.out.println(s1);
         j++;
         }
         
         System.out.println(powerRecursion(5,2));
         System.out.println(addRec(5));
         
             
       
        
    }
    
}
