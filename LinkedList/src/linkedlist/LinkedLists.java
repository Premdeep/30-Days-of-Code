
package linkedlist;

import java.util.LinkedList;


public class LinkedLists {
    
    // properties so Linked list has these set of sequence of nodes(each node holds data and reference to the next node)
    // so attributes of the linked list will be node and count which will tell us how many nodes are present in the list(Linked)
    
    Node head;
    int count;
    
    // constructors
    
    public LinkedLists(){  // this means our linked list has 0 Nodes in it.
        head = null;
        count = 0;
    }
    
    public LinkedLists(Node newHead){ // this says our linked list has 1 node which is head;
        head = newHead;
        count = 1;
    }
    
    // Methods
    
    // adding a new node to our linked List
    
    public void addNode(int newData){  // method to add a new node to the linked list with some custom data in it
        // for this first we have to create a node with data in it which is done below
        Node newNode = new Node(newData); // new node with new data and a null next
        // next we have to add this node to the end of the Linked list as a last node
        Node current = head; // this means the head is the first node that will be create when we create the linked list and here current is a variable of type Node
        
        if(current == null)     // here if the current node head is refering to null which means no node is in the list, which                                
            current = newNode;  // means the new Node we are adding will be the first head node;
        else{
            while(current.getNext() != null){ // else meaning there are some nodes in the list and we have to find the last node to which we have to add this 
                current = current.getNext();   // current node so by iterating we will get the last node whose .getNext() returns null which means that it is the last node in the list
            }
            
            current.setNext(newNode); // this will add the newNode to the last node by setting a reference pointer to the next in the last current node
        }
        
        count++; // By this count we will keep track of the no of the nodes present in the linked list.
        
    }
    
    
    public int getNodeData(int index){
        if(index <= 0)
            return -1; // Since the count index is starting from 1 if the index is 0 or less which is invalid we return -1;
        Node current = head;  // here head will be a reference which will be created when we instantiate an object.
        for(int i = 1; i<index;i++){ // since head node count starts from 1; 
            current = current.getNext(); // this will give us the next node after head
        }
        return current.getData();
    }
    
    public int sizeOfList(){
        return count;
    }
    
    public boolean isListEmpty(){
        return head == null;
    }
    
    public void removeNode(){ // This will remove the node at the last just like in python in which list.pop() works
        // here first we have to go the last node and remove the node and make the last but one node's next to reference null this will work good
        Node current = head;  
        
        for(int i = 1; i<count-1;i++){
            current = current.getNext();
        }
        
        current.setNext(null);
        count--;
        
        // Alternative method by Kathryn Hodge
        /*
        
        while(current.getNext().getNext() != null)
            current = current.getNext();
        current.setNext(null);
        count--
        
        */
       
        
           
    }
    

    
    public static void main(String[] args) {
       // implemenation by Kathryn Hodge
        
       /* LinkedList <String> linkedList = new LinkedList <String>();
        linkedList.add("Prem");
        System.out.println(linkedList);
        linkedList.add("Srikanth");
        System.out.println(linkedList); */
        
        Node a = new Node(3);        
        LinkedLists list = new LinkedLists(a);          
        
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        System.out.println(list);
        System.out.println(list.getNodeData(1));
        
        System.out.println(list.count);
        System.out.println(a);
        list.removeNode();
        System.out.println(list.count);
        System.out.println(list.getNodeData(3));
        
        
        
    }
    
}
