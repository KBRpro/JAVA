
package prova2;

public class AlunoDisciplinaEspecializacao extends AlunoDisciplina 
{ 
    public AlunoDisciplinaEspecializacao()
    {
        
    }
  
    public AlunoDisciplinaEspecializacao (String nomeAluno,String nomeDisciplina,double nota1,double nota2)
    {
        super.setAluno(nomeAluno);
        super.setDisciplina(nomeDisciplina);
        super.setNota1(nota1);
        super.setNota2(nota2);
    }

    @Override
    public String getSituacao() {
        if(super.getMedia()>=6.0)
            return "Aprovado";
        else
            return "Reprovado";
    }   
}
