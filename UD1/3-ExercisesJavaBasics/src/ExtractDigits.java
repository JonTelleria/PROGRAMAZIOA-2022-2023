/**
 * Compute the sum of harmonics series from left-to-right and right-to-left.
 */
public class ExtractDigits  {   // Save as "HarmonicSum.java"
   public static void main (String[] args) {
      int n = 345329 ;
      while (n > 0) {
         
         System.out.print(n % 10 ); //si usas println haces columna
         System.out.print(" ");
            n = n/10;
      }
   }
}