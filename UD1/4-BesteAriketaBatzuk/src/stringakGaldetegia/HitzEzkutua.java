import java.util.Scanner;

public class HitzEzkutua {
    public static void main(String[] args) {
        // Declare variables
        String hitza = "udazkena";
        char hizkia;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu karaktere bat? ");
        hizkia = in.next().charAt(0);
        for (int i = 0; i < hitza.length(); ++i) {
            if (hizkia == hitza.charAt(i)) {
                System.out.print(hizkia);
            } else {
                System.out.print('-');
            }
        }

        in.close();

    }
}
