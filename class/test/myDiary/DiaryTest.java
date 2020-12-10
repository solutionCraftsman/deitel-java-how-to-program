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
        Diary myDiary = new Diary(3);
        Entry entry = new Entry("My First Story");
        //when
        entry.setEntryBody("Great!");
        myDiary.addNewEntry(entry);
        //assert for index 0
        assertEquals(entry, myDiary.getEntries()[0]);
        //OR
        Entry[] expectedEntry = new Entry[3];
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

        //Add to third index
        Entry thirdEntry = new Entry("My Third Story");
        //when
        secondEntry.setEntryBody("Glorious!");
        myDiary.addNewEntry(secondEntry);
        //assert for index 2
        assertEquals(secondEntry, myDiary.getEntries()[2]);
        //OR
        expectedEntry[2] = secondEntry;
        assertArrayEquals(expectedEntry, myDiary.getEntries());
    }

    @Test
    void testNoMoreEntryCanBeAddedWhenDiaryFull() {
        //given
        Diary myDiary = new Diary(2);
        Entry entry = new Entry("My First Story");
        //when
        entry.setEntryBody("Great!");
        myDiary.addNewEntry(entry);

        Entry secondEntry = new Entry("My Second Story");
        //when
        secondEntry.setEntryBody("Amazing!");
        myDiary.addNewEntry(secondEntry);

        assertEquals(2, myDiary.getNoOfEntriesAdded());

        //Add extra entry
        Entry thirdEntry = new Entry("My Third Story");
        //when
        thirdEntry.setEntryBody("Glorious!");
        myDiary.addNewEntry(thirdEntry);

        assertEquals(2, myDiary.getNoOfEntriesAdded());
    }
}

