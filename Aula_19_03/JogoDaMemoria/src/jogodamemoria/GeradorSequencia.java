package jogodamemoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;


public class GeradorSequencia {

    Random gerador = new Random();

    public List geraSequencia(int num, JButton[] botoes) {
        List<Integer> lista = new ArrayList<>();
        List<JButton> lista2 = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            lista.add(gerador.nextInt(8));
        }

        for (int i = 0; i < lista.size(); i++) {
            switch(lista.get(i))
            {
                case 0:
                    lista2.add(botoes[0]);
                    break;
                case 1:
                    lista2.add(botoes[1]);
                    break;
                case 2:
                    lista2.add(botoes[2]);
                    break;
                case 3:
                    lista2.add(botoes[3]);
                    break;
                case 4:
                    lista2.add(botoes[4]);
                    break;
                case 5:
                    lista2.add(botoes[5]);
                    break;
                case 6:
                    lista2.add(botoes[6]);
                    break;
                case 7:
                    lista2.add(botoes[7]);
                    break;
                case 8:
                    lista2.add(botoes[8]);
                    break;
            }
        }

        return lista2;

    }
}
