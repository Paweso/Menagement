package service;

import entity.Boots;
import entity.Cloth;
import entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {

    @Test
    public void testGetAllProductsPositive() {
        List<Product> products = new ArrayList<>();
        products.add(new Cloth(1L, "T-SHIRT", 35.0f, 0.3f, "Black", 4, "XL", "COTTON"));
        products.add(new Boots(1L, "T-SHIRT", 35.0f, 0.3f, "Black", 4, 38, true));

        ProductServiceImpl userService = new ProductServiceImpl(products);
        List<Product> listFromTestClass = userService.getAllProduct();

        Assert.assertEquals(products, listFromTestClass);
    }

    @Test
    public void testGetAllProductsNegative() {
        List<Product> products = new ArrayList<>();
        products.add(new Cloth(1L, "T-SHIRT", 35.0f, 0.3f, "Black", 4, "XL", "COTTON"));
        products.add(new Boots(2L, "Boots", 35.0f, 0.3f, "Black", 4, 38, true));

        ProductServiceImpl productService = new ProductServiceImpl(new ArrayList<>(products));
        products.add(new Cloth(3L, "Spodnie", 44.f, 0.f, "White", 3, "S", "COTTON"));
        List<Product> listFromTestClass = productService.getAllProduct();

        Assert.assertNotEquals(products, listFromTestClass);
    }

}
