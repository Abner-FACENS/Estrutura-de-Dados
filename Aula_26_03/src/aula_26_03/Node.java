package aula_26_03;

public class Node {
    
    String info;
    Node prox;
    Node ant;

    public Node(String info, Node prox) {
        this.info = info;
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "[ " + info + " ]";
    }
    

    
    
    
}
