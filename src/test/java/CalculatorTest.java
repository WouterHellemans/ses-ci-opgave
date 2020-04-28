import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {



    @Test
    public void calculate_positieveGetallen_geeftSomTerug() {
        int een = 4;
        int twee = 4;
        int som = Calculator.calculate(een, twee);
        Assertions.assertEquals(8, som);
    }

    @Test
    public void calculate_negatieveGetallen_geeftSomTerug() {
        int een = -4;
        int twee = -4;
        int som = Calculator.calculate(een, twee);
        Assertions.assertEquals(-8, som);
    }

    @Test
    public void calculate_nul_geeftnulTerug() {
        int een = 0;
        int twee = 0;
        int som = Calculator.calculate(een, twee);
        Assertions.assertEquals(0, som);
    }
}
