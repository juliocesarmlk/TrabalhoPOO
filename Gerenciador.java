import java.util.ArrayList;
import java.util.Scanner;
public class Gerenciador{

   private int cont = 0;
   private int concluindo;
   ArrayList<Tarefa> pendentes = new ArrayList<Tarefa>();
   Scanner leitor = new Scanner(System.in);
   
   public void setCont(int cont){
      this.cont = cont;
   }
   public void setConcluindo(int concluindo){
      this.concluindo = concluindo;
   }
   public int getCont(){
      return cont;
   }
   public int getConcluindo(){
      return concluindo;
   }
   
    public void addTarefa(){  
      System.out.println("Digite o titulo da sua tarefa");
      String titulo = leitor.nextLine();
      System.out.println("Digite a descricao da sua tarefa");
      String descricao = leitor.nextLine();
      Tarefa tarefa = new Tarefa(titulo, descricao);                
      pendentes.add(tarefa); 
   }
   
   public void exibirTarefas() {

    for (Tarefa t : pendentes) {
        System.out.println("Tarefa: " + cont);
        System.out.println("Titulo: " + t.getTitulo());
        System.out.println("Descricao: " + t.getDescricao());
        System.out.println("Data de inicio: " + t.getDataInicio());
        System.out.println("Status: " + t.getStatus());
        System.out.println("-----------------------");
    }
}
   public void concluirTarefa(){
      if(pendentes.isEmpty()){
         System.out.println("Nao ha tarefas para serem concluidas");
      }
      else{
         System.out.println("Digite o numero da tarefa que voce concluiu");
         concluindo = leitor.nextInt();
         for (Tarefa t : pendentes){
            System.out.println(cont);   
         }
      }
   }
         
   }
