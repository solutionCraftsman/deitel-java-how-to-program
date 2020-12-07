package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDiaryEntryIsSet() {
        //given
        Diary myDiary = new Diary(5);

        //when
        int numberOfEntries = myDiary.getEntries().length;

        //assert
        assertEquals(5, numberOfEntries);
    }

    @Test
    void testDiaryEntryIsNotNull() {
        //given
        Diary myDiary;
        //when
        myDiary = new Diary(10);
        //assert
        Entry[] entries = myDiary.getEntries();
        assertNotNull(entries);
    }

    @Test
    void testDiaryEntryCanBeEnteredAndRetrieved() {
        //given
        Diary myDiary = new Diary(5);
        Entry entry = new Entry("My First Story");
        //when
        entry.setEntryBody("Great!");
        myDiary.addNewEntry(entry);
        //assert for index 0
        assertEquals(entry, myDiary.getEntries()[0]);
        //OR
        Entry[] expectedEntry = new Entry[5];
        expectedEntry[0] = entry;
        assertArrayEquals(expectedEntry, myDiary.getEntries());

        //Add to second index
        Entry secondEntry = new Entry("My Second Story");
        //when
        secondEntry.setEntryBody("Amazing!");
        myDiary.addNewEntry(secondEntry);
        //assert for index 1
        assertEquals(secondEntry, myDiary.getEntries()[1]);
        //OR
        expectedEntry[1] = secondEntry;
        assertArrayEquals(expectedEntry, myDiary.getEntries());

        //Add to remaining parts of the array
        for (int i = 2; i < myDiary.getEntries().length; i++) {
            myDiary.addNewEntry(secondEntry);
            assertEquals(secondEntry, myDiary.getEntries()[i]);
        }
    }

    @Test
    void testNoMoreEntryCanBeAddedWhenDiaryFull() {
        //given
        Diary myDiary = new Diary(5);
        Entry entry = new Entry("My First Story");
        //when
        entry.setEntryBody("Great!");

        for (int entryCounter = 0; entryCounter < myDiary.getEntries().length; entryCounter++) {
            myDiary.addNewEntry(entry);
        }

        assertEquals(5, myDiary.getNoOfEntriesAdded());

        myDiary.addNewEntry(entry);
        assertEquals(5, myDiary.getNoOfEntriesAdded());
    }
}

