/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author gabri
 */
public class AlunoDisciplinaGraduacao extends AlunoDisciplina
{
    
    
    public AlunoDisciplinaGraduacao()
    {
        
    }
  
    public AlunoDisciplinaGraduacao (String nomeAluno,String nomeDisciplina,double nota1,double nota2)
    {
        super.setAluno(nomeAluno);
        super.setDisciplina(nomeDisciplina);
        super.setNota1(nota1);
        super.setNota2(nota2);
    }

    @Override
    public String getSituacao() {
        if(super.getMedia()>=7.0)
            return "Aprovado";
        else if(super.getMedia()<7.0 && super.getMedia()>4.0)
            return "Exame";
        else
            return "Reprovado";
    }   
}
