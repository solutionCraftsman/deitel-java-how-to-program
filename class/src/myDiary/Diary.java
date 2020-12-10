package myDiary;

public class Diary {

    private Entry[] entries;
    private int noOfEntriesAdded;

    public Diary(int numberOfEntries) {
        this.entries = new Entry[numberOfEntries];
        noOfEntriesAdded = 0;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry entry) {
        if(noOfEntriesAdded < entries.length) {
            entries[noOfEntriesAdded++] = entry;
        }
    }

    public int getNoOfEntriesAdded() {
        return noOfEntriesAdded;
    }
}
