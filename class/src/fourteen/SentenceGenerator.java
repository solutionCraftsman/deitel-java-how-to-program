package fourteen;

import java.security.SecureRandom;

public class SentenceGenerator {

    private String[] articles = {"the", "a", "one", "some", "any"};
    private String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] prepositions = {"to", "from", "over", "under", "on"};

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    public String[] getVerbs() {
        return verbs;
    }

    public void setVerbs(String[] verbs) {
        this.verbs = verbs;
    }

    public String[] getPrepositions() {
        return prepositions;
    }

    public void setPrepositions(String[] prepositions) {
        this.prepositions = prepositions;
    }

    public String getSentence() {
        StringBuilder builder = new StringBuilder();
        char space = ' ';
        SecureRandom random = new SecureRandom();
        int wordIndex = random.nextInt(5);

        String article = articles[wordIndex];
        char firstLetter = article.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        article = article.replace(article.charAt(0), firstLetter);

        builder.append(article);
        builder.append(space);

        String noun = nouns[wordIndex];
        builder.append(noun);
        builder.append(space);

        String verb = verbs[wordIndex];
        builder.append(verb);
        builder.append(space);

        String preposition = prepositions[wordIndex];
        builder.append(preposition);
        builder.append(space);

        article = articles[wordIndex];
        builder.append(article);
        builder.append(space);

        noun = nouns[wordIndex];
        builder.append(noun);
        builder.append('.');

        return builder.toString();
    }
}
