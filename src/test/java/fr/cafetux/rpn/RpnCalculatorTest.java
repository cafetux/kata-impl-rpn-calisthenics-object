package fr.cafetux.rpn;

import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;


public class RpnCalculatorTest {

    private RpnCalculator calculator = new RpnCalculator();

    @Test
    public void should_addition_two_operands() {
        assertThat(result("3 6+")).isEqualTo(9.0f);
    }

    @Test
    public void should_addition_three_operands() {
        assertThat(result("3 6+ 2+")).isEqualTo(11.0f);
    }

    @Test
    public void should_soustract_two_operands() {
        assertThat(result("5 2-")).isEqualTo(3.0f);
    }

    @Test
    public void should_soustract_and_addition_on_same_operation() {
        assertThat(result("5 2- 7+")).isEqualTo(10.0f);
        assertThat(result("7 5 2 -+")).isEqualTo(10.0f);
    }

    @Test
    public void should_cumul_differents_signs_at_the_end_of_same_operation() {
        assertThat(result("7 5 2 -+")).as("5 2- 7+ must be equals to 7 5 2 -+").isEqualTo(result("5 2- 7+")).isEqualTo(10.0f);
    }

    @Test
    public void should_multiply_operands() {
        assertThat(result("5 2*")).isEqualTo(10.0f);
    }

    @Test
    public void should_square_operands() {
        assertThat(result("5 2* ²")).isEqualTo(100.0f);
    }

    @Test
    public void should_divide_operands() {
        assertThat(result("2 2/")).isEqualTo(1.0f);
    }

    @Test
    public void should_operate_multi_digit_operands() {
        assertThat(result("20 2/")).isEqualTo(10.0f);
    }

    /**
     * 3 5 8 * 7 + * => 3((5*8)+7) = 141
     */
    @Test
    public void should_operate_multi_operands_with_multi_operators() {
        assertThat(result("3 5 8 * 7 + * ")).isEqualTo(141);
        assertThat(result("1 2 + 4 * 3 +")).isEqualTo(15.0f);
        assertThat(result("3 4 2 1 + * +")).isEqualTo(15.0f);
        assertThat(result("1 2 + 4 * 3 + 2 /")).isEqualTo(7.5f);
        assertThat(result("3 4 2 1+ * + 2 /")).isEqualTo(7.5f);
        assertThat(result("3 4 2 1+*+2/")).isEqualTo(7.5f);
    }


    private float result(String expression) {
        return calculator.resolve(expression);
    }
}
