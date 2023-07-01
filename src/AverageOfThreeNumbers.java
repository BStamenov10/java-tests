import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First num: ");
        int num1 = scanner.nextInt();
        System.out.println("Second num: ");
        int num2 = scanner.nextInt();
        System.out.println("Third num: ");
        int num3 = scanner.nextInt();

        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average of these three numbers is: " + average);

    }
}
