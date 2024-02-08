package org.example;

import java.util.*;

public class HomeWork10 {

    public static void main(String[] args) {
        String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf", "tact"};
        groupWords(words);
        List<List<String>> wordGroups = groupWords(words);

        Map<String, List<String>> groups = new HashMap<>();

        for (
                String word : words) {
            String sortedChars = sortChars(word);

            if (!groups.containsKey(sortedChars)) {
                groups.put(sortedChars, new ArrayList<>());
            }

            groups.get(sortedChars).add(word);
        }

        int groupNumber = 1;
        for (
                List<String> group : groups.values()) {
            System.out.print("Набор букв " + groupNumber + " группы: ");
            for (String word : group) {
                System.out.print(word + " ");
            }
            System.out.println();
            groupNumber++;
        }


        for (List<String> group : wordGroups) {
            for (String word : group) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupWords(String[] words) {
        List<List<String>> wordGroups = new ArrayList<>();

        // Создаем Map, где ключом будет набор символов, а значением - список слов с таким набором символов
        Map<String, List<String>> wordMap = new HashMap<>();

        // Проходим по каждому слову
        for (String word : words) {
            // Создаем массив символов из слова и сортируем его
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Проверяем, есть ли уже в Map слова с таким набором символов
            if (wordMap.containsKey(sortedWord)) {
                // Если есть, добавляем слово в список
                wordMap.get(sortedWord).add(word);
            } else {
                // Если нет, создаем новый список и добавляем его в Map
                List<String> group = new ArrayList<>();
                group.add(word);
                wordMap.put(sortedWord, group);
            }
        }

        // Добавляем каждый список из Map в общий список wordGroups
        wordGroups.addAll(wordMap.values());

        return wordGroups;
    }


    private static String sortChars(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}

