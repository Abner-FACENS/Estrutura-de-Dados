package aula_26_02;

import java.util.ArrayList;
import java.util.List;

public class Fila {

    List<Object> fila = new ArrayList<Object>();

    public void add(Object item) {
        fila.add(item);
    }

    public Object remove() {
        if (!fila.isEmpty()) {
            return fila.remove(0);
        }
        else {
            return "A fila está vazia";
        }
    }

}
