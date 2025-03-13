package aula_12_03;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    List<TarefaNumerada> lista = new ArrayList<TarefaNumerada>();

    public void add(TarefaNumerada item) {
        lista.add(item);
    }

    public void remove() {
        if (!lista.isEmpty()) {
            
            int indice = Integer.MAX_VALUE;
            
            for (int i = 0; i < lista.size(); i++)
            {
                if (lista.get(i).getPrioridade() < indice)
                {
                    indice = i;
                }
            }
            lista.remove(indice);
        }
        
    }
    
    public boolean vazia ()
    {
        return lista.isEmpty();
    }
    public int tamanho ()
    {
        return lista.size();
    }
    
    public List listar()
    {
        return lista;
    }

    
}
