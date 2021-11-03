
package sekeh;

public class Sekeh {

    public static void main(String[] args) {
     int n = 1000;
        int[] s = {50,100,500};
        System.out.println("Number of ways: " + total(n, s, 0));
    }
     public static int total(int n, int[] s, int i) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        
        if (i == s.length && n > 0) {
            return 0;
        }
        return total(n - s[i], s, i) + total(n, s, i + 1);
    }
    
}
