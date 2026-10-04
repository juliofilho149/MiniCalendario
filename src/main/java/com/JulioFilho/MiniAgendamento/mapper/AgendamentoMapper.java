package com.JulioFilho.MiniAgendamento.mapper;

import com.JulioFilho.MiniAgendamento.dto.AgendamentoCreateRequest;
import com.JulioFilho.MiniAgendamento.dto.AgendamentoResponse;
import com.JulioFilho.MiniAgendamento.model.Agendamento;
import com.JulioFilho.MiniAgendamento.model.StatusAgendamento;

import java.time.LocalDateTime;

public class AgendamentoMapper {

    public static Agendamento toEntity(AgendamentoCreateRequest req){
        return Agendamento.builder()
                .titulo(req.titulo())
                .descricao(req.descricao())
                .dataInicio(req.dataInicio())
                .dataFim(req.dataFim())
                .usuario(req.usuario())
                .status(StatusAgendamento.AGENDADO)
                .criadoEm(LocalDateTime.now())
                .atualizadoEm(LocalDateTime.now())
                .build();

    }
    
    public static AgendamentoResponse toResponse(Agendamento a) {
        return new AgendamentoResponse(
                a.getId(),
                a.getTitulo(),
                a.getDescricao(),
                a.getDataInicio(),
                a.getDataFim(),
                a.getStatus(),
                a.getUsuario(),
                a.getCriadoEm(),
                a.getAtualizadoEm()
        );



    }


}
