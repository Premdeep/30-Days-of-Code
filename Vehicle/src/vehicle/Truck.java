
package vehicle;

/**
 *
 * @author Prem
 */
public class Truck extends Vehicle {
    
    int weight = 10;
    
    public Truck(){
        super();       
        System.out.println("A Truck is created");
    }
    
    public void moveForward(){
        System.out.println("A Truck is moving Forward");
    }
    
    public void moveBack(){
        System.out.println("A Truck is moving Backward");
    }
    
    public void load(){
        this.weight++;
        System.out.println("THe truck new load is :"+ weight);
    }
    public void unLoad(){
        this.weight--;
        System.out.println("The truck reduced load is : "+weight);
    }
        
    
    
    
}
