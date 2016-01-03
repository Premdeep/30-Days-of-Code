
package car;

/**
 *
 * @author Prem
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    int passengers = 1;
    
    int maxFuel = 16;
    double currentFuel = 8;
    int mpg = 15;
    
    double distanceTravelled;
    double maxDistance;
    
    int weight = 4096;
    //boolean isCarOk = true;
    char Status = 'G';
    
    
    // Constructor for custom initialization in contrast with the default values
    public Car(int customMaxSpeed, int customWeight, int customMpg ){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        mpg = customMpg;
    }
    
    public Car(){// default constructor
    }
    
    public double maxmilage(){
        return mpg * maxFuel;
    }
    
    public void getIN(){
        passengers++;
    }
    
    public void getOut(){
        
        passengers--;
    }
        
    
    
    
   public void printVariables(){
       System.out.println("The max speed is: " + maxSpeed);
       System.out.println("The min speed is: " + minSpeed);       
       System.out.println("Car milage :"+mpg);
       System.out.println("weigt of car :"+ weight);
       System.out.println("No of passengers :" + passengers);
   }
   
  
   
   public void upgradespeed(){
       minSpeed = maxSpeed;
       maxSpeed += 1;
   }
    public static void main(String[] args) {
        Car Honda = new Car(); // created an instance of the class car with object Honda
        System.out.println("Honda car brand new Condition ");
        Honda.printVariables(); 
        
        Car BMW = new Car(500,2000,'A');
        BMW.upgradespeed();       
        System.out.println("BMW updated values");
        BMW.printVariables();
        BMW.getIN();
        BMW.getIN();
        System.out.println("passengers :"+BMW.passengers);
        BMW.getOut();
        System.out.println("max fuel is :"+BMW.maxmilage());
        
        
            }
    
}
