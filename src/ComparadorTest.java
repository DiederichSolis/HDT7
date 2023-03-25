import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComparadorTest {

	@Test
	void testCompare() {
		Comparador<String, Object>  comp = new Comparador<>();
		int resultado = comp.Compare("hola", "hola");
		assertEquals(0, resultado);
	}

}
