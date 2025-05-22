package aula_21_05;

import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        
        Lista list = new Lista();
        
        list.lista[0] = 1;
        list.lista[1] = 3;
        list.lista[2] = 2;
        list.lista[3] = 7;
        list.lista[4] = 5;
        list.lista[5] = 4;
        list.lista[6] = 10;
        list.lista[7] = 8;
        list.lista[8] = 9;
        
        list.exibir();
        System.out.println("");
        list.bubbleSort();
        list.exibir();
    }
    
}
