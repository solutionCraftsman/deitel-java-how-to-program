package one.six;

import java.util.HashMap;

public class CountingDuplicateWords {

    public static HashMap<String, Integer> count(String sentence) {
        HashMap<String, Integer> map = new HashMap<>();

//        String splitOn = "[\" \"] | [\", \"] | ['. ']";
        String splitOn = " ";
        String[] words = sentence.split(splitOn);

        for (int i = 0; i < words.length; i++) {
            if(!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.replace(words[i], map.get(words[i]) + 1);
            }
        }
        return map;
    }

}
