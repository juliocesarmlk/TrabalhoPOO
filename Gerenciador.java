import java.util.ArrayList;
public class Gerenciador{

   private int concluindo;
   ArrayList<Tarefa> pendentes = new ArrayList<Tarefa>();
   ArrayList<Tarefa> concluidas = new ArrayList<Tarefa>();
   
   public void setConcluindo(int concluindo){
      this.concluindo = concluindo;
   }
   public int getConcluindo(){
      return concluindo;
   }
   
    public void addTarefa(){
      Uteis.print("Digite o titulo da sua tarefa");
      String titulo = Uteis.lerString();
      Uteis.print("Digite a descricao da sua tarefa");
      String descricao = Uteis.lerString();
      Tarefa tarefa = new Tarefa(titulo, descricao);                
      pendentes.add(tarefa); 
      // adicionar ao arquivo do usuario
   }
   
   public void exibirTarefas() {
   int index = 0;
    for (Tarefa t : pendentes) {
        Uteis.print("Número da tarefa: " + index++);
        Uteis.print("Titulo: " + t.getTitulo());
        Uteis.print("Descricao: " + t.getDescricao());
        Uteis.print("Data de inicio: " + t.getDataInicio());
        Uteis.print("Status: " + t.getStatus());
        Uteis.print("-----------------------");
    }
}
   public void concluirTarefa(){
      if(pendentes.isEmpty()){
         Uteis.print("Nao ha tarefas para serem concluidas");
      }
      else{
         exibirTarefas();
         Uteis.print("Digite o numero da tarefa que voce concluiu");
         int indiceFinalizado = Uteis.lerInt();
         Tarefa tarefaConcluida = pendentes.get(indiceFinalizado);
         tarefaConcluida.setStatus("True");
         concluidas.add(tarefaConcluida);
         pendentes.remove(tarefaConcluida);
         // adicionar ao arquivo do usuario
      }
      
   }
   public void exibirConcluidas() {
         int index = 0;
         for (Tarefa t : concluidas) {
         Uteis.print("Número da tarefa: " + index++);
         Uteis.print("Titulo: " + t.getTitulo());
         Uteis.print("Descricao: " + t.getDescricao());
         Uteis.print("Data de inicio: " + t.getDataInicio());
         Uteis.print("Status: " + t.getStatus());
         Uteis.print("-----------------------");
    }


}  
   }
