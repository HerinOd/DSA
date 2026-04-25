package topic06.stack_and_queue_application.exercises;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix: ");
        String infix = scanner.nextLine();
        System.out.print("Postfix: " + convertToPostfix(infix));
    }

    public static String convertToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop(); // bỏ dấu '('
            }

            //Xử lí ưu tiên của các toán tử
            else {
                while (!stack.isEmpty() &&
                        stack.peek() != '(' &&
                        getPrecedence(stack.peek()) >= getPrecedence(ch)) {

                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }

        //Sau khi xét hết chuỗi, pop ra phần còn lại
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }

    // Hàm check độ ưu tiên của toán tử
    private static int getPrecedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }
}
