package app.controllers;

import app.domain.Product;
import app.services.ProductService;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@RestController
@RequestMapping("/api")
public class RestApiController {
    private final ProductService productService = new ProductService();

    public final List<Product> products = productService.getAllProducts();

    @GetMapping("/products")
    public List<Product> sendAllProducts() {
        return products;
    }

    @PostMapping("/products/product")
    public Product getProductData(@RequestBody String productID) {
        log.info("productID: " + productID);
        return productService.getProductData(productID, products);
    }
}
