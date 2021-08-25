/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

public final class Bicicleta extends Veiculo {
    private final int rodas;
    private final int velocidade;
    private final int gasto;
    
    public Bicicleta(int indice,String id,int rodas) //função default da bike
    {
        super(indice,id,rodas);
        this.rodas=2;
        this.velocidade=1;
        this.gasto=0;
    }
    
    public int rodas() //retorna rodas
    {
        return this.rodas;
    }
    
    public int velocidade() //retorna velocidade
    {
        return this.velocidade;
    }
    
    public float gasto() //retorna gasto
    {
        return this.gasto;
    }
     
    public void mover() //move a bike
    {
        int verificacoes=0;
        if(super.retornaCalibragem()==1)
            verificacoes++;
        else
            System.out.println("O veiculo não esta com os pneus calibrados");
        if(verificacoes==1)
        {
            super.alterarDistancia(this.velocidade);
        }
    }   

}
