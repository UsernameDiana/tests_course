package JunitTests;

import myarraylistwithbugs.MyArrayListWithBugs;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diana
 */
public class MyArrayListWithBugsTest {

    MyArrayListWithBugs list = new MyArrayListWithBugs();

    @Test
    public void testCreateEmptyList() {
        System.out.println("Test: New Empty List");
        assertEquals(list.size(), 0);
    }

    @Test
    public void testIndexOutOfBounds() {
        System.out.println("Test: Error Exception (IndexOutOfBounds)");
        list.add('x');
        list.get(-1);
    }

    @Test
    public void testAddToEmptyList() {
        System.out.println("Test: Add to the Empty List");
        list.add('n');
        assertEquals(list.size(), 1);
    }

    @Test
    public void testExpandList() {
        System.out.println("Test: Expand list");
        list.add('y');
        list.add(1, 'z');
        assertEquals(list.size(), 2);
    }
}
