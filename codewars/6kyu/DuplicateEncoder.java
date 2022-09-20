import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
  static String encode(String word){
    String[] chars =  word.split("");
    Map<String, Integer> charCounters = new HashMap<>();

    for (String character: chars) {
      character = character.toLowerCase();

      if (!charCounters.containsKey(character)) {
        charCounters.put(character, 0);
      }

      int currentCount = charCounters.get(character);
      charCounters.put(character, currentCount + 1);
    }

    String displayText = "";
    for (String character: chars) {
      character = character.toLowerCase();

      int charCount = charCounters.get(character);
      if (charCount == 1) {
        displayText += "(";
      } else if (charCount > 1) {
        displayText += ")";
      }
    }

    return displayText;
  }
}

