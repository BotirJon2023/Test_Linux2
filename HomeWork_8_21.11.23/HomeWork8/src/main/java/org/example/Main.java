package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree();
        tree.add("C", 10);
        tree.add("A", 5);
        tree.add("B", 2);
        tree.add("F", 100);
        tree.add("K", 100);
        tree.add("X", 100);
        System.out.println(tree.find("A"));
        System.out.println(tree.find("B"));
        System.out.println(tree.find("C"));
        System.out.println(tree.find("D"));
        System.out.println(tree.getKeys());

        System.out.println("Key by value, DFS: " + tree.findByValueDFS(2));
        System.out.println("Key by value, BFS: " + tree.findByValueBFS(2));

        String[] data = {"C", "D", "B", "A", "F", "E"};
        System.out.println("Input: " + Arrays.toString(data));
        Iterable<String> sortedData = sortWithTree(data);
        System.out.println("Output: " + sortedData);
    }

    private static Iterable<String> sortWithTree(String[] data) {
    return null;

    }


}
