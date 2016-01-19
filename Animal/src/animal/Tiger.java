/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;


public class Tiger extends Animal {
    
    int weight;
    
    
    
    public Tiger(int w,int h){
        super( 5);
        this.weight = w;
        this.height = h;
        
    }
    
    public Tiger(){
        super(6);
        this.weight = 70;
    }
    
    public void strong(){
        System.out.println("Tiger is stronger than dog and its weight is :" + this.weight);
        //System.out.println("THe tiger  weigh "+this.weight);
            }
    
    public void king(){
        System.out.println("THe king of the forest is tiger it weights : " + weight);
        //System.out.println("THe tiger weigh "+this.weight);
    }
    
    
}
