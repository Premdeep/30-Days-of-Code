/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrades;


public class Grades extends StudentGrades {
    int score;
    
    
    public Grades(String first, String last, int ph,int score){
        super(first,last,ph);
        this.firstName = first;
        this.lastName = last;
        this.phone = ph;
        this.score = score;        
  
    }
    
    public char calculate(){
        
    if(this.score >= 90 && this.score <=100 )
        return 'O';
    else if (this.score >= 75 && this.score < 90)
        return 'E';
    else if (this.score >= 60 && this.score < 75)
        return 'A';
    else if(this.score >= 40 && this.score < 60)
        return 'B';
    else
        return 'D';
        
}
    
    
}
