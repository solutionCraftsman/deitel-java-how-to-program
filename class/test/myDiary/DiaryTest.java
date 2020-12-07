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
        int numberOfEntries = myDiary.getNumberOfDiaryEntries();

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

}