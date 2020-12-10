package myDiaryTwo;

import java.time.LocalDateTime;

public class UserEntry {

    private String entryTitle;
    private LocalDateTime entryDateAndTime;

    public UserEntry(String entryTitle) {
        this.entryTitle = entryTitle;
        entryDateAndTime = LocalDateTime.now();
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryDateAndTime;
    }

    public void updateEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }
}
