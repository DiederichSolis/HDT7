import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data d = new Data("house", "house", "casa", "loger");

    @Test
    void testGetEnglish() {
        assertEquals("house", d.getEnglish());
    }
    @Test 
    void testGetSpanish() {
    	assertEquals("casa", d.getSpanish());
    }
    @Test
    void testGetFrench() {
    	assertEquals("loger", d.getFrench());
    }
    @Test
    void testGetWord() {
    	assertEquals("house", d.getWord());
    }
    @Test
    void testSet() {
    	Data d1 = new Data();
    	d1.setEnglish("woman");
    	d1.setWord("mujer");
    	d1.setFrench("femme");
    	d1.setSpanish("mujer");
    	assertEquals("woman", d1.getEnglish());
    	assertEquals("mujer", d1.getSpanish());
    	assertEquals("femme", d1.getFrench());
    	assertEquals("mujer", d1.getWord());
    }
}