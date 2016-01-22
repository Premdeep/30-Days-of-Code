
package calendarpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Prem
 */
public class CalendarPractice {

   
    public static void main(String[] args) {
        
        //Calendar cal = Calendar.getInstance();
        
        Calendar cal =  Calendar.getInstance();
        
        cal.add(Calendar.DATE, 5);
        System.out.println(cal.getTime());
        SimpleDateFormat simple = new SimpleDateFormat("yyyy - MM - dd");
        String date = simple.format(cal.getTime());
        System.out.println(date);
        
        
    }
    
}
 