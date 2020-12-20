package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, String[]> dictionary = new HashMap<>();
        Map<String, String[]> Dictionary = new HashMap<>();
        dictionary.put("человек", new String[]{"персона", "индивид", "хомосапиенс"});
        dictionary.put("дом", new String[]{"жилье", "крыша", "хата", "кров"});
        dictionary.put("сонный", new String[]{"уставший", "вялый", "помятый", "выжатый"});
        dictionary.put("красивый", new String[]{"прекрасный", "несравненный", "шикарный"});

        for (Map.Entry<String, String[]> item : dictionary.entrySet()) {
            System.out.println(item.getKey() + " - " + Arrays.toString(item.getValue()));
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово: ");
            String word = scanner.next();
            String[] synonyms = dictionary.get(word);
            if (synonyms != null) {
                Random random = new Random();
                int i = random.nextInt(synonyms.length);
                System.out.println(synonyms[i]);
            } else {
                System.out.println("Нема Слова");
            }
            Dictionary.putAll(dictionary);
            for (String list1 : dictionary.keySet()) {
                String key = list1;
                for (int i = 0; i < dictionary.get(key).length; i++) {
                    ArrayList<String> D = new ArrayList<>();
                    Collections.addAll(D, dictionary.get(key));
                    String temp = D.get(i);
                    D.set(i, key);
                    String[] Array = new String[D.size()];
                    for (int j = 0; j < D.size(); j++) {
                        Array[j] = D.get(j);
                    }
                    Dictionary.put(temp, Array);


                }
            }
        }
    }
}

