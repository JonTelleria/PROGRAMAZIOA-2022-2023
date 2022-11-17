import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {
        char ikurra;
        Laukia l1 = new Laukia();
        Scanner in = new Scanner(System.in);
        System.out.printf("Sartu laukiaren zabalera: ");
        l1.setZabalera(in.nextInt());
        System.out.println();

        System.out.printf("Sartu laukiaren altuera: ");
        l1.setAltuera(in.nextInt());
        System.out.println();

        System.out.printf("Zein ikurrekin nahi duzu laukia bete? ");
        ikurra = in.next().charAt(0);
        System.out.println();

        System.out.printf("Hona marrazkia beteta:\n");
        System.out.println();
        l1.marraztuBeteta();

        System.out.printf("Hona marrazkia hutsik:\n");
        System.out.println();
        l1.marraztuHutsik();

        System.out.printf("Hona marrazkia ikurrekin beteta:\n");
        System.out.println();
        l1.marraztuBeteta(ikurra);

        System.out.println("Hona emen stringa");
        System.out.println(l1.laukiBetea());
        in.close();
    }
}
