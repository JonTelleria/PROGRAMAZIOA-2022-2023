import java.util.Scanner;
//**Caesar's Code is one of the simplest encryption techniques. 
//*Each letter in the plaintext is replaced by a letter some fixed number of position (n) down the alphabet cyclically. 
//In this exercise, we shall pick n=3. That is, 'A' is replaced by 'D', 'B' by 'E', 'C' by 'F', ..., 'X' by 'A', ..., 'Z' by 'C'.*//
 
public class CaesarCode {
    public static void main(String[] args) {
        String inStr;
        int Strlen;
        char momch;

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a String: "); 
        inStr = in.next();    
        in.close();

        Strlen = inStr.length();
        inStr = inStr.toUpperCase();

        for (int x =0; x < Strlen; x++){
            momch = inStr.charAt(x);
            if(momch == 88|| momch == 89 || momch==90 ){
                momch -= 23;
                System.out.print(momch);

            }else if(momch >= 65 && momch <= 87){
                momch += 3;
                System.out.print(momch);
            }else {
                System.out.print("-- incorrect caracter--");
            }


        }
        System.out.println();
    }
}