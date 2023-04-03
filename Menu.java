import java.io.*;

public class Menu{

   Gerenciador mantemTarefas = new Gerenciador();

   private  int resposta;
   
   public void setResposta(int resposta){
      this.resposta = resposta;
   }
   public int getResposta(){
      return resposta;
   }

   public void inicio(){
      while(true) {
        Uteis.print("Digite o numero que aparecer antes da opcao que voce quer acessar:\n\n1 Criar tarefa\n2 Concluir tarefa\n3 Exibir tarefas pendentes\n4 Exibir tarefas concluidas");
        resposta = Uteis.lerInt();
        escolha();
      }
   }
   
   public void escolha(){
      switch(resposta){
         case 1: 
            //chamar metodo para limpar tela 
            mantemTarefas.addTarefa();
            break;
         case 2:
            mantemTarefas.concluirTarefa();
            break;
         case 3:
            mantemTarefas.exibirTarefas();
            break;
         case 4:
            mantemTarefas.exibirConcluidas();
            break;
            // cirar opção de saída do código
         default:
            Uteis.print("Burro");
            // consertar isso
            break;
      }
   
   }
}
