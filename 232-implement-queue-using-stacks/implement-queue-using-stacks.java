import java.util.Stack;

class MyQueue {

    private Stack<Integer> inStack;   // For enqueue operations
    private Stack<Integer> outStack;  // For dequeue operations

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            transferElements();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            transferElements();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void transferElements() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.empty());  // true

        myQueue.push(1);
        myQueue.push(2);

        System.out.println(myQueue.peek());   // 1
        System.out.println(myQueue.pop());    // 1
        System.out.println(myQueue.empty());  // false
    }
}
