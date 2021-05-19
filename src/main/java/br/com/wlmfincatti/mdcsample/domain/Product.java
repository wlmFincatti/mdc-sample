package br.com.wlmfincatti.mdcsample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String name;
    private Integer amount;
    private BigDecimal price;
}
