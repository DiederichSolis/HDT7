import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KeyDataTest {

	@Test
	void test() {
	    KeyData<String, Data> keyData = new KeyData<>();
        Data data = new Data("house", "casa", "maison", "haus");
        assertEquals("house", keyData.GetKey(data));
	}

}
