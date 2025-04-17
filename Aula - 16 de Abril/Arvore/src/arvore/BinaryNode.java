package arvore;


public class BinaryNode {
    
    int info;
    BinaryNode esquerda, direita;

    public BinaryNode(int info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "" + info;
    }
    
    
    
}
