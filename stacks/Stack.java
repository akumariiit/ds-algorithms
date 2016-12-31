package stacks;

import java.util.ArrayList;

/**
 * Created by amitkumar on 19/12/16.
 */
public class Stack<T> {

    private ArrayList<T> stack = new ArrayList<T> ();

    private int top = 0;

    public void push(T i) {
        stack.add (top++, i);
    }

    public T pop() {
        return stack.remove(--top);

    }

    public T top() {
        return stack.get(top-1);
    }

    public boolean isEmpty() {
        return (stack.isEmpty());
    }

    public int getSize() {
        return top;
    }

    public void print() {
        while (!this.isEmpty()) {
            T value = this.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }
}
