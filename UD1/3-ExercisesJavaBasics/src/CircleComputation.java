import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {

        double radius, diameter, circumference, area;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circumference: ");
        radius = in.nextDouble();
        in.close();

        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("The diameter is: %.2f%n ", diameter);
        System.out.printf("The circumference is: %.2f%n ", circumference);
        System.out.printf("The area is: %.2f%n ", area);

    }
}