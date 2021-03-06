package week05d04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Given a Store object")
class StoreTest {
    private Store store = new Store();
    private Product product;
    private List<Product> products = new ArrayList<>();

    @BeforeEach
    void setUp() {
        product = new Product("alma", 2020, 11, 12);
        Product product1 = new Product("körte", 2019, 1, 12);
        Product product2 = new Product("tej", 2020, 11, 12);
        Product product3 = new Product("kenyér", 2021, 9, 14);
        Product product4 = new Product("szalámi", 2021, 11, 12);

        store.addProduct(product);
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);

        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
    }

    @Test
    void createProduct() {
        assertEquals("alma", product.getName());
        assertEquals(2020, product.getExpire().getYear());
        assertEquals(11, product.getExpire().getMonthValue());
        assertEquals(12, product.getExpire().getDayOfMonth());
    }

    @Test
    void createStore() {
        Store store = new Store();
        store.addProduct(new Product("alma", 2020, 11, 12));
        store.addProduct(new Product("korte", 2021, 11, 12));
    }

    @DisplayName("When a product is added Then the Store saves it.")
    @Test
    void shouldContainAddedProduct() {
        final List<Product> result = store.getProducts();
        assertEquals(products, result, "Nem jó");
    }
}
