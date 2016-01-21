
package vehicle;

/**
 *
 * @author Prem
 */
public class Car extends Vehicle {
    
    int passengers;
    
    public Car(int p){
        super();
        this.passengers = p;       
        System.out.println("A Car is created");
    }
    
    @Override
    public void moveForward(){
        System.out.println("The car is moving forward");
    }
    
    public void getIn(){
        this.passengers++;
        System.out.println("No of passenges is : "+passengers);
    }
    
    public void getOut(){
        this.passengers--;
        System.out.println("No of passenges is : "+passengers);
        
    }
        
    
}
