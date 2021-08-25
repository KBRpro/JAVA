package restaurante;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Restaurante {

    public static void main(String[] args) 
    {
        ArrayList<Mesa> mesas;
        int index=0;
        mesas = new ArrayList<Mesa>();
        Double pedido;
        String option;
        option= JOptionPane.showInputDialog("(1)Realizar pedido"
                + "(2)Imprimir dados do pedido"
                + "(3)Imprimir faturamento total"
                + "(4)Imprimir lista de pedidos"
                + "(5)Excluir Pedido)");
        if(Integer.parseInt(option)==1)
        {
            String nome=JOptionPane.showInputDialog("Digite seu nome");
            Mesa m=new Mesa(index,nome);
            nome=JOptionPane.showInputDialog("Digite o nome do pedido");
            pedido=Double. parseDouble(JOptionPane.showInputDialog("Digite o valor do pedido"));
            m.RealizarPedido(nome,pedido);
            index++;
            mesas.add(m);
            
        }
        else if(Integer.parseInt(option)==2)
        {
             int mm=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua mesa"));
             Mesa num=mesas.get(mm);
             mm=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do seu pedido"));
             num.getPedido(mm);
        }
        else if(Integer.parseInt(option)==3)
        {
            int i;
            Double fatur=0.00;
            Mesa m;
             for(i=0;i<mesas.size();i++)
             {
                 m=mesas.get(i);
                 fatur=fatur+m.FaturamentoMesa();
             }
             JOptionPane.showMessageDialog(null,"Faturamento total:"+fatur+";");
        }
        else if(Integer.parseInt(option)==4)
        {
             
        }
        else if(Integer.parseInt(option)==5)
        {
             
        }
    }
    
}
