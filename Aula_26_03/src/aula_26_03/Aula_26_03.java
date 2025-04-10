package aula_26_03;


public class Aula_26_03 {


    public static void main(String[] args) {
       Lista lista = new Lista();
       
       lista.add("A");
       lista.add("B");
       lista.add("C");
       lista.add("D", 2);
       
      
       lista.remove(0);
       lista.remove("C");
       lista.listar();

    }
    
}
