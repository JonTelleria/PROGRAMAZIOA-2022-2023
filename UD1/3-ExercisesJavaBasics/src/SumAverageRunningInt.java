public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
public static void main(String[] args) {
   final int LOWERBOUND = 1;
   final int UPPERBOUND = 100;
   int sumOdd  = 0;    // For accumulating odd numbers, init to 0
   int sumEven = 0;    // For accumulating even numbers, init to 0
   int number = LOWERBOUND;
   while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
      if (number % 2 == 0) {  // Even
         sumEven += number;   // Same as sumEven = sumEven + number
      } else {                // Odd
         sumOdd += number;    // Same as sumOdd = sumOdd + number
      }
      ++number;  // Next number
   } 
   // Print the result
   System.out.println("The sum of numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + (sumOdd + sumEven));
   System.out.println("The average is " + ((sumOdd + sumEven)/((UPPERBOUND - LOWERBOUND) + 1.00)));
}
}