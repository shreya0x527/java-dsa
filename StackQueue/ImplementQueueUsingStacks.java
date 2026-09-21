import java.util.Stack;

class ImplementQueueUsingStacks {

    Stack<Integer> input;
    Stack<Integer> output;

    public ImplementQueueUsingStacks() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        shiftStacks();
        return output.pop();
    }

    public int peek() {
        shiftStacks();
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    private void shiftStacks() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}