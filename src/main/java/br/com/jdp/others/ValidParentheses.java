package br.com.jdp.others;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // If stack is empty or top doesn't match the closing bracket
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

//    public boolean isValid(String s) {
//        if (s.length() % 2 != 0) return false;
//        char[] c = s.toCharArray();
//        char[] a = new char[c.length];
//        int t = 0;
//        for (int i = 0; i < c.length; i++) {
//            switch (c[i]) {
//                case '(', '[', '{':
//                    a[t++] = c[i];
//                    break;
//                case ')':
//                    if (t == 0 || a[--t] != '(') return false;
//                    break;
//                case ']':
//                    if (t == 0 || a[--t] != '[') return false;
//                    break;
//                case '}':
//                    if (t == 0 || a[--t] != '{') return false;
//            }
//        }
//        return t == 0;
//    }
}
