package myDiary;

public class Diary {

    private Entry[] entries;

    public Diary(int numberOfEntries) {
        this.entries = new Entry[numberOfEntries];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        //return null;
        return entries;
    }
}
