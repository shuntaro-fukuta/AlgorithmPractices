import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class BraceChecker {

    private static final Map<Character, Character> VALID_BRACES = new HashMap<Character, Character>() {{
      put('(', ')');
      put('{', '}');
      put('[', ']');
    }};

    public boolean isValid(String braces) {
      Stack<Character> openBraceStack = new Stack<>();

      for (char brace: braces.toCharArray()) {
        boolean isOpenBrace = (VALID_BRACES.keySet().contains(brace));

        if (isOpenBrace) {
          openBraceStack.push(brace);
        } else {
          if (openBraceStack.size() == 0) return false;

          char openBrace = openBraceStack.pop();
          char closeBrace = brace;

          boolean isValidBrace = (VALID_BRACES.get(openBrace) == closeBrace);
          if (!isValidBrace) return false;
        }
      }

      return openBraceStack.size() == 0;
    }
}

