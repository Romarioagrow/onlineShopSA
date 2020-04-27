package app.services;

import app.domain.Product;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log
@Service
public class ProductService {

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Телевизор", "Samsung T24H390SIX", 15000));
        products.add(new Product("Телевизор", "Lg 22MT58VF-PZ", 12500));
        products.add(new Product("Холодильник", "Indesit DS4160W", 25350));
        products.add(new Product("Холодильник", "Leran CBF177W", 27600));
        products.add(new Product("Стиральная машина", "Samsung T24H390SIX", 12320));
        products.add(new Product("Холодильник", "Бирюса 10", 22440));
        products.add(new Product("Утюг", "Bosch TDA 2377", 2500));
        products.add(new Product("Магнитола", "Sony ZS-PS50B", 3240));
        products.add(new Product("Кухонная плита", "Darina 1BKM441301W", 7800));
        products.add(new Product("Блинница", "Gfgril GFC-B200 PERFECT", 4500));
        products.add(new Product("Музыкальный центр", "LG OM7550K", 7650));

        return products;
    }

    public Product getProductData(String productID, List<Product> products) {
        for (Product product : products) {
            if (product.getProductID().toString().equals(productID)) {
                return product;
            }
        }
        return null;
    }
}
