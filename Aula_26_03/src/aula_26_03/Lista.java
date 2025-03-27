package aula_26_03;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    List<Node> Lista = new ArrayList<>();
    Node primeiro;
    int qtd = 0;
    Node ultimo;

    public void adicionar(Object info) 
    {
        Node n = new Node(info, null);
        Lista.add(n);
        
        if (qtd == 0)
        {
            primeiro = Lista.get(qtd);
            ultimo = Lista.get(qtd);
        }
        
        else {
            ultimo = Lista.get(qtd);
        }
        
        qtd++;
        
        
    }
    
    public void adicionar(Object info, int index) 
    {
         Node n = new Node(info, null);
         Lista.add(index, n);
         if (index > 0)
         {
             
           Lista.set(index - 1, primeiro);
         }
         
         
    }
    
    public Object remover ()
    {
        Object a = 0;
        return a;
    }
    
    public Object remover (int index)
    {
        Object a = 0;
        return a;
    }
    
    public int tamanho ()
    {
        return 0;
    }
    
    public void limpar ()
    {
        primeiro = null;
        ultimo = null;
        qtd = 0;
    }
    
    
}
