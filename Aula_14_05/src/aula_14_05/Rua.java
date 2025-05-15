package aula_14_05;

import java.util.ArrayList;
import java.util.List;

public class Rua {
    
    String nome;
    Cruzamento origem;
    Cruzamento destino;
    float distanciaTotal;
    Coordenada coordenadaInicial;
    Coordenada coordenadaFinal;

    public Rua(String nome, Cruzamento origem, Cruzamento destino ) {

        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
       
    }

    

}
