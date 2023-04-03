import java.util.Scanner;

public class Uteis{

   private static Scanner leitor = new Scanner(System.in);
   
   // metodos para ler strings e ints
   public static String lerString() {
      return leitor.nextLine();
   } 
   
   public static int lerInt() {
      return leitor.nextInt();
   } 
   
   public static void print(String mensagem){
      System.out.println(mensagem);
   }

   // criar metodo para limpar tela
}