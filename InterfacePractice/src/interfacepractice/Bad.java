
package interfacepractice;

/**
 *
 * @author Prem
 */
public class Bad implements Character{
    
    @Override
    public void attack(){
        System.out.println("Bad attacks people");
    }
    
    @Override
    public void save(){
        System.out.println("Bad dont save people");
    }
    
    
}
