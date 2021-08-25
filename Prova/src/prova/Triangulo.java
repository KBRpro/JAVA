package prova;

public class Triangulo {
    private int cateto1;
    private int cateto2;
    
    public Triangulo()
    {
        this.cateto1=0;
        this.cateto2=0;
    }
    
    public Triangulo(int cat1,int cat2)
    {
        this.cateto1=cat1;
        this.cateto2=cat2;
    }
    
    public void setCateto1(int cat1)
    {
        this.cateto1=cat1;
    }
    
    public int getCateto1()
    {
        return this.cateto1;
    }
    
    public void setCateto2(int cat2)
    {
        this.cateto2=cat2;
    }
    
    public int getCateto2()
    {
        return this.cateto2;
    }
    
    public double getAreaTriangulo()
    {
        return ((this.cateto1*this.cateto2)/2);
    }
    
    public double getHipotenusaTriangulo()
    {
        return Math.sqrt(this.cateto1*this.cateto1 + this.cateto2*this.cateto2);
    }
    
    public double getPerimetroTriangulo()
    {
        return Math.sqrt(this.cateto1*this.cateto1 + this.cateto2*this.cateto2) + this.cateto1+this.cateto2;
    }
    
    public String getTipoTriangulo()
    {
        if(this.cateto1==this.cateto2 && this.cateto2==Math.sqrt(this.cateto1*this.cateto1 + this.cateto2*this.cateto2))
            return "Equilatero";
        else if(this.cateto1 != this.cateto2 && this.cateto1!=getHipotenusaTriangulo() && this.cateto2!=getHipotenusaTriangulo())
            return "escaleno";
        else
            return "Isoceles";
    }       
}
