package myDiaryTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserEntryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testUserEntry_hasTitleAfterConstruction() {
        //given
        UserEntry userEntry;
        //when
        userEntry = new UserEntry("My First Entry");
        //assert
        String entryTitle =userEntry.getEntryTitle();
        assertEquals("My First Entry", entryTitle);
    }

    @Test
    void testThatUserEntry_hasDateAndTimeOfEntryAfterConstruction() {
        //given
        UserEntry userEntry;
        //when
        userEntry = new UserEntry("My First Entry");
        //assert
        assertNotNull(userEntry.getEntryDateAndTime());
    }

    @Test
    void testDateAndTimeOfEntry_isCurrentAfterEntryCreation() {
        //given
        UserEntry userEntry = new UserEntry("My First Entry");
        //when
        LocalDateTime localDateTime = userEntry.getEntryDateAndTime();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalDate currentDate = LocalDate.now();
        //assert
        assertEquals(currentDate, localDate);
    }

    @Test
    void testUserEntryTitle_canBeChanged() {
        //given
        UserEntry userEntry = new UserEntry("My First Entry");
        //when
        userEntry.updateEntryTitle("Updated Entry Title");
        //assert
        assertEquals("Updated Entry Title", userEntry.getEntryTitle());
    }
}

