import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculateBaseScore {

    @Test
    public void testPositiveLogical() {
        int[] scores = {5, 10, 15};
        int base = 5;
        double expected = 4;
        double result = calculateBaseScore(scores, base);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testNegativeLogical() {
        int[] scores = {5, 10, 15};
        int base = -1;
        double expected = 0;
        double result = calculateBaseScore(scores, base);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPositiveConcrete() {
        int[] scores = {5, 10, 15};
        int base = 5;
        double expected = 4;
        double result = calculateBaseScore(scores, base);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testNegativeConcrete() {
        int[] scores = {0, 0, 0};
        int base = 5;
        double expected = 0;
        double result = calculateBaseScore(scores, base);
        assertEquals(expected, result, 0.01);
    }
}
