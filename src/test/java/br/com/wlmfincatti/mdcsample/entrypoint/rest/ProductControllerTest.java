package br.com.wlmfincatti.mdcsample.entrypoint.rest;

import br.com.wlmfincatti.mdcsample.fixture.ProductFixture;
import br.com.wlmfincatti.mdcsample.usecase.UseCaseGetProducts;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UseCaseGetProducts useCaseGetProducts;

    @Test
    void shouldGetProducts() throws Exception {
        when(useCaseGetProducts.execute()).thenReturn(ProductFixture.gimmeProducts());

        mockMvc.perform(get("/product")
                .header("X-REQUEST-ID", "test123"))
                .andExpect(jsonPath("$[0].name").value("PS5"))
                .andExpect(jsonPath("$[0].amount").value("123"))
                .andExpect(jsonPath("$[0].price").value("5000"))
                .andExpect(status().isOk());
    }
}