
package vehicle;

/**
 *
 * @author Prem
 */
public abstract class Vehicle {

    public String color = "Red";
    
    public Vehicle(){
        System.out.println("A vehicle is created");
    }
    
    public abstract void moveForward();
    
    public void moveBack(){
        System.out.println("The vehicle is moving Backward");
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void stop(){
        System.out.println("A vehicle is stopped");
    }
        
        
    public static void main(String[] args) {
       // Inheritance practice
        
      /* Vehicle v  = new Vehicle();   
       
       Car c = new Car(4);
       
       Truck t = new Truck(); 
       
       System.out.println("The color of car is :"+ c.getColor());
        
        // Type casting practice
       
       Object honda = new Car(3);      
       
       Car bmw = (Car) honda;   
       
       bmw.getIn(); 
       
       Vehicle u = new Truck();  
       
       Truck exMark = (Truck) u;  
       
       exMark.load();
       exMark.moveBack(); */
        
        // Abstract and Method overriding practice
        
       
      // Vehicle v = new Vehicle(); wont run because abstract class 
       
       Car v1 = new Car(5);
       
       v1.moveForward();
       
       Truck t = new Truck();
       
       t.moveForward();
       
       Vehicle v = (Vehicle) t;
       
       v.moveForward();
       
       v.moveBack();  
       
       v.stop();
       
       
       
    }

    
}
