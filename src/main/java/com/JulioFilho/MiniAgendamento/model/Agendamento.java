package com.JulioFilho.MiniAgendamento.model;

import com.JulioFilho.MiniAgendamento.model.StatusAgendamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_agendamento")

public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(name="data_inicio", nullable = false)
    private String dataInicio;

    @Column(name="data_fim", nullable = false)
    private String dataFim;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatusAgendamento status;

    @Column(nullable = false, length = 80)
    private String usuario;

    @Column(name = "crieado_em", nullable = false)
    private String criadoEm;

    @Column(name = "atualizado_em", nullable = false)
    private String autalizadoEm;

}
