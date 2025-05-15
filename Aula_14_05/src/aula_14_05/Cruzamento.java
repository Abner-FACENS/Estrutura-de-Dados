package aula_14_05;

import java.util.ArrayList;
import java.util.List;


public class Cruzamento 
{
    int info;
    String nome;
    List<Rua> arestas = new ArrayList<Rua>();

    public Cruzamento(int info, String nome) {
        this.info = info;
        this.nome = nome;
    }
    
    public void addAresta(String nome, Cruzamento aux, Cruzamento link) {       
        Rua a = new Rua(nome, aux, link);
        arestas.add(a);
    }

    @Override
    public String toString() {
        return "" + info;
    }
    
    
    
    
    
}
