
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IMadariaga
 */
public class MenuSinplea {
    private static int LAUKI_KOP = 10;
    private static int sortutakoak = 0;
    private static Laukia[] laukiak;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("Lehen aukera aukeratu duzu.");
                    System.out.println("");
                    sortu();
                    break;
                case 2:
                    System.out.println("Bigarren aukera aukeratu duzu.");
                    System.out.println("");
                    inprimitu();
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    System.out.println("");
                    marraztu();
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    System.out.println("");
                    handiena();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);

        in.close();
    }

    public static void sortu() {
        laukiak = new Laukia[LAUKI_KOP];
        int zab, alt;

        if (sortutakoak <= 10) {
            System.out.println("LAUKI BERRIA SORTZEN");

            System.out.print("Sartu zabalera: ");
            zab = in.nextInt();
            System.out.println();
            System.out.print("Sartu altuera: ");
            alt = in.nextInt();
            System.out.println();

            laukiak[sortutakoak] = new Laukia(zab, alt);
            sortutakoak++;

            System.out.println("...");

        } else {
            System.out.println("Ezin dituzu lauki gehiago sortu.");
        }
    }

    public static void inprimitu() {
        System.out.printf("Laukia %10s %10s %10s %10s %15s \n", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println(
                "=========================================================================================================");

        for (int i = 0; i < sortutakoak; i++) {
            System.out.printf("%5d %10d %10d %10d %10d %15s \n", i + 1, laukiak[i].getZabalera(),
                    laukiak[i].getAltuera(), laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
        }

    }

    private static void marraztu() {
        System.out.print("Zenbatgarren karratu marraztu nahi duzu? ");
        int x = in.nextInt() - 1;
        System.out.print("Beteta ala hutsik (B/H)? ");
        String erantzuna = in.next();

        if (erantzuna.equals("B")) {
            for (int row = 0; row < laukiak[x].getAltuera(); row++) {
                for (int col = 0; col < laukiak[x].getZabalera(); col++) {
                    if (row == 0 || row == laukiak[x].getAltuera() - 1 || col == 0
                            || col == laukiak[x].getZabalera() - 1) {
                        System.out.printf("* ");
                    } else {
                        System.out.printf("  ");
                    }
                }
                System.out.printf("\n");

            }
        } else if (erantzuna.equals("H")) {
            for (int row = 0; row < laukiak[x].getAltuera(); row++) {
                for (int col = 0; col < laukiak[x].getZabalera(); col++) {
                    if (row == 0 || row == laukiak[x].getAltuera() - 1 || col == 0
                            || col == laukiak[x].getZabalera() - 1) {
                        System.out.printf("* ");
                    } else {
                        System.out.printf("  ");
                    }
                }
                System.out.printf("\n");
            }
        } else {

            System.out.print("idatzi berriz B edo H");

        }
    }

    public static void handiena(){

        Laukia handiena = new Laukia();

        handiena = Laukia.getTheBiggest(laukiak);

        System.out.println( "Laukirik handiena hau da: " + handiena.toString());

    }
}
