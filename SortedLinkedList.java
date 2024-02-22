import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class implements a program that reads a list of integers from the user,
 * stores them in a LinkedList, sorts them in ascending order, and then prints
 * the sorted list.
 */

public class SortedLinkedList {
    public static void main(String[] args) {
        // Setup the scanner to read from standard input
        Scanner sc = new Scanner(System.in);

        // Create a LinkedList to store Integer values
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers to add to the list (type 'done' to finish):");

        // Read input until 'done' is entered
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                // If the input is an integer, add it to the list
                numbers.add(sc.nextInt());
            } else {
                String input = sc.next();
                if ("done".equalsIgnoreCase(input)) {
                    // If 'done' is entered, break the loop
                    break;
                } else {
                    // If the input is not an integer or 'done', notify the user
                    System.out.println("Please enter an integer or 'done' to finish.");
                }
            }
        }

        // Sort the linked list
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted List:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
