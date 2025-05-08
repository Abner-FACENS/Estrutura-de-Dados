package aula_07_05;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    List<Vertice> incidencia = new ArrayList<Vertice>();

    public void addVertice(int info) {
        Vertice aux = new Vertice(info);
        incidencia.add(aux);
    }

    public void addAresta(int org, int dest) {
        Vertice origem = search(org);
        origem.addAresta(origem, search(dest));

    }

    public void removerVertice(int info) {
        Vertice aux = search(info);
        
        //fazer lógica de remover arestas de outros vertices

        incidencia.remove(aux);
    }

    private Vertice search(int info) {
        Vertice aux = null;

        for (int i = 0; i < incidencia.size(); i++) {
            if (incidencia.get(i).info == info) {
                aux = incidencia.get(i);
            }
        }
        return aux;
    }

    public void exibir() {
        for (int i = 0; i < incidencia.size(); i++) {
            Vertice aux = incidencia.get(i);
            System.out.print(aux.info);
            if (aux.arestas.size() > 0) {
                for (int j = 0; j < aux.arestas.size(); j++) {
                    System.out.print(" - " + aux.arestas.get(j).destino);
                }
                System.out.println("");
            } else {
                System.out.println("");
            }
        }
    }

}
