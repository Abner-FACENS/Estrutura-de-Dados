package aula_12_03;

import java.util.ArrayList;
import java.util.List;


public class Fila 
{
    List fila = new ArrayList<TarefaRegular>();
    
    public void add (TarefaRegular p)
    {

                fila.add(p);
            
    }
    
    public void remove ()
    {
        fila.remove(0);
    }
    
    public boolean vazia ()
    {
        return fila.isEmpty();
    }
    
    public int tamanho ()
    {
        return fila.size();
    }
    
    public List listar()
    {
        return fila;
    }
    
}
