package com.postech.infra.dto.client.pedido;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoProdutoResponseDTO {

    private Long id;

    @JsonIgnore
    private PedidoResponseDTO pedido;

    private ProdutoResponseDTO produto;

    private int quantidade;

}
