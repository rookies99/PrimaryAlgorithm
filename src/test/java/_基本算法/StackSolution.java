package _基本算法;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class StackSolution {

    @Test
    public void test1() {
        String s = "123)[]{[]}";
        System.out.println("ParenthesesValidator() = " + ParenthesesValidator(s));

    }

    public Stack ParenthesesValidator(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char bracket : brackets) {
            if ('(' == bracket ) {
                stack.push(')');
            } else if ('[' == bracket) {
                stack.push(']');
            } else if ('{' == bracket) {
                stack.push('}');
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.empty()) {
                    throw new RuntimeException(bracket + " 只有右括号，缺少左括号");
                }
                if (stack.peek() != bracket) {
                    System.out.println("stack = " + stack.peek());
                    System.out.println("bracket = " + bracket);
                    throw new RuntimeException("括号类型不匹配"+" stack = "+stack.peek()+",bracket = "+bracket);
                }
                stack.pop();
            }
        }
        if (!stack.empty()) {
            throw new RuntimeException("存在未闭合的括号:"+stack.peek());
        }
        return stack;
    }


}
