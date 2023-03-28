import java.util.Scanner;

public class Menu{

   Scanner leitor = new Scanner(System.in);
   private  int resposta;
   
   public void setResposta(int resposta){
      this.resposta = resposta;
   }
   public int getResposta(){
      return resposta;
   }

   public void inicio(){
      System.out.println("Digite o numero que aparecer antes da opcao que voce quer acessar:\n\n1 Criar tarefa\n2 Concluir tarefa\n3 Exibir tarefas pendentes\n4 Exibir tarefas concluidas");
      resposta = leitor.nextInt();
      escolha();
   }
   
   public void escolha(){
      switch(resposta){
         case 1: 
            System.out.println("Criando Tarefa");
            break;
         case 2:
            System.out.println("Concluindo Tarefa");
            break;
         case 3:
            System.out.println("fh");
            break;
         case 4:
            System.out.println("aaa");
            break;
         default:
            System.out.println("Burro");
            break;
      }
   
   }
}