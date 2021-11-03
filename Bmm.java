package bmm;

import java.util.Scanner;

public class Bmm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int a = input.nextInt();
        System.out.print("Enter Num2 : ");
        int b = input.nextInt();

        System.out.println(ogh(a, b));

    }

    public static int ogh(int a, int b) {

        if (b == 0) {
            return a;
        }
        return ogh(b, a % b);

    }

}
