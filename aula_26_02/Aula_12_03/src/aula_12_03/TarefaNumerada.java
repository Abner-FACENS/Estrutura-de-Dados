package aula_12_03;

import java.time.LocalDate;

public class TarefaNumerada 
{
    private String descricao;
    private LocalDate dataCriacao;
    private int prioridade;

    public TarefaNumerada(String descricao, int prioridade) {
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
    
}
