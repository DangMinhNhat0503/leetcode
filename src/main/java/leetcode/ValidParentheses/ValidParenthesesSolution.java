package leetcode.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesesSolution {
    public boolean isValid(String s) {
        Map<Character, Character> lookup = new HashMap<>();

        lookup.put('(',')');
        lookup.put('[',']');
        lookup.put('{','}');

        Stack<Character> stack = new Stack<>();

        int length = s.length();

        for (int i = 0; i < length; i++) {
            char check = s.charAt(i);

            if (lookup.containsKey(check)) {
                stack.push(check);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char topElement = stack.pop();

                if (check != lookup.get(topElement)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
