package aula_14_05;

public class Main {

    
    public static void main(String[] args) 
    {
        
        Grafo grafo = new Grafo();
        Coordenada coord;
        
        grafo.cadastrarCruzamento(1, "Cruzamento 1");
        grafo.cadastrarCruzamento(2, "Cruzamento 2");
        grafo.cadastrarCruzamento(3, "Cruzamento 3");
        grafo.cadastrarCruzamento(4, "Cruzamento 4");
        grafo.cadastrarCruzamento(5, "Cruzamento 5");
        grafo.cadastrarCruzamento(6, "Cruzamento 6");
        grafo.cadastrarCruzamento(7, "Cruzamento 7");
        grafo.cadastrarCruzamento(8, "Cruzamento 8");
        grafo.cadastrarCruzamento(9, "Cruzamento 9");
        grafo.cadastrarCruzamento(10, "Cruzamento 10");
        grafo.cadastrarCruzamento(11, "Cruzamento 11");
        
        
        
        grafo.cadastrarRua(1, 2, "Rua 1");
        grafo.cadastrarRua(2, 1, "Rua 1");
        
        grafo.cadastrarRua(2, 3, "Rua 2");
        
        grafo.cadastrarRua(3, 4, "Rua 3");
        
        grafo.cadastrarRua(4, 5, "Rua 4");
        
        grafo.cadastrarRua(5, 6, "Rua 5");
        
        grafo.cadastrarRua(6, 11, "Rua 6");

        grafo.cadastrarRua(1, 10, "Rua 7");
        
        grafo.cadastrarRua(10, 11, "Rua 8");
        
        grafo.cadastrarRua(1, 9, "Rua 9");
        
        grafo.cadastrarRua(9, 8, "Rua 10");
        
        grafo.exibir();
        
    }
    
}
