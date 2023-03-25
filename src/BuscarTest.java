import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class BuscarTest {

    private static Buscar<String, Integer> bst;
    @BeforeClass
    public static void setUp() {
        IComparator<String, Integer> comparator = new Comparador<>();
        IKeyCalculator<String, Integer> calculator = new KeyData<>();
        bst = new Buscar<>(comparator, calculator);

        bst.Insert("dog", 1);
        bst.Insert("cat", 2);
        bst.Insert("fish", 3);
    }

    @Test
    public void testCount() {
        assertEquals(3, bst.Count());
    }

    @Test
    public void testFind() {
        assertEquals((Integer) 1, bst.Find("dog", bst.raiz));
        assertEquals((Integer) 2, bst.Find("cat", bst.raiz));
        assertEquals((Integer) 3, bst.Find("fish", bst.raiz));
        assertNull(bst.Find("bird", bst.raiz));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(bst.IsEmpty());
        bst = new Buscar<>(new Comparador<>(), new KeyData<>());
        assertTrue(bst.IsEmpty());
    }

    @Test
    public void testInOrder() {
        StringBuilder sb = new StringBuilder();
        bst.InOrder(node -> sb.append(node.Value).append(" "), bst.raiz);

        assertEquals("2 1 3 ", sb.toString());
    }

    @Test
    public void testPreOrder() {
        StringBuilder sb = new StringBuilder();
        bst.PreOrder(node -> sb.append(node.Value).append(" "), bst.raiz);

        assertEquals("1 2 3 ", sb.toString());
    }

    @Test
    public void testPostOrder() {
        StringBuilder sb = new StringBuilder();
        bst.PostOrder(node -> sb.append(node.Value).append(" "), bst.raiz);

        assertEquals("2 3 1 ", sb.toString());
    }
}

