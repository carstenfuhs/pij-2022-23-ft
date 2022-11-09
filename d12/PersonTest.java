import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    
public class PersonTest {
    @Test
    public void testGetInitials_NormalName() {
        String input = "Derek Robert Yeast";
        Person p = new Person(input);
        String actual = p.getInitials();
        String expected = "DRY";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetInitials_NameWithTwoConsecutiveSpaces() {
        String input = "Hermes  Conrad";
        Person person = new Person(input);
        String actual = person.getInitials();
        String expected = "HC";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetInitials_NameWithFiveConsecutiveSpaces() {
        String input = "Hermes     Conrad";
        Person person = new Person(input);
        String actual = person.getInitials();
        String expected = "HC";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetInitials_NameWithoutSpace() {
        String input = "Hermes";
        Person person = new Person(input);
        String actual = person.getInitials();
        String expected = "H";
        assertEquals(expected, actual);
    }

    // In a "real" testing class, there are usually
    // more methods here, each of them annotated with 
    // the annotation @Test, each of them testing
    // a different aspect of the code
}
