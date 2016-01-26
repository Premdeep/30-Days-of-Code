
package queuepractice;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Prem
 */
public class QueuePractice {

    LinkedList queue ;
    
    // Constructor declaration
    
    public QueuePractice(){
        queue = new LinkedList();
    }
    
    // Adding elements to the Queue, enqueue
    
    public void enqueue(int e){ // adds elements to the tail of the list.
         queue.addLast(e);
    }
    
    // removing elements which is in FIFO format that in term returns an Object
    
    public int dequeue(){   // this is similar to list.pop() which does the opposite (returns the last element), here it returns the first element(FIFO)
        return (int) queue.removeFirst();
    }
   
    // we can peek at the head element in the list with out removing it.
    
    public Object peek(){
        return queue.peek();  // we can cast the object to int also.
    }
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
       Stack<String> lifo = new Stack<>(); 
       
       lifo.add("prem");
       lifo.add("prasanth");
       lifo.add("sunny");
       lifo.add("Srikanth");
       
       System.out.println("The Current stack is : "+lifo);
       
       System.out.println("Is the stack empty :"+lifo.empty());
       
       System.out.println("The peek element is: "+lifo.peek());
       
       lifo.push("Kluniversity");
       lifo.push("guntur");       
      
       System.out.println("The Current stack is : "+lifo);
       
       System.out.println(lifo.pop());
       
       String s = "prem";
       
       System.out.println(s.matches("prem"));
        
       /*   // Queue practice
        
        QueuePractice intQueue = new QueuePractice();
        
        intQueue.enqueue(5);
        intQueue.enqueue(9);
        intQueue.enqueue(7);
        
        System.out.println(intQueue.queue);
        System.out.println("The first element is :"+intQueue.peek());
        
        System.out.println("The first out element is : "+intQueue.dequeue());
        System.out.println("The second out element is : "+intQueue.dequeue());
        System.out.println("The third out element is : "+intQueue.dequeue());
        
         System.out.println(intQueue.queue);  */
        
    }
    
}
