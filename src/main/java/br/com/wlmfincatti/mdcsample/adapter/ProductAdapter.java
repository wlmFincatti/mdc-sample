package br.com.wlmfincatti.mdcsample.adapter;

import br.com.wlmfincatti.mdcsample.domain.Product;
import br.com.wlmfincatti.mdcsample.external.dto.ProductResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductAdapter {

    public static Product convert(ProductResponse productResponse) {
        return Product
                .builder()
                .amount(productResponse.getAmount())
                .name(productResponse.getName())
                .build();
    }
}
