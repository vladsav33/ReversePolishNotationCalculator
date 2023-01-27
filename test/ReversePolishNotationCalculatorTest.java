import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    public ReversePolishNotationCalculator calculator;
    @BeforeEach
    void beforeEach() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        assertEquals(calculator.calculatePolishNotation("3 2 4 + +"), 9);
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(calculator.calculatePolishNotation("7 4 - 2 -"), 1);
    }

    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(calculator.calculatePolishNotation("3 2 3 * *"), 18);
    }
}