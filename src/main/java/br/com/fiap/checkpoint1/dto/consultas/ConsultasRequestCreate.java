package br.com.fiap.checkpoint1.dto.consultas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class ConsultasRequestCreate {
    private Long profissional_id;
    private Long paciente_id;
    private LocalDateTime data_consulta;
    private String status; //mudar para enum depois
    private BigInteger quantidade_horas;
    private BigDecimal valor_consulta;


    public Long getProfissional_id() {
        return profissional_id;
    }

    public void setProfissional_id(Long profissional_id) {
        this.profissional_id = profissional_id;
    }

    public Long getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Long paciente_id) {
        this.paciente_id = paciente_id;
    }

    public LocalDateTime getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(LocalDateTime data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getQuantidade_horas() {
        return quantidade_horas;
    }

    public void setQuantidade_horas(BigInteger quantidade_horas) {
        this.quantidade_horas = quantidade_horas;
    }

    public BigDecimal getValor_consulta() {
        return valor_consulta;
    }

    public void setValor_consulta(BigDecimal valor_consulta) {
        this.valor_consulta = valor_consulta;
    }
}
