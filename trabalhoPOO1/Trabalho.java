import java.util.Date;

public class Trabalho {
   public static void main(String[] args){
      Tarefa tarefa1 = new Tarefa("Estudar para a prova", "Resumir todos os slides so trabalho");
      ListaTarefas Lista_de_tarefas = new ListaTarefas();
      Lista_de_tarefas.addFirst(tarefa1);
   }
}