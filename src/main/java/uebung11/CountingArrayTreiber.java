package uebung11;

import java.util.List;

public class CountingArrayTreiber {

    public static void main(String[] args) {
        CountingArrayList<String> emptyList = new CountingArrayList<>();

        CountingArrayList<String> list = new CountingArrayList<>(
            List.of("apple", "banana", "apple", "cherry")
        );

        System.out.println("Count of first participant : " + list.count("apple")); // 2
        System.out.println("Count of second participant': " + list.count("banana")); // 1
        System.out.println("Unique elements: " + list.unique()); // 3
        System.out.println("Total getCount: " + list.getCount()); // 3

        System.out.println("Done with Testtreiber.");
    }
}
