package trabalho2;

public abstract class VeiculoMotorizado extends Veiculo {
    private double combustivel;
    
    public VeiculoMotorizado(int indice,String id,int rodas) //função default
    {
        super(indice,id,rodas);
        this.combustivel=0;
    }
    
    public abstract void Abastecer(); //abastece veiculo
    
     public double getCombustivel() //retorna combustivel em litros
    {
        return this.combustivel;
    }
    
    public void setCombustivel(double combustivel)
    {
        this.combustivel=combustivel;
    }   
}
