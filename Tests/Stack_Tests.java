package Tests;

import org.junit.jupiter.api.Test;
import src.*;
import static org.junit.jupiter.api.Assertions.*;

class Stack_Tests {
    Stack<Integer> s1 = new Stack_ArrayList<>();
    Stack<Integer> s2 = new Stack_DoubleList<>();
    Stack<Integer> s3 = new Stack_Vector<>();
    Stack<Integer> s4 = new Stack_SingleList<>();

    Stack_Tests() {
        s1.push(1);s1.push(2);
        s2.push(3);s2.push(4);
        s3.push(1);s3.push(2);
        s4.push(3);s4.push(4);
    }

    @Test
    void peek_Test() {
        assertEquals(2, s1.peek());
        assertEquals(2, s3.peek());
        assertEquals(4, s2.peek());
        assertEquals(4, s4.peek());
    }

    @Test
    void count_Test() {
        assertEquals(2, s1.count());
        assertEquals(2, s2.count());
        assertEquals(2, s3.count());
        assertEquals(2, s4.count());
    }

    @Test
    void pull_Test() {
        s1.pull();s2.pull();s3.pull();s4.pull();
        assertEquals(1, s1.peek());
        assertEquals(1, s2.count());
        assertEquals(1, s3.peek());
        assertEquals(1, s4.count());
    }

}