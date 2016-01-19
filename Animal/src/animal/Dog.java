
package animal;


public class Dog extends Animal {
    
    String name = "Harry";
    
    public Dog(){
        super(); 
        //this.height = 15;
 
    } 
    
    public Dog(String c){
        super(4);
        //this.height = 5;
        this.name = c;
        System.out.println("THe name of the new dog in constructor is : "+this.name);
    }

    
    
    public void smell(){
        System.out.println("THe dog smells and its name is : "+ name);
        
        }
    public void honest(){
        System.out.println("THe dogs are honest and the name is : "+name);
    }
        
    
}
