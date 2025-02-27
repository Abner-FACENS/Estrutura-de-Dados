package aula_26_02;

import java.util.ArrayList;
import java.util.List;


public class FilaPrioridade 
{
    private List fila = new ArrayList<Pessoa>();
    private List filaPrioridade = new ArrayList<Pessoa>();
    
    public void add (Pessoa p)
    {
        if (p.getIdade() >= 60)
        {
            filaPrioridade.add(p);
        }
        
        else {
            fila.add(p);
        }
    }
    
    public Pessoa remove ()
    {
        if (!filaPrioridade.isEmpty())
        {
            return (Pessoa) filaPrioridade.remove(0);
        }
        
        return (Pessoa) fila.remove(0);
    }
    
    public int tamanho ()
    {
        return fila.size() + filaPrioridade.size();
    }
    
}
