package Aula_09_04;

public class Main {

    public static void main(String[] args) {
        Lista_Dupla lista = new Lista_Dupla();

        lista.adicionarOrdenado(1, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(3, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(5, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(7, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(4, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(2, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(10, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(6, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(14, TipoOrdenacao.CRESCENTE);
        lista.adicionarOrdenado(12, TipoOrdenacao.CRESCENTE);

        lista.listar();
        lista.limpar();
        
        lista.adicionarOrdenado(1, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(3, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(5, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(7, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(4, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(2, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(10, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(6, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(14, TipoOrdenacao.DECRESCENTE);
        lista.adicionarOrdenado(12, TipoOrdenacao.DECRESCENTE);
        
        lista.listar();
    }

}
