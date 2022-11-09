import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringStackTest {

    @Test
    public void testArrayStringStack_push_pop_NormalInput() {
        StringStack stack = new ArrayStringStack();
        String input = "Hello";
        stack.push(input);
        String actual = stack.pop();
        String expected = input;
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayStringStack_push_isEmpty() {
        StringStack stack = new ArrayStringStack();
        String input = "Hello";
        stack.push(input);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testArrayStringStack_push_pop_NullInput() {
        StringStack stack = new ArrayStringStack();
        String input = null;
        stack.push(input);
        String actual = stack.pop();
        String expected = input;
        assertEquals(expected, actual);
    }
}
