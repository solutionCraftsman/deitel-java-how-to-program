package one.four;

import java.util.HashMap;

public class CountingLetters {

    public static HashMap<Character, Integer> count(String sentence) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            if(!map.containsKey(sentence.charAt(i))) {
                map.put(sentence.charAt(i), 1);
            } else {
                map.replace(sentence.charAt(i), map.get(sentence.charAt(i)) + 1);
            }
        }
        return map;
    }

}
