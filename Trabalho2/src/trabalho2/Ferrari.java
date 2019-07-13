/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

public final class Ferrari extends VeiculoMotorizado{
    private final int rodas=4;
    private final int velocidade=10;
    private final float gasto=(float) 1.5;
    
    public Ferrari(int indice,String id,int rodas)
    {
        super(indice,id,rodas);
    }
    
    public int rodas()
    {
        return rodas;
    }
    
    public int velocidade()
    {
        return velocidade;
    }
    
    public float gasto()
    {
        return gasto;
    }
    
    public void Abastecer()
    {
        super.Abastecer();
    }
    
    public void AjustarTanque(float gasto)
    {
        super.AjustarTanque(gasto);
    }
    
    public float getCombustivel()
    {
        return super.getCombustivel();
    }

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
            super.AjustarTanque(this.gasto);
        }
    }   

}
