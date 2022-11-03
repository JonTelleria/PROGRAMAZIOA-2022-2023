import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);
        do {

            System.out.print("Enter the number: ");
            number = in.nextInt();

            if (isOdd(number) == true) {

                System.out.println(number + " is an odd number ");

            } else {

                System.out.println(number + " is an even number ");

            }

        } while (number >= 0);

        in.close();
    }

    public static boolean isOdd(int number) {

        boolean odd = false;

        if (number % 2 == 0) {
            odd = false;
        } else {
            odd = true;
        }

        return odd;

    }

}