import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main (String[] args) {

        int inNumber;  
        int inDigit;
        int finalsum = 0; 

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a positive integer: "); 
        inNumber = in.nextInt();                     

        in.close();

        while(inNumber >0){

            inDigit = inNumber % 10;
            finalsum += inDigit;
            
            inNumber /= 10;

        }

        System.out.println("The sum of all digits is: " + finalsum);

    }
}
