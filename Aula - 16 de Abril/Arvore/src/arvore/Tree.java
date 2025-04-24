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

    public int procurarERetornar(int info) {
        return procurarERetornar(info, 0, this.root);
    }

    public int procurarERetornar(int info, int nivel, BinaryNode node) {
        BinaryNode aux = node;

        if (info > aux.info && aux.direita != null) {
            aux = aux.direita;
            nivel = procurarERetornar(info, nivel, aux);

        } else if (info < aux.info && aux.esquerda != null) {
            aux = aux.esquerda;
            nivel = procurarERetornar(info, nivel, aux);
        } else if (aux.direita == null && aux.esquerda == null && aux.info != info) {
            aux = null;
        }

        if (aux == null) {
            nivel = -1;
        }
        
        else if (nivel != -1){
            nivel++;
        }

        return nivel;
    }

    public BinaryNode searchDelete(int info, BinaryNode node) {
        BinaryNode aux = node;

        if (info < aux.info && aux.esquerda != null) {

            if (aux.esquerda.info == info) {
                return aux;
            }
            aux = aux.esquerda;

            aux = searchDelete(info, aux);

        } else if (info > aux.info && aux.direita != null) {

            if (aux.direita.info == info) {
                return aux;
            }
            aux = aux.direita;

            aux = searchDelete(info, aux);

        }

        return aux;
    }

    public void imprimirPreOrdem() {
        imprimirPreOrdem(this.root);

    }

    public void imprimirPreOrdem(BinaryNode a) {

        if (a != null) {
            System.out.print(a.info + " - ");
            imprimirPreOrdem(a.esquerda);
            imprimirPreOrdem(a.direita);
        }

    }

    public void imprimirPosOrdem() {
        imprimirPosOrdem(this.root);
    }

    public void imprimirPosOrdem(BinaryNode a) {

        if (a != null) {
            imprimirPosOrdem(a.esquerda);
            imprimirPosOrdem(a.direita);
            System.out.print(a.info + " - ");
        }
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdem(this.root);
    }

    public void imprimirEmOrdem(BinaryNode a) {

        if (a != null) {
            imprimirEmOrdem(a.esquerda);
            System.out.print(a.info + " - ");
            imprimirEmOrdem(a.direita);
        }

    }

    public void delete(int info) {
        BinaryNode aux = searchDelete(info, root);

        if (aux.direita.info == info) {

            if (aux.direita.esquerda != null) {
                aux.direita.esquerda.direita = aux.direita.direita;
                aux.direita = aux.direita.esquerda;

            } else if (aux.direita.direita != null) {
                aux.direita = aux.direita.direita;
            } else {
                aux.direita = null;
            }

        } else if (aux.esquerda.info == info) {

            if (aux.esquerda.esquerda != null) {
                aux.esquerda.esquerda.direita = aux.esquerda.direita;
                aux.esquerda = aux.esquerda.esquerda;

            } else if (aux.direita.direita != null) {
                aux.esquerda = aux.esquerda.direita;
            } else {
                aux.esquerda = null;
            }
        }

    }

}
