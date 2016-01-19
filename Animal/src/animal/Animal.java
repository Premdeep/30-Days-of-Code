
package animal;

/**
 *
 * @author Prem
 */
public class Animal {
   // private static String Black;
    
    int height = 2;
    
  public Animal(){
        
    } 
    
    public Animal(int height){
        this.height = height;
    }
    
    public void run(){
        System.out.println("THe Animal is Running and the height of aniaml is :"+this.height);
        //System.out.println("Height of the animal is :"+this.height);
    }
    
    public void eat(){
        System.out.println("THe Animal is eating and its height is :"+this.height);
         //System.out.println("Height of the animal is :"+this.height);
    }

  
    public static void main(String[] args) {
       Animal a = new Animal();
       a.run();
       Dog d = new Dog();
       Dog e = new Dog("maple");
       Tiger t = new Tiger(89,7);
       System.out.println("The tiger height is : "+t.height);
       t.strong();
       t.king();
       d.eat();
       d.honest();
       e.honest();
       e.smell();
       System.out.println(d.height);
       
       
        
        
        
        
       
       
    }
    
}
