/**
 * Attempt to reproduce a bug in method getInitials() of class Person
 * for names with several spaces one after the other.
 */
public class PersonScript {

    public static void main(String[] args) {
        String name = "Hermes  Conrad";
        Person person = new Person(name);
        String initials = person.getInitials();
        //String[] words = name.split(" ");
        //System.out.println(java.util.Arrays.toString(words));
    }
}
