
package prova2;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class CadastroAlunoUniversidade {

    public static void main(String[] args)
    {
       ArrayList alunos = new ArrayList();
       int i;
       for(i=0;i<5;i++)
       {
           String nomeAluno;
           String nomeDisciplina;
           double nota1;
           double nota2;
           nomeAluno =JOptionPane.showInputDialog( "Digite o nome do aluno" );
           nomeDisciplina=JOptionPane.showInputDialog( "Digite o nome da disciplina" );
           nota1 = Double.parseDouble( JOptionPane.showInputDialog( "Digite a nota 1" ));
           nota2 = Double.parseDouble( JOptionPane.showInputDialog( "Digite a nota 2" ));
           String tipo = JOptionPane.showInputDialog( "Tipo de Conta (E/G)" );// G GRADUACAO, E ESPECIALIZACAO
           
           AlunoDisciplina a = null;
           if ( tipo.equalsIgnoreCase( "G" ) ) {
                a = new AlunoDisciplinaGraduacao();
                a.setAluno(nomeAluno);
                a.setDisciplina(nomeDisciplina);
                a.setNota1(nota1);
                a.setNota2(nota2);
            } else if ( tipo.equalsIgnoreCase( "E" ) ) {
                a = new AlunoDisciplinaGraduacao();
                a.setAluno(nomeAluno);
                a.setDisciplina(nomeDisciplina);
                a.setNota1(nota1);
                a.setNota2(nota2);
            }
            alunos.add(a);
       }
       for (i = 0; i < alunos.size(); i++) 
       {
            AlunoDisciplina cl = (AlunoDisciplina) alunos.get( i );
            if ( cl instanceof AlunoDisciplinaEspecializacao ) {
                AlunoDisciplinaEspecializacao a = (AlunoDisciplinaEspecializacao) cl;
                JOptionPane.showMessageDialog(null,"Nome aluno:" + a.getAluno()+ "Situação:"+a.getSituacao());
            } else if ( cl instanceof AlunoDisciplinaGraduacao ) {
                AlunoDisciplinaGraduacao a = (AlunoDisciplinaGraduacao) cl;
                JOptionPane.showMessageDialog(null,"Nome aluno:" + a.getAluno()+ "Situação:"+a.getSituacao());
            }
       }
    }   
}

