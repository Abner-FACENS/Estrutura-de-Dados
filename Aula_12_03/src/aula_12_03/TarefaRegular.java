
package aula_12_03;

import java.time.LocalDate;


public class TarefaRegular 
{
    private String descricao;
    private LocalDate dataCriacao;

    public TarefaRegular(String descricao) {
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
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

    @Override
    public String toString() {
        return descricao;
    }
    
}
