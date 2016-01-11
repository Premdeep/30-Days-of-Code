/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppractice;

/**
 *
 * @author Prem
 */
public class LoopPractice {

    public static void whileLoop(){
        int x = 0;
        while(x<=5){
            System.out.println("The value of x is : " + x);
            x++;
        }
    }
    
    public static void doWhileLoop(){
        int x = 5;
        do{
            System.out.println("The value of new x is : " + x);
            x++;
        }while(x<=10);
    }
    
    public static void forLoop(){
        for(int y = 0; y<10;y++){
            System.out.println("THe value of y is :" + y);
            if (y == 5)
                break;
        }
            
    }
        
    
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forLoop();
    }
    
}
