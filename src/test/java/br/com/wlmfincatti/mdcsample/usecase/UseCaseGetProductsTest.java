package br.com.wlmfincatti.mdcsample.usecase;

import br.com.wlmfincatti.mdcsample.domain.Product;
import br.com.wlmfincatti.mdcsample.external.dto.ProductResponse;
import br.com.wlmfincatti.mdcsample.external.gateway.ProductGateway;
import br.com.wlmfincatti.mdcsample.fixture.ProductResponseFixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UseCaseGetProductsTest {

    private ProductGateway gateway;
    private UseCaseGetProducts useCaseGetProducts;

    @BeforeEach
    void setup() {
        gateway = mock(ProductGateway.class);
        useCaseGetProducts = new UseCaseGetProducts(gateway);
    }

    @Test
    void shouldGetProducts() {
        final List<ProductResponse> productResponses = ProductResponseFixture.gimmeProductsResponse();
        when(gateway.getProducts()).thenReturn(productResponses);

        final List<Product> result = useCaseGetProducts.execute();

        verify(gateway, times(1)).getProducts();
        assertEquals(1, result.size());
        assertEquals("PS5", result.get(0).getName());
        assertEquals(new BigDecimal("5000"), result.get(0).getPrice());
    }
}