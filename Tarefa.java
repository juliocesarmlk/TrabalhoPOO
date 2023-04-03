import java.util.Date;
import java.util.UUID;
import java.io.Serializable;

public class Tarefa implements Serializable{
//Declaração dos atributos

   private String titulo;
   private String descricao;
   private Date dataInicio;
   private String status;
   private UUID idTarefa;

   public Tarefa(String titulo, String descricao){
      this.titulo = titulo;
      this.descricao = descricao;
      this.dataInicio = new Date();
      this.status = "Pendente";
      this.idTarefa = UUID.randomUUID();
   }

//Metodos set
   
   public void setStatus(String status){
      this.status = status;
   }
   public void setDataInicio(Date dataInicio){
      this.dataInicio = dataInicio;
   }
   public void setDescricao(String descricao){
      this.descricao = descricao;
   }
   public void setTitulo(String titulo){
      this.titulo = titulo;
   }
 
// Metodos get
   public String getStatus(){
      return status;
   } 
   public Date getDataInicio(){
      return dataInicio;
   }
   public String getDescricao(){
      return descricao;
   }
   public String getTitulo(){
      return titulo; 
   }
   

   }
