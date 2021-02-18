
public class MyStack {

    private final int[] elements;
    private int lastLocationWritten = -1;

    public MyStack(int numberOfElements) {
        this.elements = new int[numberOfElements];
    }

    public void push(int elementToPush) {
        if(isFull()) {
            throw new StackOverFlowException("Stack is full");
        }

        elements[++lastLocationWritten] = elementToPush;

        /*try {
            elements[++lastLocationWritten] = elementToPush;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new StackOverFlowException("Stack is full");
        }*/
    }

    public int peek() {
        if(isEmpty()) {
            throw new StackUnderFlowException("Stack is Empty");
        }
        return elements[lastLocationWritten];
    }

    public int pop() {
        /*return elements[0];
        return elements[0] = 0;*/

        if(isEmpty()) {
            throw new StackUnderFlowException("Stack is Empty");
        }

        int lastElement = elements[lastLocationWritten];
        elements[lastLocationWritten--] = 0;

        return lastElement;
    }

    public boolean isEmpty() {
        return (lastLocationWritten == -1);
    }

    public boolean isFull() {
        return (lastLocationWritten == elements.length - 1);
    }

    public static class StackOverFlowException extends RuntimeException {
        public StackOverFlowException(String message) {
            super(message);
        }
    }

    public static class StackUnderFlowException extends RuntimeException {
        public StackUnderFlowException(String message) {
            super(message);
        }
    }
}
