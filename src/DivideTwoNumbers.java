import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write 1st number: ");
        int x = input.nextInt();

        System.out.println("Write 2nd number: ");
        int y = input.nextInt();

        int result = x / y;
        System.out.println("The division of these two numbers is:  " + result);
    }
}
