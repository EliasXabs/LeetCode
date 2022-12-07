package JavaSolutions.easy;

import java.util.Stack;

public class problem_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character c = stack.peek();
                if ((c == '(' && s.charAt(i) == ')') || (c == '{' && s.charAt(i) == '}')
                        || (c == '[' && s.charAt(i) == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // main method
    public static void main(String[] args) {
        problem_20 solution = new problem_20();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
        System.out.println(solution.isValid("]"));
        System.out.println(solution.isValid("(])"));
    }
}
