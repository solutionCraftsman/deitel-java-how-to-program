package fourteen;

import java.security.SecureRandom;
import java.util.Stack;

public class SentenceGenerator {

    private String[] articles = {"the", "a", "one", "some", "any"};
    private String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] prepositions = {"to", "from", "over", "under", "on"};
    private Stack<String> stack;

    public String[] getArticles() {
        return articles;
    }

    public String getSentence() {
        StringBuilder builder = new StringBuilder();
        char space = ' ';
        SecureRandom random = new SecureRandom();
        int wordIndex = random.nextInt(5);

        String nextWord = articles[wordIndex];
        char firstLetter = nextWord.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        nextWord = nextWord.replace(nextWord.charAt(0), firstLetter);

        builder.append(nextWord);
        builder.append(space);

        wordIndex = random.nextInt(5);
        nextWord = nouns[wordIndex];
        builder.append(nextWord);
        builder.append(space);

        wordIndex = random.nextInt(5);
        nextWord = verbs[wordIndex];
        builder.append(nextWord);
        builder.append(space);

        wordIndex = random.nextInt(5);
        nextWord = prepositions[wordIndex];
        builder.append(nextWord);
        builder.append(space);

        wordIndex = random.nextInt(5);
        nextWord = articles[wordIndex];
        builder.append(nextWord);
        builder.append(space);

        wordIndex = random.nextInt(5);
        nextWord = nouns[wordIndex];
        builder.append(nextWord);
        builder.append('.');

        return builder.toString();
    }
}
