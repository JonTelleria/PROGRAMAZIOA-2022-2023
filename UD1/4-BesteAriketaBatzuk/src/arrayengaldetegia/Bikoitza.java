package arrayengaldetegia;

import java.util.Scanner;

public class Bikoitza {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] items;
        items = new int[5];

        System.out.print("Enter the value of 5 items (separated by space):");

        for (int i = 0; i < items.length; ++i) {

            items[i] = in.nextInt();

        }

        System.out.print("[");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {

                System.out.print(items[0]);
            } else {

                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {

                System.out.print(items[0] * 2);
            } else {

                System.out.print(", " + items[i] * 2);
            }
        }
        System.out.println("]");

        in.close();
    }

}
