package myCollections;

import  java.util.*;
import java.util.HashSet;

public class SetsTutorial {

    public static void main() {
        HashSetTutorial();
    }

    private static void HashSetTutorial() {
        // Init HashSet
        String[] heroes = new String[] {"Iron man", "Spider-Man", "Thor", "Spider-Man"};
        Set<String> signedHeroes = new HashSet<>();
        Collections.addAll(signedHeroes, heroes);
        System.out.println(signedHeroes);

        // Union Operation
        var intA = new Integer[] {1, 2, 3};
        var intB = new Integer[] {1, 2, 3, 4, 5};
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Collections.addAll(A, intA);
        Collections.addAll(B, intB);

        Union(A, B);
    }

    public static void Union(Set A, Set B) {
        A.addAll(B);
        System.out.println(A);
    }
}
