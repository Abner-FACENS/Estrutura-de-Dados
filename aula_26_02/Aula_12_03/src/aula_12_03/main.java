package aula_12_03;

public class main {

    public static void main(String[] args) {

        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        gerenciador.adicionarTarefaRegular("Enviar relatório");
        gerenciador.adicionarTarefaPrioritaria("Resolver problema urgente");
        gerenciador.adicionarTarefaNumerada("Atualizar banco de dados", 5);
        gerenciador.adicionarTarefaNumerada("Corrigir erros de digitação", 2);
        gerenciador.adicionarTarefaRegular("Preparar apresentação");
        gerenciador.adicionarTarefaRegular("Preparar Café");

        gerenciador.processarProximaTarefa(); // Deve processar "Resolver problema urgente"
        gerenciador.processarProximaTarefa(); // Deve processar " Corrigir erros de digitação "
        gerenciador.processarProximaTarefa(); // Deve processar " Atualizar banco de dados "
        gerenciador.processarProximaTarefa(); // Deve processar "Enviar relatório"

        gerenciador.exibirRestantes();
    }

}
