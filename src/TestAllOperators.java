import java.util.Scanner;

public class TestAllOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input a number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;


        System.out.println(sum + "\n" + subtraction + "\n" + multiplication + "\n" + division + "\n" + remainder);
    }
}
