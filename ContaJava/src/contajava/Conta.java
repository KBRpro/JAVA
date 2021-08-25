package contajava;


public class Conta {
    private long numero;
    private double saldo;
    
    public void EncapsulamentoConta(long numero,double saldo)
    {
       this.numero=numero;
       this.saldo=saldo;
    }
    
    public long getNumero()
    {
        return this.numero;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void setNumero(long numero)
    {
        this.numero=numero;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo=saldo;
    }
    
    public double depositar(double valor)
    {
        this.saldo=this.saldo+valor;
        return this.saldo;
    }
    
    public boolean sacar(double valor)
    {
        if(valor>this.saldo)
        {
            
            System.out.println("valor maior que saldo,saque nao realizado");
            return false;
        }
        else
        {
            this.saldo=this.saldo-valor;
            return true;
        }   
    }
    
    
}
