import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = input.nextInt();

        System.out.println("Input the second number: ");
        int num2 = input.nextInt();

        int product = num1 * num2;
        System.out.println("The product of these two numbers is: " + product);

    }
}
