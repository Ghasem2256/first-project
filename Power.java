
package power;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Please Enter x : ");
        int x = input.nextInt();
        System.out.println("Please Enter n : ");
        int n = input.nextInt();
        int sum = 1;
           pow(x , n , sum); 
                 
    }
    public static void pow (int x , int n , int sum){
        
       if (n > 0) {
            sum*= x;
            n--;
            pow (x , n , sum);
            
        }
       else 
            System.out.println("X to the power of N : " + sum);
 
    }
    
}
