
package akerman;

import java.util.Scanner;
public class Akerman {

    public static void main(String[] args) {
 Scanner input=new Scanner (System.in);
     System.out.println("Enter number of a:");
     int a=input.nextInt();
     System.out.println("Enter number of b:");
     int b=input.nextInt();
     System.out.println(f(a,b));
     
    }
    public static int f(int m, int n) {
        if (m == 0 && n >= 0 ) 
            return n+1;
        else if ( n == 0 && m > 0) 
            return f(m-1, 1);
        else if  (m > 0 && n > 0) 
            return f(m-1, f(m, n-1));
        else return 0;
    }
    
}

