public class Product1ToN { // Save as "SumAverageRunningInt.java"
    public static void main(String[] args) {
        final long LOWERBOUND = 1;
        final long UPPERBOUND = 10;
        long product = 1; // For accumulating odd numbers, init to 0
        long number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            product = product * number;

        }
        ++number; // Next number

        // Print the result
        System.out.println("The product of numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);

    }
}