
package trabalho2;

public final class Motocicleta extends VeiculoMotorizado{
    private final int rodas=2;
    private final int velocidade=3;
    private final float gasto=(float) 0.5;
    
    public Motocicleta(int indice,String id,int rodas)
    {
        super(indice,id,rodas);
    }
    
    public int rodas() //retorna rodas
    {
        return this.rodas;
    }
    
    public int velocidade() //retorna velocidade
    {
        return this.velocidade;
    }
    
    public float gasto() //retorna o gasto do veiculo em litros
    {
        return this.gasto;
    }
    
    public void Abastecer() //abastece o veiculo atravez da superclasse
    {
        super.Abastecer();
    }
    
    public void AjustarTanque(float gasto) //ajusta tanque do veiculo atravez da superclasse
    {
        super.AjustarTanque(gasto);
    }
    
    public float getCombustivel() //retorna combustivel do veiculo atravez da superclasse
    {
        return super.getCombustivel();
    }

    public void mover() //move veiculo
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
