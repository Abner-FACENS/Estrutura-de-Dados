package aula_26_03;

public class Lista {

    Node primeiro;
    int qtd = 0;
    Node ultimo;
    Node aux;
    Node check = primeiro;
    Node temp;

    public void add(String info) {
        aux = new Node(info, null);

        if (qtd == 0) {
            primeiro = aux;
            ultimo = aux;
        } else {
            ultimo.prox = aux;
            aux.ant = ultimo;
            ultimo = ultimo.prox;
        }

        qtd++;
    }

    public void add(String info, int index) {
        aux = new Node(info, null);
        temp = buscaNode(index);

        if (index == 0 && temp != null) {
            aux.prox = primeiro;
            primeiro = aux;
        } else if (temp == ultimo) {
            ultimo.prox = aux;
            aux.ant = ultimo;
            ultimo = aux;
        } else if (temp != null) {
            aux.ant = temp.ant;
            aux.prox = temp;
            temp.ant.prox = aux;
            temp.ant = aux;
        } else {
            System.out.println("Indice inválido!");
        }

    }

    public String get(int n) {

        return buscaNode(n).info;
    }

    private Node buscaNode(int indice) {
        Node temporario;
        if (indice < 0 || indice >= qtd) {
            return null;
        }

        temporario = primeiro;
        for (int i = 0; i < indice; i++) {
            temporario = temporario.prox;
        }

        return temporario;

    }

    private Node buscaNode(String info) {
        Node temporario = primeiro;

        while (temporario != ultimo) {

            if (temporario.info.equals(info)) {
                return temporario;
            }
            temporario = temporario.prox;
        }

        return null;

    }

    public void listar() {
        temp = primeiro;

        while (temp != ultimo) {
            System.out.println(temp);
            temp = temp.prox;
        }
        System.out.println(temp);
    }

    public void remove(int index) {
        temp = buscaNode(index);

        if (index == 0 && temp != null) {
            temp.prox.ant = null;
            primeiro = temp.prox;
        } else if (temp == ultimo) {
            temp.ant.prox = null;
            ultimo = temp.ant;
        } else if (temp != null) {
            temp.ant.prox = temp.prox;
            temp.prox.ant = temp.ant;
        } else {
            System.out.println("Indice inválido!");
        }
        
        qtd--;
    }

    public void remove(String info) {
        temp = buscaNode(info);

        if (temp != null && temp == primeiro) {
            temp.prox.ant = null;
            primeiro = temp.prox;
        } else if (temp == ultimo) {
            temp.ant.prox = null;
            ultimo = temp.ant;
        } else if (temp != null) {
            temp.ant.prox = temp.prox;
            temp.prox.ant = temp.ant;
        } else {
            System.out.println("Valor inválido!");
        }
        
        qtd--;
    }
}
