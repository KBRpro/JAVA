
package contajava;
import javax.swing.JOptionPane;
public class ContaJava {
    public static void main(String[] args) {
        Conta a= new Conta();
        long numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
        double saldo=Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta:"));
        a.EncapsulamentoConta(numero,saldo);
        String option;
        option= JOptionPane.showInputDialog("Informe a opcao desejada:"
                + "[1]Depositar"
                + "[2]Sacar"
                + "[3]Sair");
        if(Integer.parseInt(option)==1)
        {
            a.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto quer depositar:")));
            JOptionPane.showMessageDialog(null,"Saldo atual:" + a.getSaldo());
        }
        else if(Integer.parseInt(option)==2)
        {
            a.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto quer sacar:")));
            JOptionPane.showMessageDialog(null,"Saldo atual:" + a.getSaldo());
        }
        while (Integer.parseInt(option)!=3)
        {
            option= JOptionPane.showInputDialog("Informe a opcao desejada:"
                + "[1]Depositar"
                + "[2]Sacar"
                + "[3]Sair");
            if(Integer.parseInt(option)==1)
                a.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto quer depositar:")));
            else if(Integer.parseInt(option)==2)
                a.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto quer sacar:")));
        }
    }    
}
