package br.com.wlmfincatti.mdcsample.usecase;

import br.com.wlmfincatti.mdcsample.adapter.ProductAdapter;
import br.com.wlmfincatti.mdcsample.domain.Product;
import br.com.wlmfincatti.mdcsample.external.gateway.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UseCaseGetProducts {

    private final ProductGateway gateway;

    public List<Product> execute() {
        return gateway.getProducts()
                .stream()
                .map(ProductAdapter::convert)
                .collect(Collectors.toList());
    }
}
