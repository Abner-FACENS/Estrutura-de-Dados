package arvore;

public class Tree {

    BinaryNode root;

    public void add(int valor) {
        BinaryNode newest = new BinaryNode(valor);

        if (root == null) {
            root = newest;
        } else {
            BinaryNode aux = search(valor, root);
            if (valor > aux.info) {
                aux.direita = newest;
            } else if (valor < aux.info) {
                aux.esquerda = newest;
            }

        }

    }

    public BinaryNode search(int info, BinaryNode node) {
        BinaryNode aux = node;

        if (info > aux.info && aux.direita != null) {
            aux = aux.direita;
            aux = search(info, aux);

        } else if (info < aux.info && aux.esquerda != null) {
            aux = aux.esquerda;
            aux = search(info, aux);
        }

        return aux;
    }

    public void imprimirPreOrdem(BinaryNode a) {
        if (a == root) {
            System.out.println(a);
        }

        if (a.esquerda != null) {
            System.out.println(a.esquerda);
            imprimirPreOrdem(a.esquerda);
        }

        if (a.direita != null) {
            System.out.println(a.direita);
            imprimirPreOrdem(a.direita);
        }

    }

    public void imprimirPosOrdem(BinaryNode a) {

        if (a.esquerda != null) {
            imprimirPosOrdem(a.esquerda);
            System.out.println(a.esquerda);
        }

        if (a.direita != null) {
            imprimirPosOrdem(a.direita);
            System.out.println(a.direita);

        }
        if (a == root) {
            System.out.println(a);
        }
    }

    public void imprimirEmOrdem(BinaryNode a) {
        
        if (a.esquerda != null)
        {
            imprimirEmOrdem(a.esquerda);
            System.out.println(a);
        }
    }

}
