import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordCountTest {

    @Test
    public void testaMening() {
       WordCount wordCount = new WordCount();
       wordCount.wordList.add("Hej jag heter kim");
       wordCount.breakdown("Hej jag heter kim");

       assertEquals(1, wordCount.wordList.size());
       assertEquals(14, wordCount.wordChar);
       assertEquals(4,wordCount.wordTot);
       assertEquals("heter", wordCount.wordLong);
    }

    @Test
    public void testaUtanMelanslag() {
        WordCount wordCount = new WordCount();
        wordCount.wordList.add("HejJagHeterKim");
        wordCount.breakdown("HejJagHeterKim");

        assertEquals(1, wordCount.wordList.size());
        assertEquals(14, wordCount.wordChar);
        assertEquals(1,wordCount.wordTot);
        assertEquals("HejJagHeterKim", wordCount.wordLong);
    }
    @Test
    public void testaTommaInmatningar() {
        WordCount wordCount = new WordCount();
        wordCount.wordList.add("");
        wordCount.breakdown("");

        assertEquals(1, wordCount.wordList.size());
        assertEquals(0, wordCount.wordChar);
        assertEquals(0,wordCount.wordTot);
        assertEquals("", wordCount.wordLong);
    }
    @Test
    public void testaInmatningMedBaraMellanslag() {
        WordCount wordCount = new WordCount();
        wordCount.wordList.add("       ");
        wordCount.breakdown("    ");

        assertEquals(1, wordCount.wordList.size());
        assertEquals(0, wordCount.wordChar);
        assertEquals(0,wordCount.wordTot);
        assertEquals("", wordCount.wordLong);
    }
    @Test
    public void testaMedTecken() {
        WordCount wordCount = new WordCount();
        wordCount.wordList.add("Hej! Jag heter Kim! Vad heter du?");
        wordCount.breakdown("Hej! Jag heter Kim! Vad heter du?");

        assertEquals(1, wordCount.wordList.size());
        assertEquals(27, wordCount.wordChar);
        assertEquals(7,wordCount.wordTot);
        assertEquals("heter", wordCount.wordLong);
    }

    @Test
    public void testaMedSiffror() {
        WordCount wordCount = new WordCount();
        wordCount.wordList.add("12345");
        wordCount.breakdown("12345");

        assertEquals(1, wordCount.wordList.size());
        assertEquals(5, wordCount.wordChar);
        assertEquals(1, wordCount.wordTot);
        assertEquals("12345", wordCount.wordLong);
    }

    @Test
    public void testaMedFlerRader() {
        WordCount wordCount = new WordCount();
        wordCount.wordList.add("hej");
        wordCount.wordList.add("jag");
        wordCount.wordList.add("heter");
        wordCount.wordList.add("kim");
        wordCount.breakdown("hej");
        wordCount.breakdown("jag");
        wordCount.breakdown("heter");
        wordCount.breakdown("kim");

        assertEquals(4, wordCount.wordList.size());
        assertEquals(14, wordCount.wordChar);
        assertEquals(4, wordCount.wordTot);
        assertEquals("heter", wordCount.wordLong);
    }
}
