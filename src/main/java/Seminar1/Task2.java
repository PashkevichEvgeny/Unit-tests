package Seminar1;
import org.assertj.core.api.AbstractBigDecimalAssert;

import static org.assertj.core.api.Assertions.*;

public class Task2 {
    public static void main(String[] args) {
        // Создаем три продукта и добавляем их в магазин
        Product toothPowder = new Product("Tooth-powder", 2);
        Product towel = new Product("Fluffy towel", 10);
        Product soap = new Product("Scented soap ", 1);
        Shop shop = new Shop();
        shop.addProduct(toothPowder);
        shop.addProduct(towel);
        shop.addProduct(soap);

        // Проверка работы метода находящего самый дорогой продукт в магазине
        assertThat(shop.getMostExpensiveProduct().priceProduct).isEqualTo(towel.priceProduct);

        // Создаем еще один магазин и заполняем его продуктами в порядке уменьшения цены
        Shop anotherShop = new Shop();
        anotherShop.addProduct(towel);
        anotherShop.addProduct(toothPowder);
        anotherShop.addProduct(soap);

        // Сортируем первый магазин по цене продукта
        shop.sortProductByPrice();

        // Проверка работы метода сортирующего продукты по цене
        assertThat(shop.productList).isEqualTo(anotherShop.productList);
    }
}
