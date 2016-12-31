package stacks;

/**
 * Created by amitkumar on 30/12/16.
 */
public class InfixToPostFix {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        int n = stack.getSize();

        String input = "a+b*(c^d-e)^(f+g*h)-i";
        char[] arr = input.toCharArray();

        for (char c : arr) {
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.print(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.top() != '(') {
                    System.out.print(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && order(stack.top()) > order(c)) {
                    System.out.print(stack.pop());
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            //System.out.print(stack.pop());
        }
    }

    private static int order(char top) {
        if (top == '+' || top == '-') {
            return 1;
        }
        if (top == '*' || top == '/') {
            return 2;
        }
        if (top == '^') {
            return 3;
        }
        return -1;
    }
}
