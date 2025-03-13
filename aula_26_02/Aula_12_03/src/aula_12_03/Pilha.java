package aula_12_03;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    
    List<Object> pilha =  new ArrayList<>();
    private int indice = 0;
 
    
    public void empilhar(Object valor){
            pilha.add(valor);
            indice++;
    }
    public void desempilhar(){
        if(!pilha.isEmpty()){
            indice--;
            pilha.remove(indice);
        }
    }
    
    public boolean vazia ()
    {
        return pilha.isEmpty();
    }
    public int tamanho ()
    {
        return pilha.size();
    }

    public List listar()
    {
        return pilha;
    }
    
}
