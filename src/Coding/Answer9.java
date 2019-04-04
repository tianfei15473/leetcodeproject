package Coding;

import java.util.Stack;

public class Answer9 {

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        Stack<String> stack = new Stack<>();

        for (int i=0; i<s.length(); i++)
            stack.push(String.valueOf(s.charAt(i)));

        String temp = "";
        while(!stack.empty()) {
            temp += stack.pop();
        }

        return temp.equals(s);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-123321));
    }

}
