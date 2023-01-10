import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestStringAnalyzer {

    @Test
    public void testOnlyLetters() {
        String input = "zAaBbCcDd";
        String expected = "aabbccddzz";
        String result = StringAnalyzer.convertAlphaNumeric(input);
        assertEquals(expected, result);
    }

    @Test
    public void testOnlyNumbers() {
        String input = "1234567890";
        String expected = "0123456789";
        String result = StringAnalyzer.convert
