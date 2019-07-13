package trabalho2;
import java . util . Scanner ;

public abstract class VeiculoMotorizado extends Veiculo {
    private float combustivel;
    
    public VeiculoMotorizado(int indice,String id,int rodas) //função default
    {
        super(indice,id,rodas);
        this.combustivel=0;
    }
    
    public void Abastecer() //abastece veiculo
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Informe quantos litros quer abastecer:");
        this.combustivel=s.nextFloat();
        //System.out.println("Veiculo abastecido com "+this.combustivel+" litros");
    }
    
    public void AjustarTanque(float gasto) //ajusta o combustivel apos mover
    {
        this.combustivel=this.combustivel-gasto;
    }
    
    public float getCombustivel() //retorna combustivel em litros
    {
        return this.combustivel;
    }
}
