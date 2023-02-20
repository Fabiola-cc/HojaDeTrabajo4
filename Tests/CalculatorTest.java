package Tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Calculator;

class CalculatorTest {
    Calculator calc = Calculator.getInstance();

    @Test
    void calculate() {
        int res = Calculator.calculate(1,"12+4*3+");
        assertEquals(15, res);

        res = Calculator.calculate(2,"12+4*3/");
        assertEquals(4, res);

        res = Calculator.calculate(2,"12-4*3+");
        assertEquals(-1, res);
    }
}