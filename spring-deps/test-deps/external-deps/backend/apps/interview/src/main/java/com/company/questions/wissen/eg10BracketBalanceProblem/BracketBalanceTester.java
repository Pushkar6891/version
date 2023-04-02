package com.company.stack.eg03bracketBalancing;

import java.util.Stack;

// String only contains [],() or {}
public class BracketBalanceTester {
    public static void main(String[] args) {
        BracketBalanceTester obj = new BracketBalanceTester();

        System.out.println(obj.isBracketBalance("{}[()]"));
        System.out.println(obj.isBracketBalance("{]()]}"));
        System.out.println(obj.isBracketBalance("[({})]"));
        System.out.println(obj.isBracketBalance("()[]{}"));
        System.out.println(obj.isBracketBalance("{}()[]"));
    }

    public static boolean isBracketBalance(String str) {
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        for (char ch : arr) {

            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (top == '(' && ch != ')')
                    return false;
                if (top == '[' && ch != ']')
                    return false;
                if (top == '{' && ch != '}')
                    return false;
            }
        }

        return stack.isEmpty();
    }

}
