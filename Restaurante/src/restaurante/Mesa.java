package restaurante;
import java.util.ArrayList;

public class Mesa
{
    private int numero;
    private String nomePessoa;
    private ArrayList<Pedido> dados;

    public Mesa()
    {
        this.numero=-1;
        this.nomePessoa=null;
        this.dados= new ArrayList<Pedido>();
    }
    
    public Mesa(int numero,String nome)
    {
        this.numero=numero;
        this.nomePessoa=nome;
    }
    
     public void RealizarPedido(String nome,Double valor)
     {
         Pedido ped = new Pedido();
         ped.RealizarPedido(nome,valor);
         this.dados.add(this.dados.size(),ped);
     }
     
     public Double FaturamentoMesa()
     {
         Double fatura=0.00;
         int i;
         for(i=0;i<this.dados.size();i++)
         {
             Pedido ped=this.dados.get(i);
             fatura=fatura+ped.getValor();                     
         }
         return fatura;
     }
     
     public String getNome()
     {
         return this.nomePessoa;
     }
     
     public int getMesa()
     {
         return this.numero;
     }
     
    public void excluirPedido(int i)
    {
        this.dados.remove(i);
    }
    
    public void getPedido(int i)
    {
        Pedido ped=dados.get(i);
        ped.ImprimirDadosPedido();
        dados.add(i,ped);
    }
}
