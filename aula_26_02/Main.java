package aula_26_02;


public class Main {

    public static void main(String[] args) 
    {
        FilaPrioridade filaBanco = new FilaPrioridade();
        
        filaBanco.add(new Pessoa("Pedro", 15));
        filaBanco.add(new Pessoa("Mario", 50));
        filaBanco.add(new Pessoa("Maria", 61));
        filaBanco.add(new Pessoa("Jose", 20));
        filaBanco.add(new Pessoa("Carlos", 70));
        filaBanco.add(new Pessoa("Mauricio", 65));
        
        System.out.println("=== Fila Prioridade ===");
        
        while (filaBanco.tamanho() > 0)
        {
            Pessoa p = filaBanco.remove();
            System.out.println(p.getNome() + " - " + p.getIdade());
        }

    }
    
}
