import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        // Declare variables
        int exp;    // exponent (non-negative integer)
        int base;   // base (integer)
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a base: "); 
        base = in.nextInt();                     
        System.out.print("Enter the exponent "); 
        exp = in.nextInt();    

        in.close();
        // Print result
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
     }
  
     // Returns "base" raised to the power "exp"
     public static int exponent(int base, int exp) {

        int product = 1;

        for (int x = 1; x <= exp; x++){

            product *= base;

        }

        return product;
     }
}
