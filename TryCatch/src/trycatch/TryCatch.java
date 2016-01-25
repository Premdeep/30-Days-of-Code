
package trycatch;

/**
 *
 * @author Prem
 */
public class TryCatch {

   
    public static void main(String[] args) {
          
        // Checking how a simple try catch exception workSS
        try{
            int [] a = new int[5];
            // Here trying to access the element that is not defined which results in an exception.
            System.out.println("The 6th element of the array is :"+a[5]);
            // Here e is the object of type "Array Index out of bound exception"
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index is out of bound "+ e);
        } finally {
            System.out.println("Finally here");
        }
        
        System.out.println("It is done");    
    
}
    
}
