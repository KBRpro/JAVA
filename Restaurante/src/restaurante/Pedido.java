package restaurante;
import javax.swing.JOptionPane;

public class Pedido
{
    
    private String nome;
    private Double valor;
    
    public Pedido()
    {
        this.nome= null; 
        this.valor= 0.00;
    }

    public void RealizarPedido(String nome,Double valor)
    {
        this.nome=nome;
        if(valor<=0.00)
            JOptionPane.showMessageDialog(null,"não é possivel valor negativo no pedido");
        else
            this.valor=valor;
    }
    
    public void ImprimirDadosPedido()
    {
        System.out.println("Nome na comanda:"+nome+", valor:"+valor+"/n");
    }
    
    public Double getValor()
    {
        return this.valor;
    }
}
