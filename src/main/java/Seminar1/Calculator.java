package Seminar1;

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, double discountAmount){
        if (purchaseAmount <= 0){
            throw new ArithmeticException("Цена равна нулю или меньше");
        }
        if (discountAmount < 0){
            throw new ArithmeticException("Отрицательная скидка");
        }
        return purchaseAmount - (purchaseAmount / 100 * discountAmount);
    }
}
