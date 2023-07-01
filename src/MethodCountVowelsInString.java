import java.util.Scanner;

public class MethodCountVowelsInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();

        System.out.println("The number of vowels in this word is: " + vowels(word));

    }

    static int vowels(String word){

        int count = 0;
       for (int i = 0; i<word.length(); i++){

           if (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||word.charAt(i) == 'i'
                   || word.charAt(i) == 'o'|| word.charAt(i) == 'u') {
                count++;
           }
       }
       return count;
    }
}
