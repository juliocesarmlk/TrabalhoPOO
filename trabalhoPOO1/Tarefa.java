import java.util.Date;

public class Tarefa {
   private String titulo;
   private String descricao;
   private Date data_de_criacao;
   private Date data_de_conclusao;
   private String status;
   
   public Tarefa(String titulo, String descricao){
   this.titulo = titulo;
   this.descricao = descricao;
   this.data_de_criacao = new Date();
   this.data_de_conclusao = null;
   this.status = "Pendente";
   }
   
   public String getStatus(){
      return status; 
   }
   
   public void set_status(String status){
      this.status = status;
   }
   
   public String get_titulo(){
      return titulo;
   }
   public void set_titulo(String titulo){
      this.titulo = titulo;
   }
   
   public String get_descricao(){
      return descricao;
   }
   public void set_descricao(String descricao){
      this.descricao = descricao;
   }
   
   public Date get_data_de_criacao(){
      return data_de_criacao;
   }
   public void set_data_de_criacao(Date data_de_criacao){
      this.data_de_criacao = data_de_criacao;
   }
   
   public Date get_data_de_conclusao(){
      return data_de_conclusao;
   }
   public void set_data_de_conclusao(Date data_de_conclusao){
      this.data_de_conclusao = data_de_conclusao; 
   }
   

}