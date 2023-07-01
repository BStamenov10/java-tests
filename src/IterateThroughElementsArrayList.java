import java.util.ArrayList;

public class IterateThroughElementsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(34);
        numbers.add(654);

        for (Integer i : numbers){
            System.out.println(i);
        }

    }
}
