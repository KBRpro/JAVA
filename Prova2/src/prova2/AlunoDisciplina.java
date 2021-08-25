
package prova2;
public abstract class AlunoDisciplina implements Aluno
{
    private String nomeAluno;
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    
   public String getAluno()
   {
       return this.nomeAluno;
   }
   
   public String getDisciplina()
   {
       return this.nomeDisciplina;
   }
   
   public double getNota1()
   {
       return this.nota1;
   }
   
   public double getNota2()
   {
       return this.nota2;
   }
   
   public void setAluno(String aluno)
   {
       this.nomeAluno=aluno;
   }
   
   public void setDisciplina(String disciplina)
   {
       this.nomeDisciplina=disciplina;
   }
   
   public void setNota1(double nota1)
   {
       this.nota1=nota1;
   }
   
   public void setNota2(double nota2)
   {
       this.nota2=nota2;
   }
   
    @Override
   public double getMedia()
   {
       return ((this.nota1+this.nota2)/2);
   }
}
