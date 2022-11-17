import java.util.Scanner;
/**
* Programa honek 1 etik 50 era zenbakiak imprimatuko ditu beraien artean - jarriko dira
* eta multiplo bat eskatzerakoan izartxoak jarriko ditu
*/
public class Izartxoak {
    public static void main(String[] args) {
        final int LOWERBOUND = 1, UPPERBOUND = 50;
        int multiplo;
        Scanner in = new Scanner(System.in);
        System.out.println("Esan zenbaki bat (1-10) :");
        multiplo = in.nextInt();
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {

            if (number % multiplo == 0) {
                System.out.print("* - ");
            } else {
                System.out.print(number + " - ");
            }
        }
        in.close();
    }
}

