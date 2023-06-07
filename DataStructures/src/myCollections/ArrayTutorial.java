package myCollections;

import java.util.Arrays;

public class ArrayTutorial {

    public static void main() {
        int[] primes = new int[] {2, 3, 5, 7, 9, 9, 9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(primes));

        var grades = new double[] {4.00f, 3.14f, 4.00f, 2.55f};
        System.out.println("Length: " + grades.length);
        System.out.println("Before: " + Arrays.toString(grades));
        Arrays.sort(grades);
        System.out.println("After: " + Arrays.toString(grades));

        // Declare Array as Memory Allocation
        var oddNumber = new int[10];
        Arrays.fill(oddNumber, 1);
        System.out.println(Arrays.toString(oddNumber));

        int foundIdx = Arrays.binarySearch(primes, 7);
        System.out.printf("Found %d at: %d \n", 7, foundIdx);

        String[] text = {"So", "many", "books", "so", "little", "time"};
        calWordFrequency(text, "ada");
    }

    public static void calWordFrequency(String[] text, String toSearch) {
        int counter = 0;

        // For-each
        for (String word : text) {
            if (word.compareToIgnoreCase(toSearch) == 0) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("The word " + toSearch + " is not found.");
            return;
        }

        System.out.println("Found " + toSearch + " : " + counter + " times");
    }
}
