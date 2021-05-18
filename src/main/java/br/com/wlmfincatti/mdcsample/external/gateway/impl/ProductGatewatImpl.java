package br.com.wlmfincatti.mdcsample.external.gateway.impl;

import br.com.wlmfincatti.mdcsample.external.dto.ProductResponse;
import br.com.wlmfincatti.mdcsample.external.gateway.ProductGateway;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Collections.singletonList;

@Component
public class ProductGatewatImpl implements ProductGateway {
    @Override
    public List<ProductResponse> getProducts() {
        final ProductResponse product = ProductResponse.builder()
                .name("PS5")
                .amount(123)
                .build();
        return singletonList(product);
    }
}
