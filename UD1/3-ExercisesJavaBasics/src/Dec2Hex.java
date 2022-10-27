import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {

        int dec;
        String hexStr = "";
        int hex = 16;
        final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        dec = in.nextInt();
        in.close();

        while (dec > 0) {
            int hexDigit = dec % hex;
            hexStr = HEX_CHARS[hexDigit] + hexStr;
            dec = dec / hex;
        }
        System.out.println("The equivalent hexadecimal number is " + hexStr);
    }
}
