import java.util.Scanner;
public class GradesStatistics {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int NUM_ITEMS;
        int[] items;
        double average;
        double max;
        double min;
        double sum = 0;

        System.out.print("Enter the number of students ");
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];

        if (items.length > 0) {

            for (int i = 0; i < items.length; ++i) {
                System.out.print("Enter the grade the of student" + (i + 1) + ":");
                items[i] = in.nextInt();

            }
        } else {
            System.out.println("Enter a positive length ");

        }

        min = items[0];
        max = items[0];

        for (int i = 0; i < items.length; ++i) {

            sum += items[i];
            if (min > items[i]) {

                min = items[i];
            }
            if (max < items[i]) {

                max = items[i];
            }

        }

        average = sum / items.length;

        System.out.println("The average is: " + average);
        System.out.println("The minimun is: " + min);
        System.out.println("The maximun is: " + max);

        in.close();
    }

}
