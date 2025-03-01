/**
 * StringOperations
 */
public class StringOperations {

  // Access character at index.
  static char getCharByIndex(String str, int idx) {
    return str.charAt(idx);
  }

  static void modifyChar(String str, String ch, int idx) {
    String s1 = str.substring(0, idx);
    String s2 = str.substring(idx + 1);
    String modString = s1 + ch + s2;
    System.out.println(modString);
  }

  static void insertAtIndex(String str, String ch, int idx) {
    StringBuilder sb = new StringBuilder(str);
    sb.insert(idx, ch);
    String modifiedString = sb.toString();
    System.out.println("Modified String: " + modifiedString);
  }

  static void deleteChar(char[] str, char ch) {
    int j = 0;
    for (int i = 0; i < str.length; i++) {
      if (str[i] != ch) {
        str[j++] = str[i];
      }
    }
    while (j < str.length) {
      str[j++] = '\0';

    }
    System.out.println(str);
  }

  public static void main(String[] args) {
    String str = "VanshajSaxena";
    String ch = "_";
    char[] char_arr = str.toCharArray();
    int idx = 7;
    System.out.println("Original String: " + str);

    insertAtIndex(str, ch, idx); // Vanshaj_Saxena

    modifyChar(str, ch, idx); // Vanshaj_axena

    deleteChar(char_arr, 'n'); // VashajSaxea
  }
}
