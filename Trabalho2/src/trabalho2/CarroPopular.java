
package trabalho2;

import java.util.Scanner;


public final class CarroPopular extends VeiculoMotorizado{
    private final int rodas;
    private final int velocidade;
    private final float gasto;

    public CarroPopular(int indice,String id,int rodas)
    {
        super(indice,id,rodas);
        this.rodas=4;
        this.velocidade=5;
        this.gasto=1;
    }
    
    public int rodas()
    {
        return this.rodas;
    }
    
    public int velocidade()
    {
        return this.velocidade;
    }
    
    public double gasto()
    {
        return this.gasto;
    }
    
    @Override
    public void Abastecer() //abastece veiculo
    {
        Scanner s= new Scanner(System.in);
        double comb;
        System.out.println("Informe quantos litros quer abastecer:");
        comb=s.nextDouble();
        super.setCombustivel(super.getCombustivel()+comb);
    }
    
    public void AjustarTanque(double gasto) //ajusta o combustivel apos mover
    {
        double comb=super.getCombustivel();
        super.setCombustivel(comb-gasto);
    }
    
    @Override
    public void mover()
    {
        int verificacoes=0;
        if(getCombustivel()>=this.gasto)
        {
            verificacoes++;
        }
        else
            System.out.println("O veiculo não tem combustivel suficiente");
        if(super.retornaCalibragem()==1)
            verificacoes++;
        else
            System.out.println("O veiculo não esta com os pneus calibrados");
        if(verificacoes==2)
        {
            super.alterarDistancia(this.velocidade);
            AjustarTanque(this.gasto);
        }
    }   

}
