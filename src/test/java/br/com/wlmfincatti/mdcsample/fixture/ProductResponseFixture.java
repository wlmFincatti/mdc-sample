package br.com.wlmfincatti.mdcsample.fixture;

import br.com.wlmfincatti.mdcsample.external.dto.ProductResponse;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class ProductResponseFixture {

    public static ProductResponse gimmeProductResponse() {
        return ProductResponse.builder()
                .name("PS5")
                .price(new BigDecimal("5000"))
                .build();
    }

    public static List<ProductResponse> gimmeProductsResponse() {
        return Collections.singletonList(gimmeProductResponse());
    }
}
