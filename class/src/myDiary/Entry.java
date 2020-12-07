package myDiary;

import java.time.LocalDateTime;

public class Entry {

    private String entryTitle;
    private String entryBody;
    private LocalDateTime entryDateAndTime;

    public Entry(String entryTitle) {
        this.entryTitle = entryTitle;
        entryDateAndTime = LocalDateTime.now();
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryDateAndTime;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public String viewEntry() {
        //return null;
        return toString();
    }

    @Override
    public String toString() {
        return (
                "Title: " + getEntryTitle() + "\n"
                        + "Entry Date: " + getEntryDateAndTime().toLocalDate() + "\n"
                        + "Entry Body: " + getEntryBody()
        );
    }
}
