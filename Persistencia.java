// importando as classes necessárias
   
import java.io.FileWriter;
import java.io.IOException;  
   
public class Persistencia{

   private String nome;
   
   public String getNome(){
      return nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   //perguntar nome do usuario()
   public String perguntaNome(){
      Uteis.print("Qual seu nome de login?");
      nome = Uteis.lerString();
      return nome;
   }
   public static void criarArquivo(String caminhoArquivo, String conteudo){
      try {
         FileWriter writer = new FileWriter(caminhoArquivo);
         writer.write(conteudo);
         writer.close();
         System.out.println("Arquivo criado com sucesso!");
     } catch (IOException e) {
         System.out.println("Ocorreu um erro ao criar o arquivo.");
         e.printStackTrace();
     }

   }
}
   //Pesquisar arquivos txt()
   //se nao existir criar arquivo txt() ou pedir para ele digitar seu nome de novo
   //se existir abrir documento com seu nome()
   
