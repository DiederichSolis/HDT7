import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitarTest {
    @Test
    public void testVisitarNodo() {
        NodoArbol<String, Data> arbol = new NodoArbol<String, Data>("palabra", new Data("word", "english", "spanish", "french"));
        Visitar<String, Data> visitar = new Visitar<String, Data>();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        visitar.VisitarNodo(arbol);
        String expectedOutput = "Inglés: english Español: spanish Francés: french\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}