
package aula_07_05;

import java.util.ArrayList;
import java.util.List;


public class Vertice 
{
    int info;
    List<Aresta> arestas = new ArrayList<Aresta>();

    public Vertice(int info) {
        this.info = info;
    }
    
    public void addAresta(Vertice aux, Vertice link) {       
        Aresta a = new Aresta(aux, link, 1);
        arestas.add(a);
    }

    @Override
    public String toString() {
        return "" + info;
    }
    
    
    
    
    
}
