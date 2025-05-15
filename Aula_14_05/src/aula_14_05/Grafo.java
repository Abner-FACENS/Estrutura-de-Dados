
package aula_14_05;

import java.util.ArrayList;
import java.util.List;


public class Grafo {

    List<Cruzamento> incidencia = new ArrayList<Cruzamento>();

    public void cadastrarCruzamento(int id, String nome) {
        Cruzamento aux = new Cruzamento(id, nome);
        incidencia.add(aux);
    }

    public void editarCruzamento(int id, String novoNome) {
        Cruzamento aux = search(id);

        aux.nome = novoNome;
    }

    public void removerCruzamento(int id) {
        Cruzamento aux = search(id);

        //fazer lógica de remover arestas de outros vertices
        incidencia.remove(aux);
    }

    public void cadastrarRua(int idOrigin, int idDestino, String nome) {
        Cruzamento aux = search(idOrigin);

        aux.addAresta(nome, aux, search(idDestino));
    }

    public void editarRua(String nome, String novoNome) {
        Rua aux = searchRua(nome);

        aux.nome = novoNome;
    }

    public void removerRua(String nome) {
        Rua aux = searchRua(nome);

        for (int i = 0; i < incidencia.size(); i++)
        {
            for (int j = 0; i < incidencia.get(i).arestas.size(); i++) {
                
                if (incidencia.get(i).arestas.get(j).nome.equals(nome))
                {
                    aux = incidencia.get(i).arestas.get(j);
                    incidencia.get(i).arestas.remove(aux);
                }
            }
        }
    }

    private Cruzamento search(int id) {
        Cruzamento aux = null;

        for (int i = 0; i < incidencia.size(); i++) {
            if (incidencia.get(i).info == id) {
                aux = incidencia.get(i);
            }
        }
        return aux;
    }

    private Rua searchRua(String nome) {
        Rua aux = null;

        for (int i = 0; i < incidencia.size(); i++) {
            for (int j = 0; i < incidencia.get(i).arestas.size(); i++) {
                if (incidencia.get(i).arestas.get(j).nome.equals(nome)) {
                    aux = incidencia.get(i).arestas.get(j);
                    return aux;
                }
            }
        }
        return aux;
    }

    public void exibir() {
        for (int i = 0; i < incidencia.size(); i++) {
            Cruzamento aux = incidencia.get(i);
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
