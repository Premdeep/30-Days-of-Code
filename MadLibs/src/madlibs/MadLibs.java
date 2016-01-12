package madlibs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Prem
 */
public class MadLibs {

    // Instance Variables
    String noun1;
    String noun2;
    String verb;
    String adverb;
    String adverb1;
    String adjective;
    String adjective1;
    
    Scanner sc = new Scanner(System.in);

    //  Getter Methods
    public String getNoun1() {
        return this.noun1;
    }

    public String getNoun2() {
        return this.noun2;
    }

    public String getVerb() {
        return this.verb;
    }

    public String getAdVerb() {
        return this.adverb;
    }

    public String getAdVerb1() {
        return this.adverb1;
    }

    public String getAdjective() {
        return this.adjective;
    }

    public String getAdjective1() {
        return this.adjective1;
    }
       // Setter Methods

    public void setNoun1(String noun) {
        this.noun1 = noun;
    }

    public void setNoun2(String noun) {
        this.noun2 = noun;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setAdverb1(String adverb) {
        this.adverb1 = adverb;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public void setAdjective1(String adjective) {
        this.adjective1 = adjective;
    }
    
    public void start(){
        System.out.println("Give me a noun");
        setNoun1(sc.nextLine());
        System.out.println("Give me a another noun");
        setNoun2(sc.nextLine());
        System.out.println("Give me a verb");
        setVerb(sc.nextLine());
        System.out.println("okay you have been a good boy. Now pleas give me an adjective");
        setAdjective(sc.nextLine());
        System.out.println("please give an adverb");
        setAdverb(sc.nextLine());
        System.out.println("Please give another adjective");
        setAdjective1(sc.nextLine());
        System.out.println("Okay this is the last one just give me an adverb");
        setAdverb1(sc.nextLine());
               
    }
    
    public void story(){
        Random rand = new Random();
        int num = Math.abs(rand.nextInt()) % 2;
        
        if (num == 0){
            System.out.println("Today "+getNoun1()+","+getNoun2()+" and I "+verb+ " to a party where there  are so many "+getAdjective()+" food items which will"
                    + " be served in"+ getAdjective1()+" plates and so every one in the town came "+ getAdVerb1()+" to the party though it is private but we saw a man"
                    + " who is going out "+ getAdVerb() + " from the party");
        } else{
            System.out.println("One night in a dark place "+getNoun1()+", "+getNoun2()+"and I "+verb+ " to a friends birthday party where there are no "+getAdjective()+" guests which is a"
                    + " strange thing but we started moving where we saw a "+ getAdjective1()+" friend waiting for us"+ getAdVerb1()+" we then joined him with a smile and a we ran in to the place"
                    + getAdVerb() + " to wish our friend");
        }
        
    }

    public static void main(String[] args) {
        System.out.println("welcome to a story generator, we will create a story with your parts of speech so let's get started");
        MadLibs mad = new MadLibs();
        mad.start();
        System.out.println("Here is the story");
        mad.story();
    }

}
