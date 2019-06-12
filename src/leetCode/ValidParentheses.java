package leetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put('}', '{');
        parentheses.put(']', '[');

        Stack<Character> stackParentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (parentheses.containsKey(c)) {
                char topElem = (stackParentheses.empty()) ? '#' : stackParentheses.pop();
                if (topElem != parentheses.get(c)) {
                    return false;
                }
            } else stackParentheses.push(c);

        }
        return stackParentheses.isEmpty();
    }
}