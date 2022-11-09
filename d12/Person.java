public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getInitials() {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
             //if (! words[i].equals("")) {
             if (! words[i].isEmpty()) { // otherwise there is no charAt(0)!
                 String nextInitial = "" + words[i].charAt(0);
                 result = result + nextInitial.toUpperCase();
             }
        }
        return result;
    }
}
