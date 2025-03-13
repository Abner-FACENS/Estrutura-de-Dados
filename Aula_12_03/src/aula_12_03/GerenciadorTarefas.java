package aula_12_03;

import java.util.List;

public class GerenciadorTarefas 
{
    
    private Pilha tarefasPrioritarias = new Pilha();
    private Lista tarefasNumeradas = new Lista();
    private Fila tarefasRegulares = new Fila();
    
    public void adicionarTarefaRegular (String descricao)
    {
        tarefasRegulares.add(new TarefaRegular(descricao));
    }
    
    public void adicionarTarefaPrioritaria (String descricao)
    {
        tarefasPrioritarias.empilhar(new TarefaPrioritaria(descricao));
    }
    
    public void adicionarTarefaNumerada (String descricao, int prioridade)
    {
        tarefasNumeradas.add(new TarefaNumerada(descricao, prioridade));
    }
    
    public void processarProximaTarefa ()
    {
        if (!tarefasPrioritarias.vazia())
        {
                tarefasPrioritarias.desempilhar();
        }
        
        else if (!tarefasNumeradas.vazia())
        {
                tarefasNumeradas.remove();
        }
        
        else if (!tarefasRegulares.vazia())
        {
                tarefasRegulares.remove();
        }
    }

    public void exibirRestantes()
    {
        
        for (int i = 0; i < tarefasPrioritarias.listar().size(); i++)
        {
            System.out.println(tarefasPrioritarias.listar().get(i));
        }
        
        
        for (int i = 0; i < tarefasNumeradas.listar().size(); i++)
        {
            System.out.println(tarefasNumeradas.listar().get(i));
        }
        
        for (int i = 0; i < tarefasRegulares.listar().size(); i++)
        {
            System.out.println(tarefasRegulares.listar().get(i));
        }
        
        
    }
    
    
    
    
}
