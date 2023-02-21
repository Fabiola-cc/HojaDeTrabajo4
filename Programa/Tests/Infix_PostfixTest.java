package Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Infix_Postfix;
import src.Stack_ArrayList;

class Infix_PostfixTest {
    Infix_Postfix ip = new Infix_Postfix();

    @Test
    void precedence() {
        assertEquals(1, Infix_Postfix.precedence('+'));
        assertEquals(2, Infix_Postfix.precedence('/'));
        assertEquals(3, Infix_Postfix.precedence('^'));
        assertEquals(-1, Infix_Postfix.precedence('0'));
    }

    @Test
    void infixToPostfix() {
        String s = Infix_Postfix.infixToPostfix(new Stack_ArrayList<>(), "((3+4)*2)/7");
        assertEquals("34+2*7/", s);
    }


}