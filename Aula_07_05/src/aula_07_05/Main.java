package aula_07_05;


public class Main {

    
    public static void main(String[] args) 
    {
        Grafo grafo = new Grafo();
        
        grafo.addVertice(0);
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addVertice(5);
        grafo.addVertice(6);
        
        grafo.addAresta(0, 1);
        grafo.addAresta(0, 2);
        grafo.addAresta(0, 4);
        
        grafo.addAresta(1, 0);
        grafo.addAresta(1, 3);
        grafo.addAresta(1, 5);
        
        grafo.addAresta(2, 0);
        grafo.addAresta(2, 4);
        grafo.addAresta(2, 5);
        
        grafo.addAresta(4, 0);
        grafo.addAresta(4, 2);
        grafo.addAresta(4, 3);
        
        grafo.addAresta(5, 1);
        grafo.addAresta(5, 2);
        
        grafo.addAresta(3, 1);
        grafo.addAresta(3, 4);
        grafo.addAresta(3, 6);
        
        grafo.addAresta(6, 3);
        
        grafo.exibir();
        
        System.out.println("-----------------");
        
        grafo.removerVertice(6);
        grafo.exibir();
        
    }
    
}
