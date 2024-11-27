package com.postech.infra.mappers;

import com.postech.domain.entities.Producao;
import com.postech.domain.enums.EstadoProducaoEnum;
import com.postech.infra.dto.response.FinalizarPreparoResponseDTO;
import com.postech.infra.dto.response.IniciarPreparoResponseDTO;
import com.postech.infra.persistence.entities.ProducaoEntity;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-27T14:48:13-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class ProducaoMapperImpl implements ProducaoMapper {

    @Override
    public ProducaoEntity paraEntidade(Producao producao) {
        if ( producao == null ) {
            return null;
        }

        ProducaoEntity producaoEntity = new ProducaoEntity();

        producaoEntity.setId( producao.getId() );
        producaoEntity.setIdPedido( producao.getIdPedido() );
        producaoEntity.setStatus( producao.getStatus() );
        producaoEntity.setInicioPreparo( producao.getInicioPreparo() );
        producaoEntity.setFimPreparo( producao.getFimPreparo() );
        producaoEntity.setTempoTotalPreparo( producao.getTempoTotalPreparo() );

        return producaoEntity;
    }

    @Override
    public Producao paraDominio(ProducaoEntity clienteEntity) {
        if ( clienteEntity == null ) {
            return null;
        }

        Long idPedido = null;
        LocalDateTime inicioPreparo = null;

        idPedido = clienteEntity.getIdPedido();
        inicioPreparo = clienteEntity.getInicioPreparo();

        Producao producao = new Producao( idPedido, inicioPreparo );

        producao.setId( clienteEntity.getId() );
        producao.setStatus( clienteEntity.getStatus() );
        producao.setFimPreparo( clienteEntity.getFimPreparo() );
        producao.setTempoTotalPreparo( clienteEntity.getTempoTotalPreparo() );

        return producao;
    }

    @Override
    public IniciarPreparoResponseDTO paraIniciarPreparoDTO(Producao producao) {
        if ( producao == null ) {
            return null;
        }

        Long id = null;
        Long idPedido = null;
        EstadoProducaoEnum status = null;
        LocalDateTime inicioPreparo = null;

        id = producao.getId();
        idPedido = producao.getIdPedido();
        status = producao.getStatus();
        inicioPreparo = producao.getInicioPreparo();

        IniciarPreparoResponseDTO iniciarPreparoResponseDTO = new IniciarPreparoResponseDTO( id, idPedido, status, inicioPreparo );

        return iniciarPreparoResponseDTO;
    }

    @Override
    public FinalizarPreparoResponseDTO paraFinalizarPreparoDTO(Producao producao) {
        if ( producao == null ) {
            return null;
        }

        Long id = null;
        Long idPedido = null;
        EstadoProducaoEnum status = null;
        LocalDateTime inicioPreparo = null;
        LocalDateTime fimPreparo = null;
        LocalTime tempoTotalPreparo = null;

        id = producao.getId();
        idPedido = producao.getIdPedido();
        status = producao.getStatus();
        inicioPreparo = producao.getInicioPreparo();
        fimPreparo = producao.getFimPreparo();
        tempoTotalPreparo = producao.getTempoTotalPreparo();

        FinalizarPreparoResponseDTO finalizarPreparoResponseDTO = new FinalizarPreparoResponseDTO( id, idPedido, status, inicioPreparo, fimPreparo, tempoTotalPreparo );

        return finalizarPreparoResponseDTO;
    }
}
