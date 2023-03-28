import java.util.Date;
import java.util.Scanner;

public class Tarefa{

   public Tarefa(String titulo, String descricao){
      this.titulo = titulo;
      this.descricao = descricao;
      this.dataInicio = new Date();
      this.status = false;
   }

//Declaração dos atributos

   Scanner leitor = new Scanner(System.in);

   private String titulo;
   private String descricao;
   private Date dataInicio;
   private boolean status;

//Metodos set
   
   public void setStatus(boolean status){
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

   public boolean getStatus(){
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

