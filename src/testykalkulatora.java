import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testykalkulatora {

    private final kalkulator calculator = new kalkulator();

    @Test
    public void testAddLargeNumbers() {
        assertEquals(1000000, calculator.add(500000, 500000));
    }

    @Test
    public void testSubtractToZero() {
        assertEquals(0, calculator.subtract(100, 100));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(12345, 0));
    }

    @Test
    public void testMultiplyLargeNumbers() {
        assertEquals(200000000, calculator.multiply(10000, 20000));
    }

    @Test
    public void testDivideResultingInFraction() {
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    public void testModuloWithLargerDivisor() {
        assertEquals(5, calculator.modulo(5, 10));
    }

    @Test
    public void testNegativeModulo() {
        assertEquals(-1, calculator.modulo(-10, 3));
    }

    @Test
    public void testAddWithMixedSignNumbers() {
        assertEquals(-3, calculator.add(2, -5));
    }

    @Test
    public void testSubtractResultingInPositive() {
        assertEquals(10, calculator.subtract(5, -5));
    }

    @Test
    public void testDivideByOne() {
        assertEquals(123, calculator.divide(123, 1));
    }
}
