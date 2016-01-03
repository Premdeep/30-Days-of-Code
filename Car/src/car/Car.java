
package car;

/**
 *
 * @author Prem
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    boolean isCarOk = true;
    char Status = 'G';
    
   public void printVariables(){
       System.out.println("The max speed is: " + maxSpeed);
       System.out.println("The min speed is: " + minSpeed);
       System.out.println(isCarOk);
       System.out.println(Status);
   }
   
   public void wreck(){
       isCarOk = false;
       Status = 'P';
   }
    public static void main(String[] args) {
        Car Honda = new Car(); // created an instance of the class car with object Honda
        System.out.println("Honda car brand new Condition ");
        Honda.printVariables();   
        Car familyCar = Honda;  // Referencing "Shared car" which means family car is the Honda car
        familyCar.wreck();
        System.out.println("Honda car after family car use");
        Honda.printVariables();
        System.out.println("Family car afer wreck");
        familyCar.printVariables();
    }
    
}
