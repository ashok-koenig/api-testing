public class StringDemo {
    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Smith";

        System.out.println("Name 1: "+ name1);
        System.out.println("Name 2: "+ name2);

        System.out.println("Length of name1: "+ name1.length());

        String name3 = "john";

        System.out.println("name1 equals name3: "+ name1.equals(name3));
        System.out.println("name1 equals name3 ignore case: " + name1.equalsIgnoreCase(name3));

        String text = "Welcome to Java Strings";
        System.out.println("Substring of text from index 0 to 7 : " + text.substring(0,7));
        System.out.println("Substring of text from index 11: " + text.substring(11));

        System.out.println("Text in upper case: "+ text.toUpperCase());
        System.out.println("Text in lower case: "+ text.toLowerCase());

        String username = "   admin    ";
        System.out.println("Username: " + username);
        System.out.println("Trimmed username: "+ username.trim());
    }
}
