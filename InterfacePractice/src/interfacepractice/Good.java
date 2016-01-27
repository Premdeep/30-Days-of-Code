/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepractice;

/**
 *
 * @author Prem
 */
public class Good implements Character{
    
    @Override
    public void attack(){
        System.out.println("The good fights Bad");
    }
    
    @Override
    public void save(){
         System.out.println("The good saves the people");
    }
    
}
