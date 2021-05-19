package br.com.wlmfincatti.mdcsample.entrypoint.rest;

import br.com.wlmfincatti.mdcsample.domain.Product;
import br.com.wlmfincatti.mdcsample.usecase.UseCaseGetProducts;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final UseCaseGetProducts getProducts;

    @GetMapping
    public List<Product> getProducts(
            @RequestHeader(name = "x-request-id") String requestId) {
        log.info("request");
        return getProducts.execute();
    }
}
