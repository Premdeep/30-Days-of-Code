
package sortingchallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class SortingChallenge {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int[N];
        for (int i = 0; i<N; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("The unsorted array is :"+Arrays.toString(a));
        
        // lets arrange elements in ascending order in the array using Insertion sort algorithm
        /*
        for(int j = 1; j < N; j++){
            for(int k = 0; k < j; k++){
                if(a[j] < a[k]){
                    int temp = a[k];
                    a[k] = a[j];
                    a[j] = temp;
                }
            }
        }
                */
        Arrays.sort(a, 0, N);
        
        System.out.println("The sorted ARRAY is: "+Arrays.toString(a));
        
      /*  LinkedList <Integer> link; 
        link = new LinkedList <> (); */
        
         int x = a[N-1];
         String s = "";
        
        for(int i = 0; i< N-1; i++){        
            
            
            
            int k = Math.abs(a[i+1] - a[i]);
            // Logic obtained from the tamyCova/ 30Days of Code
            if(k < x){
                x = k;
                s = " "+a[i]+" "+a[i+1];
            }else if (k == x)
                s += " "+a[i]+" "+a[i+1];
            // logic ends
            
            // My original working logic starts  from here
            
        /*    for(int j = 0; j< N-1; j++){
                 int y = Math.abs(a[j+1]- a[j]);
            if(y<=x){
                x = y;
            }
            
            }
            
            int k = Math.abs(a[i+1] - a[i]);
            
            if(x == k){
                link.add(a[i]);
                link.add(a[i+1]);
            }
                */
 
        }
        
        System.out.println(s);
        
        //System.out.println(link);
        //System.out.println(link.element());
        //System.out.println(link.size());
        
      /*  for (Integer link1 : link) {
            System.out.print(link1+" ");
        } */
        
        
    }
    
}
