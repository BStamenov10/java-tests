import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int result;

        for (int i = 1; i <= 10; i++){
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
