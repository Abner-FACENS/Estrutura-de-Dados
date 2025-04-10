package Aula_09_04;

public class Lista_Dupla {

    Node_Duplo primeiro;
    int qtd = 0;
    Node_Duplo ultimo;
    Node_Duplo aux;
    Node_Duplo check;
    Node_Duplo temp;

    public void add(int info) {
        aux = new Node_Duplo(info, null);

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

    public void add(int info, int index) {
        aux = new Node_Duplo(info, null);
        temp = buscaNode_Duplo(index);

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

    public void adicionarOrdenado(int info, TipoOrdenacao tipo) {
        aux = new Node_Duplo(info, null);
        check = primeiro;

        if (tipo == TipoOrdenacao.CRESCENTE) {
            if (qtd == 0) {
                primeiro = aux;
                ultimo = aux;

            } else if (aux.info > ultimo.info) {
                ultimo.prox = aux;
                aux.ant = ultimo;
                ultimo = aux;

            } else if (aux.info < primeiro.info) {
                aux.prox = primeiro;
                primeiro.ant = aux;
                primeiro = aux;
            } else {
                for (int i = 0; i < qtd; i++) {
                    if (aux.info > check.info && aux.info < check.prox.info) {
                        aux.prox = check.prox;
                        aux.ant = check;
                        check.prox.ant = aux;
                        check.prox = aux;
                    }
                    check = check.prox;
                }
            }
        } 
        else if (tipo == TipoOrdenacao.DECRESCENTE) {
            if (qtd == 0) {
                primeiro = aux;
                ultimo = aux;

            } else if (aux.info < ultimo.info) {
                ultimo.prox = aux;
                aux.ant = ultimo;
                ultimo = aux;

            } else if (aux.info > primeiro.info) {
                aux.prox = primeiro;
                primeiro.ant = aux;
                primeiro = aux;
            } else {
                for (int i = 0; i < qtd; i++) {
                    if (aux.info < check.info && aux.info > check.prox.info) {
                        aux.prox = check.prox;
                        aux.ant = check;
                        check.prox.ant = aux;
                        check.prox = aux;
                    }
                    check = check.prox;
                }
            }
        }
        qtd++;
    }

    public int get(int n) {

        return buscaNode_Duplo(n).info;
    }

    private Node_Duplo buscaNode_Duplo(int indice) {
        Node_Duplo temporario;
        if (indice < 0 || indice >= qtd) {
            return null;
        }

        temporario = primeiro;
        for (int i = 0; i < indice; i++) {
            temporario = temporario.prox;
        }

        return temporario;

    }

    private Node_Duplo buscaNode_Duplo(Integer info) {
        Node_Duplo temporario = primeiro;

        while (temporario != ultimo) {

            if (temporario.info == info) {
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
        temp = buscaNode_Duplo(index);

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

    public void remove(Integer info) {
        temp = buscaNode_Duplo(info);

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
    
    public void limpar()
    {
        primeiro = null;
        ultimo = null;
        qtd = 0;
    }
}
