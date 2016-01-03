
package car;

/**
 *
 * @author Prem
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    
    int noOfPassengers = 1;
    int maxPassengers = 5;
    
    
    int maxFuel = 16;
    double currentFuel = 8;
    int mpg = 15;
    
    double distanceTravelled;
    double maxDistance;
    
    int weight = 4096;
    boolean isCarOn = false;
    char Status = 'G';
    
    
    // Constructor for custom initialization in contrast with the default values
    public Car(int customMaxSpeed, int customWeight, int customMpg ){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        mpg = customMpg;
    }
    
    // default constructor
    public Car(){
    }
    
    public void isCarOn(){
        isCarOn = true;
    }
    public double maxmilage(){
        return mpg * maxFuel;
    }
    
    public void getIN(){
        if(noOfPassengers < maxPassengers){
        noOfPassengers++;
        System.out.println("No of passengers : "+noOfPassengers);
        }
        else{
            System.out.println("The Car is Full"+ noOfPassengers + "="+ maxPassengers);
        }
    }
    
    public void getOut(){
        if (noOfPassengers > 1){
        noOfPassengers--;
        System.out.println("No of passengers : "+noOfPassengers); 
        }
        else{
            System.out.println("No passengers in the Car");
         
        if(noOfPassengers == 1){
            System.out.println("Only Driver is in the Car");
        }
            
        }
            
        
        
    }
        
    
    
    
   public void printVariables(){
       System.out.println("The max speed is: " + maxSpeed);
       System.out.println("The min speed is: " + minSpeed);       
       System.out.println("Car milage :"+mpg);
       System.out.println("weigt of car :"+ weight);
       System.out.println("No of passengers :" + noOfPassengers);
   }
   
  
   
   public void upgradespeed(){
       minSpeed = maxSpeed;
       maxSpeed += 1;
   }
    public static void main(String[] args) {
       Car myCar = new Car();
       System.out.println("Initial no of Passengers : " + myCar.noOfPassengers );
       myCar.getIN();
       myCar.getIN();
       myCar.getIN();
       myCar.getIN();
       myCar.getIN();
       myCar.getIN();
       myCar.getOut();
       myCar.getOut();
       myCar.getOut();
       myCar.getOut();
       myCar.getOut();
        
            }
    
}
