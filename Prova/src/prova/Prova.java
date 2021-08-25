
package prova;

import javax.swing.JOptionPane;

public class Prova {

    public static void main(String[] args) 
    {
        String option;
        int i;
        int valor1,valor2,valor3;
        int maior;
        maior=0;
        double volume;
        double maiorv=0;
        Piramide a= new Piramide();
        for (i=0;i<3;i++)
        {
            option= JOptionPane.showInputDialog("Digite o primeiro cateto da piramide "+(i+1)+" :");
            valor1=Integer.parseInt(option);
            a.setCateto1(valor1);
            option= JOptionPane.showInputDialog("Digite o segundo cateto da piramide "+(i+1)+" :");
            valor2=Integer.parseInt(option);
            a.setCateto2(valor2);
            option= JOptionPane.showInputDialog("Digite a altura da piramide "+(i+1)+" :");
            valor3=Integer.parseInt(option);
            a.setAltura(valor3);
            volume=a.getVolumePiramide();
            if(volume>maiorv)
            {
                maior=i+1;
                maiorv=volume;
            }
        }
        JOptionPane.showMessageDialog(null,"a maior piramide é a "+maior+"a, com volume:"+maiorv);
    }
}
