import java.util.Scanner;

public class HasEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SENTINEL = -1;
        int number;
        int sum = 0;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {

            if (hasEight(number)) {
                sum+= number;
            }
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();
        }
        in.close();
        System.out.println("the magic sum is :" + sum);
        
        
    }

    public static boolean hasEight(int zenbakia) {

        int azkenDigitoa;
       while( zenbakia > 0){
        azkenDigitoa = zenbakia % 10;
        if(azkenDigitoa == 8) {
            return true;
        }
        zenbakia /= 10; //se podria poner un else y esto significa zenbakia = zenbakia/10
       }
       return false;

    }
}
