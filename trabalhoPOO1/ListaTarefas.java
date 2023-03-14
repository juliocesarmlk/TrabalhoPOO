
public class ListaTarefas {
   private No cabecalho;
   private No fim;
   private int tamanho;
   
   public void printTamanho(){
      System.out.println("Tamanho: "+ tamanho);
   }
   
   public void ListaTarefas(){
      this.cabecalho = new No();
      this.fim = new No();
      cabecalho.setProximo(fim);
      this.tamanho = 0;
   }
   
   public void addFirst(Tarefa tarefa){
      No novo = new No();
      novo.setTarefa(tarefa);
      novo.setProximo(cabecalho.getProximo());
      cabecalho.setProximo(novo);
      tamanho =+ 1;
   }
}