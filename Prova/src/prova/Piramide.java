
package prova;

public class Piramide extends Triangulo{
    private int altura;
    private int cat1;
    private int cat2;
    
    public Piramide()
    {
        this.cat1=0;
        this.cat2=0;
        this.altura=0;
    }
    
    public Piramide(int cat1,int cat2)
    {
        super(cat1,cat2);
    }
    
    public Piramide(int cat1,int cat2,int altura)
    {
        this.altura=altura;
    }
    
    public int getAltura()
    {
        return this.altura;
    }
    
    public void setAltura(int altura)
    {
        this.altura=altura;
    }
    
    public double getVolumePiramide()
    {
        return (super.getAreaTriangulo()*this.altura)/3;
    }
}
