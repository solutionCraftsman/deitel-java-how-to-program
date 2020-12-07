package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    Entry entry;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEntryCanChangeTitle() {
        //given
        entry = new Entry("My Title");
        //when
        entry.setEntryTitle("New Entry Title");
        String entryTitle = entry.getEntryTitle();
        //assert
        assertEquals("New Entry Title", entryTitle);
    }

    @Test
    void testDateOfEntryIsCreatedAfterConstruction() {
        //given
        Entry newEntry;
        //when
        newEntry = new Entry("My Title");
        //assert
        LocalDateTime entryDateAndTime = newEntry.getEntryDateAndTime();
        assertNotNull(entryDateAndTime);
        //assert
        LocalDate entryDate = entryDateAndTime.toLocalDate();
        assertEquals(LocalDate.now(), entryDate);
        System.out.println(entryDateAndTime.toString());
    }

    @Test
    void testEntryBodyCanBeEdited() {
        //given
        Entry newEntry = new Entry("New Entry");
        //when
        newEntry.setEntryBody("This is the entry body");
        //assert
        String entryBody = newEntry.getEntryBody();
        assertEquals("This is the entry body", entryBody);
    }

    @Test
    void testViewEntry() {
        //given
        Entry entry = new Entry("My First Story");
        entry.setEntryBody("Great!");
        String preview = entry.viewEntry();
        String expected = (
                "Title: My First Story\n"
                + "Entry Date: " + LocalDate.now() + "\n"
                + "Entry Body: Great!"
                );

        assertEquals(expected, preview);
    }
}