package lv.sdacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class WordCounter {

    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> result = new HashMap<String, Integer>();

        List<String> words = asList(text.split(","));

        for (String word : words) {
            if (word.length() > 0) {
                if (result.containsKey(word)) {
                    Integer counter = result.get(word);
                    result.put(word, counter + 1);
                } else {
                    result.put(word, 1);
                }
            }
        }

        return result;
    }
}
