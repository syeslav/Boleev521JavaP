import java.util.Scanner;

class FixedIntStack {
    private int[] stack;
    private int top;
    private int capacity;

    public FixedIntStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("[Ошибка] Стек переполнен!");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("[Ошибка] Стек пуст!");
            return -1;
        }
        return stack[top--];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void clear() {
        top = -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("[Ошибка] Стек пуст!");
            return -1;
        }
        return stack[top];
    }
}
