import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    @ParameterizedTest
    @CsvSource(value = {"a:b:false", "aa:ab:false", "aa:aab:true"}, delimiter = ':')
    void testRansomNoteMagazine(String ransomNote, String magazine, boolean expected) {
        RansomNote ransomNoteObject = new RansomNote();
        assertEquals(expected, ransomNoteObject.canConstruct(ransomNote, magazine));
    }
}