package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidoff() {
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidoff(5000, 12, 100));
    }
}