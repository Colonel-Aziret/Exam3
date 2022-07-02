package Task1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Task 1

        Integer[] numbers = new Integer[100];
        LinkedList<Integer> linkedList = new LinkedList<>();   // Как я понял через HashSet не получится. Надо использовать LinkedHashSet, так как только он хранит последовательность.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0 && numbers[i] % 5 == 0) {
                linkedList.addFirst(numbers[i]);
            } else if (numbers[i] % 2 == 0 && numbers[i] % 5 != 0) {
                linkedList.addLast(numbers[i]);
            }
        }
        HashSet<Integer> hashSet = new LinkedHashSet<>(linkedList);
        System.out.println("\n" + hashSet);
    }
}


