import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    MyStack myStack;

    @BeforeEach
    void startWithThis() {
        myStack = new MyStack(5);
    }

    @Test
    void pushOneElement() {
        myStack.push(5);
        assertEquals(5, myStack.peek());
    }

    @Test
    void pushTwoElements() {
        myStack.push(8);
        myStack.push(6);
        assertEquals(6, myStack.peek());
    }

    @Test
    void pushTwoElements_popOne() {
        myStack.push(4);
        myStack.push(11);

        assertEquals(11, myStack.pop());
        assertEquals(4, myStack.peek());
    }

    @Test
    void pushTwo_popTwo_shouldBeEmptyTest() {
        myStack.push(4);
        myStack.push(11);

        myStack.pop();
        myStack.pop();

        assertTrue(myStack.isEmpty());
    }

    @Test
    void pushThree_shouldBeFull() {
        myStack = new MyStack(3);
        myStack.push(4);
        myStack.push(11);
        myStack.push(3);

        assertTrue(myStack.isFull());
    }

    @Test
    void pushOneElement_afterStackIsFull_throwsStackOverflowException() {
        myStack = new MyStack(3);
        myStack.push(4);
        myStack.push(11);
        myStack.push(3);
        assertTrue(myStack.isFull());

        assertThrows(MyStack.StackOverFlowException.class,
                ()->myStack.push(5));
    }

    @Test
    void removeLastElement_whenStackIsEmpty() {
        assertTrue(myStack.isEmpty());
        assertThrows(MyStack.StackUnderFlowException.class,
                ()->myStack.pop());
    }

    @Test
    void peekEmptyStack_throwsStackUnderflowException() {
        assertTrue(myStack.isEmpty());
        assertThrows(MyStack.StackUnderFlowException.class,
                ()->myStack.peek());
    }

}
