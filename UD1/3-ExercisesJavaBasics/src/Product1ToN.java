public class Product1ToN {   // Save as "SumAverageRunningInt.java"
public static void main(String[] args) {
   final int LOWERBOUND = 1;
   final int UPPERBOUND = 10;
   int product  = 1;    // For accumulating odd numbers, init to 0
   
   int number = LOWERBOUND;
   while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
      
         product = product * number;
         ++number;    // Same as sumEven = sumEven + number
      }   // Same as sumOdd = sumOdd + number
      
 // Next number
   
   // Print the result
   System.out.println("The sum of numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
}
}