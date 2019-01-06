package lv.sdacademy;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.*;


public class WordCounterTest {
    private WordCounter wordCounter = new WordCounter();

    @Test
    public void countWordsForEmptyString() {
        Map<String, Integer> result = wordCounter.countWords("");

        assertTrue(result.isEmpty());
    }

    @Test
    public void countWords() {
        Map<String, Integer> result = wordCounter.countWords("test1,test2,asd,test2");

        assertThat(result, hasEntry("test1", 1));
        assertThat(result, hasEntry("test2", 2));
        assertThat(result, hasEntry("asd", 1));

        assertTrue(result.containsKey("test1"));
        assertTrue(result.containsKey("test2"));
        assertTrue(result.containsKey("asd"));

        assertEquals(Integer.valueOf(1), result.get("test1"));
        assertEquals(Integer.valueOf(2), result.get("test2"));
        assertEquals(Integer.valueOf(1), result.get("asd"));
    }
}
