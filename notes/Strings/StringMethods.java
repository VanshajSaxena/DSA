/**
 * StringMethods
 */
public class StringMethods {
  public static void main(String[] args) {
    String myString = "MyNameIsVanshajSaxena";
    String myStringTwo = new String("MyNameIsVanshajSaxena");

    // int length
    int lengthOfString = myString.length();
    System.out.println(lengthOfString); // 21

    // Char charAt(int j)
    char characterAt = myString.charAt(0);
    System.out.println(characterAt); // M

    // String substring(int j)
    String subStringOne = myString.substring(1);
    System.out.println(subStringOne); // yNameIsVanshajSaxena

    // String substring(int j, int k)
    String subStringTwo = myString.substring(1, 5);
    System.out.println(subStringTwo); // yNam

    // String concat(String str)
    String output = subStringOne.concat(subStringTwo);
    System.out.println(output); // yNameIsVanshajSaxenayNam

    // int indexOf(String s)
    int indexOne = myString.indexOf("Name");
    System.out.println(indexOne); // 2

    // int indexOf(String s, int j)
    // Returns the index within this string of the first occurrence of the specified
    // substring, starting at the specified index.
    // NOTE: - It ignores any occurrence before specified index
    int indexTwo = myString.indexOf("Name", 1);
    System.out.println(indexTwo); // 2

    // int indexOf(String s)
    int lastIndex = myString.lastIndexOf("Name");
    System.out.println(lastIndex); // 2
    boolean bool = myString.equals(myStringTwo);
    boolean boolTwo = myString == myStringTwo;

    System.out.println("Comparison using equals method...");
    System.out.println(bool); // true
    System.out.println("Comparison using equlity check...");
    System.out.println(boolTwo); // false

    // int compareTo(String anotherString)
    // Compares two strings lexicographically.
    int compared = "Apple".compareTo("Banana");
    System.out.println(compared); // -1

    // int compareToIgnoreCase(String anotherString)
    // Compares two strings lexicographically, ignoring case differences.
    int compareIgnoredCase = "Apple".compareToIgnoreCase("apple");
    System.out.println(compareIgnoredCase); // 0

    // String toLowerCase()
    String lowerCased = myString.toLowerCase();
    System.out.println(lowerCased); // mynameisvanshajsaxena

    // String toUpperCase()
    String upperCased = myString.toUpperCase();
    System.out.println(upperCased); // MYNAMEISVANSHAJSAXENA

    // String trim()
    // Removes white space at both ends, does not affect whitespace in the middle.
    String trimmed = myString.trim();
    System.out.println(trimmed); // MyNameIsVanshajSaxena

    // String replace()
    // Returns a new string by replacing all occurrences of oldChar with newChar.
    String replaced = myString.replace('a', 'z');
    // NOTE: - `myString` is still "MyNameIsVanshajSaxena", the method returned a
    // new string with required changes.
    System.out.println(replaced); // MyNzmeIsVznshzjSzxenz

    // boolean contains(string)
    // Returns true if the string contains the given string.
    boolean boolContains = myString.contains("Vanshaj");
    System.out.println(boolContains); // true

    // Char[] toCharArray()
    char[] char_arr = myStringTwo.toCharArray();
    System.out.println(char_arr); // MyNameIsVanshajSaxena

    // boolean startsWith(string)
    // Tests if this string starts with the specified prefix.
    boolean boolStartsWith = myString.startsWith("f");
    System.out.println(boolStartsWith); // false
  }
}
