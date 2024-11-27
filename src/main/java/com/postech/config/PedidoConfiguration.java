package com.postech.config;

import com.postech.infra.client.PedidoClientImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class PedidoConfiguration {

    @Value("${backend.pedido.url}")
    private String pedidoUrl;

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.build();
    }

    @Bean
    PedidoClientImpl pedidoClient(WebClient client) {
        return new PedidoClientImpl(client, pedidoUrl);
    }

}
