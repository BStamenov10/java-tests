import java.util.Scanner;

public class AreaPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        double diameter = 2 * radius;
        double perimeter = Math.PI * diameter;

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
