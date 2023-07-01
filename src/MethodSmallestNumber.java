import java.util.Scanner;

public class MethodSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        System.out.print("The smallest values is: " + smallest(num1,num2,num3));
    }

    static double smallest(double num1, double num2, double num3){
        return Math.min(Math.min(num1,num2),num3);
    }
}
