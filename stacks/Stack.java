package stacks;

/**
 * Created by amitkumar on 19/12/16.
 */
public class Stack {

    private int size;

    private int[] arr;

    private int currentIndex;

    public Stack(int size) {
        this.size = size;
        currentIndex = -1;
        arr = new int[size];
    }

    public void push(int i) {
        if (currentIndex == size) {
            throw new RuntimeException("Stack if full");
        }
        arr[++currentIndex] = i;
    }

    public int pop() {
        if (currentIndex < 0) {
            throw new RuntimeException("Stack if empty");
        }
        return arr[currentIndex--];
    }

    public int top() {
        if (currentIndex < 0) {
            throw new RuntimeException("Stack if empty");
        }
        return arr[currentIndex];
    }

    public boolean isFull() {
        return (currentIndex == size - 1);
    }

    public boolean isEmpty() {
        return (currentIndex == -1);
    }

    public int getSize() {
        return currentIndex+1;
    }

    public void print() {
        while (!this.isEmpty()) {
            long value = this.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }
}
