/**
* Ariketa honek erabiltzailerari data bat zehazteko eskayu ondoren data hori formatu 
* laburrean eta gero luzean jarrijo ditu
*/

import java.util.Scanner;

public class Datak {
    public static void main(String[] args) {

        int urtea, eguna, hilabetea;
        char baiztatu;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("DATA: ");
            System.out.print("Urtea: ");
            urtea = in.nextInt();

            System.out.print("Hilabetea: ");
            hilabetea = in.nextInt();

            System.out.print("Eguna: ");
            eguna = in.nextInt();

            System.out.println("Data Formatu laburrean: " + dataLaburra(urtea, hilabetea, eguna));
            System.out.println("Data Formatu luzean: " + dataLuzea(urtea, hilabetea, eguna));
            System.out.print("Beste data bat satu nahi duzu(B/E)?: ");
            baiztatu = in.next().charAt(0);
            in.close();
        } while (baiztatu!='E');
    } 
   

    public static String dataLuzea(int urtea, int hilabetea, int eguna) {
        if (hilabetea == 1) {
            return (urtea + "ko" + "Urtarrilaren" + eguna + "a");
        }
        if (hilabetea == 2) {
            return (urtea + "ko" + "Otsailaren" + eguna + "a");
        }
        if (hilabetea == 3) {
            return (urtea + "ko" + "Martxoaren" + eguna + "a");
        }
        if (hilabetea == 4) {
            return (urtea + "ko" + "Apirilaren" + eguna + "a");
        }
        if (hilabetea == 5) {
            return (urtea + "ko" + "Maiatzaren" + eguna + "a");
        }
        if (hilabetea == 6) {
            return (urtea + "ko" + "Ekainaren" + eguna + "a");
        }
        if (hilabetea == 7) {
            return (urtea + "ko" + "Uztailaren" + eguna + "a");
        }
        if (hilabetea == 8) {
            return (urtea + "ko" + "Abuztuaren" + eguna + "a");
        }
        if (hilabetea == 9) {
            return (urtea + "ko" + "Irailaren" + eguna + "a");
        }
        if (hilabetea == 10) {
            return (urtea + "ko" + "Urriaren" + eguna + "a");
        }

        if (hilabetea == 11) {
            return (urtea + "ko" + "Azaroaren" + eguna + "a");
        }
        if (hilabetea == 12) {
            return (urtea + "ko" + "Abenduaren" + eguna + "a");
        } else {
            return ("ez da existitzen");
        }
    }

    public static String dataLaburra(int urtea, int hilabetea, int eguna) {
        return (urtea + "-" + hilabetea + "-" + eguna);
    }
}
