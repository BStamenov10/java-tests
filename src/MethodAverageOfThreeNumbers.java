import java.util.Scanner;

public class MethodAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st num: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the 2nd num: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the 3rd num: ");
        double c = scanner.nextDouble();

        System.out.println("The average value is: "+average(a,b,c));
    }

    static double average(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;
    }

}
