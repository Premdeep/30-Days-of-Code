
package linkedlist;


public class Node {
    
    // Attributes: each node contains data and a reference to the next Node 
    // in the sequence so the below properties justifies the Attributes.
    
    Node next;  // reference to the next Node;
    int data;
    
    // Constructors initialization
    
    public Node(int newData){
       next = null;  
       data = newData; 
    }
    
    public Node(Node newNext, int newData){
        next = newNext;
        data = newData;
    }
    
    // Methods Setters and Getters    
   
    public Node getNext(){
        return next;
    }
    
    public int getData(){
        return data;
    }
    
    public void setNext(Node newNext){
        next = newNext;
    }
    
    public void setData(int newData){
        data = newData;
    }
        
    
    
    
}
