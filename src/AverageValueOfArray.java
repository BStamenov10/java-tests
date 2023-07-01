import java.util.Scanner;

public class AverageValueOfArray {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number of elements in array: ");
        int numElements = Scanner.nextInt();

        int[] numbers = new int[numElements];
        double temp = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("Enter an Element " + count + ": ");
            int element = Scanner.nextInt();
            temp = element + temp;
            count++;
        }
        double average = temp / numElements;
        System.out.printf("The average value of array elements is: " + average);
    }
}
