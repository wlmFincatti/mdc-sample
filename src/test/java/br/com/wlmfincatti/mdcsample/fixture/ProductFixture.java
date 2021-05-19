package br.com.wlmfincatti.mdcsample.fixture;

import br.com.wlmfincatti.mdcsample.domain.Product;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class ProductFixture {

    public static Product gimmeProduct() {
        return Product.builder()
                .name("PS5")
                .amount(123)
                .price(new BigDecimal("5000"))
                .build();
    }

    public static List<Product> gimmeProducts() {
        return Collections.singletonList(gimmeProduct());
    }
}
