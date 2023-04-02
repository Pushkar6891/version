package com.company.list.stack;

import java.util.Stack;

public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }

}
