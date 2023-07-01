import java.util.Scanner;

public class AreaPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width for a rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter a height for a rectangle: ");
        double height = scanner.nextDouble();

        double area = height * width;
        double perimeter = 2 * (height+width);

        System.out.println("The area is: "+ area);
        System.out.println("The perimeter is: "+ perimeter);
    }
}
