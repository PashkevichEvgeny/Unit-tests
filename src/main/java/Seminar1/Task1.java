package Seminar1;
import static org.assertj.core.api.Assertions.*;
public class Task1 {
    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(100, 30)).isEqualTo(70);
        assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100);
        assertThatThrownBy(() -> Calculator.calculateDiscount(10.0, -10.0)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(-10.0, 10.0)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(-10.0, -10.0)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(10.0, 10.0)).isInstanceOf(ArithmeticException.class);
    }
}
