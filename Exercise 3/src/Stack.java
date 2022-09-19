public class Stack {

    String arr[];
    int top;
    int max;

    Stack(int size) {
        arr = new String[size];
        max = size;
        top = -1;
    }

    public void push(String data) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            System.exit(1);
        }

        System.out.println("Add: " + data);
        arr[++top] = data;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            System.exit(1);
        }
        System.out.println("Remove: " + arr[top]);

        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == max - 1;
    }

    public String peek() {
        if (isEmpty()) {
            System.exit(-1);
        }

        return arr[top];
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}