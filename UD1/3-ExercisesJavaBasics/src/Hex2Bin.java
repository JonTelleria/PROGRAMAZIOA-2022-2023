import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {

        String hexStr;
        int Length;
        String binStr = "";
        char hexChar;
        final String[] HEX_BITS = { "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        hexStr = in.next();
        Length = hexStr.length();
        in.close();

        for (int character = 0; character < Length; ++character) {
            hexChar = hexStr.charAt(character);
            if (hexChar >= '0' && hexChar <= '9') {
               binStr += HEX_BITS[hexChar - '0'] ;  // index into the BIN_STRS array and concatenate
            } else if (hexChar >= 'a' && hexChar <= 'f') {
               binStr += HEX_BITS[hexChar - 'a' + 10] ;
            } else if (hexChar >= 'A' && hexChar <= 'F') {
               binStr += HEX_BITS[hexChar - 'A' + 10] ;
            } else {
               System.err.println("error: invalid hex string \"" + hexStr + "\"");
               return;   // or System.exit(1);
            }
             
            binStr += " ";
         }
         System.out.println("The equivalent binary for \"" + hexStr + "\" is \"" + binStr + "\"");

    }
}