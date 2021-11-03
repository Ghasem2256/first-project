
package array;

import java.util.Arrays;
import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
       
           Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = input.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter all the elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
         System.out.println( Arrays.toString(arr) );
        sum(arr, arr.length - 1);
    
           
    }
   
    public static void sum(int a[], int n)
    {
        if (n > 0){
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr [i] = a[i] + a[i + 1];
            }
            System.out.println( Arrays.toString(arr) );
        
        sum(arr, arr.length - 1);
        }
    
    }
    
}
