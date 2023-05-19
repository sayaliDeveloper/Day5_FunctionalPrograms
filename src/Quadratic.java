import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 of x: " + root1);
            System.out.println("Root 2 of x: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has a single root: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
