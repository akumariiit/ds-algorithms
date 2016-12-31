package stacks;

/**
 * Created by amitkumar on 19/12/16.
 */

/**
 * if stack has 1, 2, 3, 4
 * result should be 4, 3, 2, 1
 */
public class StackReverse {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int n = stack.getSize();
        for (int i = 1; i < n; i++) {
            slide(1, n-i+1, stack);
        }
        stack.print();
    }

    private static void slide(int start, int end, Stack stack) {
        if (end == start)
            return;
        int first = (int) stack.pop();
        int second = (int) stack.pop();
        stack.push(first);
        slide(start+1, end, stack);
        stack.push(second);
    }
}
