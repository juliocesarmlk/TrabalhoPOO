public class No{
   private Tarefa tarefa;
   private No proximo;
   
   public Tarefa getTarefa(){
      return tarefa;
   }
   
   public No getProximo(){
      return proximo;
   }
   
   public void setTarefa(Tarefa tarefa){
      this.tarefa = tarefa;
   }
   
   public void setProximo(No proximo){
      this.proximo = proximo;
   }
}