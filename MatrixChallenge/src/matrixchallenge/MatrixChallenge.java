
package matrixchallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Prem
 */
public class MatrixChallenge {
    
    public static int Sum (int x, int y , int [] [] a){
        return (a[x][y] + a[x][y+1] + a[x][y+2] + a[x+1][y+1] + a[x+2][y] + a[x+2][y+1] + a[x+2][y+2] );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int d = -63;
        
        for(int x = 0; x<=3; x++){
            for(int y = 0; y<=3; y++){
                int sum = Sum(x,y,arr);
                //System.out.println(sum);
                if(sum > d){
                    d = sum;
                }
            }
        }
        
        System.out.println(d);
        
        
        
      
        
            
   
    }
}
