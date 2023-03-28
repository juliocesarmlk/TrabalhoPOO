import java.util.ArrayList;
import java.util.Scanner;
public class Gerenciador{

   ArrayList<Tarefa> lista = new ArrayList<Tarefa>();
   
    public void addTarefa(){  
      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite o titulo da sua tarefa");
      String titulo = leitor.nextLine();
      System.out.println("Digite a descricao da sua tarefa");
      String descricao = leitor.nextLine();
      Tarefa tarefa = new Tarefa(titulo, descricao);                
      lista.add(tarefa); 
   }
   
   public void exibirTarefas() {
    for (Tarefa t : lista) {
        System.out.println("Titulo: " + t.getTitulo());
        System.out.println("Descricao: " + t.getDescricao());
        System.out.println("Data de inicio: " + t.getDataInicio());
        System.out.println("Status: " + t.getStatus());
        System.out.println("-----------------------");
    }
}
         
   }
