package seven;

public class PigLatin {

    public static String getLatinWord(String word) {
        StringBuilder builder = new StringBuilder();

        for (int letterIndex = 1; letterIndex < word.length(); letterIndex++) {
            builder.append(word.charAt(letterIndex));
        }

        builder.append(word.charAt(0));
        builder.append('a');
        builder.append('y');

        return builder.toString();
    }

    public static String encodePhrase(String phrase) {
        String[] wordsInPhrase = phrase.split(" ");
        StringBuilder builder = new StringBuilder();
        String wordInLatin;

        for (String word : wordsInPhrase) {
            wordInLatin = getLatinWord(word);
            builder.append(wordInLatin);
            builder.append(' ');
        }

        builder.deleteCharAt(builder.lastIndexOf(" "));
        return builder.toString();
    }
}
