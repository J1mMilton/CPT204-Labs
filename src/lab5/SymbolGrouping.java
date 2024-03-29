package lab5;

import java.util.EmptyStackException;
import java.util.Stack;

public class SymbolGrouping {

    public static String group(String str) {
        Stack<Character> parens = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                parens.push('(');
            }
            try {
                if (str.charAt(i) == ')' && parens.peek() == '(') {
                    parens.pop();
                }
            } catch (EmptyStackException e) {
                return "Unpaired";
            }

            if (str.charAt(i) == '{') {
                parens.push('{');
            }
            try {
                if (str.charAt(i) == '}' && parens.peek() == '{') {
                    parens.pop();
                }
            } catch (EmptyStackException e) {
                return "Unpaired";
            }

            if (str.charAt(i) == '[') {
                parens.push('[');
            }
            try {
                if (str.charAt(i) == ']' && parens.peek() == '[') {
                    parens.pop();
                }
            } catch (EmptyStackException e) {
                return "Unpaired";
            }
        }
        if (parens.empty()) {
            return "Paired";
        }
        else return "Unpaired";

    }

}
