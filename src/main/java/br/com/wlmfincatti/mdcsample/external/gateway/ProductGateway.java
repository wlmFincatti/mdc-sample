package br.com.wlmfincatti.mdcsample.external.gateway;

import br.com.wlmfincatti.mdcsample.external.dto.ProductResponse;

import java.util.List;

public interface ProductGateway {

    List<ProductResponse> getProducts();
}
