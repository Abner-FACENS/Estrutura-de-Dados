package Aula_09_04;

public class Node_Duplo {
    
    int info;
    Node_Duplo prox;
    Node_Duplo ant;

    public Node_Duplo(int info, Node_Duplo prox) {
        this.info = info;
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "[ " + info + " ]";
    }
    

    
    
    
}
