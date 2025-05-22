package aula_21_05;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    int [] lista = new int[9];

    public String linear(int num) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == num) {
                return "O número " + num + " está na posição " + i;
            }
        }

        return "O número não foi encontrado.";
    }

    public String binaria(int num) {
        int inicio = 0;
        int fim = lista.length - 1;

        do {
            int meio = (inicio + fim) / 2;

            if (lista[meio] == num) {
                return "O número " + num + " está na posição " + meio;
            } else if (lista[meio] > num) {
                inicio = meio + 1;
            } else if (lista[meio] < num) {
                fim = meio - 1;
            }

        } while (inicio <= fim);

        return "O número não foi encontrado.";
    }

    public void bubbleSort() {
        for (int i = 0; i < this.lista.length - 1; i++) {
            for (int j = 0; j < lista.length  - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int a = this.lista[j + 1];

                    lista[j + 1] = lista [j];
                    lista[j] = a;
                   
                }
            }
        }

    }

    public void exibir() {
        
        for (int i = 0; i < lista.length; i++)
        {
            System.out.print(lista[i] + " - ");
        }
    }

}
