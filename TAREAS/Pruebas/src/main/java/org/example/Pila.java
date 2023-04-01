package org.example;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack);

//        int top = stack.pop();
//        System.out.println("Removed element: " + top);
//
//        System.out.println("Stack after element removed: " + stack);
    }
}