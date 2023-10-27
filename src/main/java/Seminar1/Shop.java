package Seminar1;
import java.util.*;

public class Shop{
    List<Product> productList;

    Shop (){
        this.productList = new ArrayList<>();
    }

    void addProduct(Product newProduct){
        productList.add(newProduct);
    }

    Product getMostExpensiveProduct(){
        if (productList.isEmpty()) return null;
        Product mostExpensive = productList.get(0);
        for (Product item: productList) {
            if (item.priceProduct > mostExpensive.priceProduct){
                mostExpensive = item;
            }

        }
        return mostExpensive;
    }

    void sortProductByPrice(){
        productList.sort((o1, o2) -> o2.priceProduct - o1.priceProduct);
    }
}
