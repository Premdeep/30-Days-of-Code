/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrades;

import java.util.Scanner;

public class StudentGrades {
    
    protected String firstName;
   protected String lastName;
   int phone;
   
   public StudentGrades(String fname,String lname,int p){
         firstName=fname;
         lastName=lname;
         phone=p;
       
   }
   public void display(){// display the details of the student
       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
   }

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        StudentGrades stu = new Grades(firstName,lastName,phone,score);
        stu.display();
        Grades g =(Grades)stu;
        System.out.println("Grade: "+g.calculate());
        
        
    }
    
}
