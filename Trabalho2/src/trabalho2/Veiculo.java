
package trabalho2;

import java.util.Scanner;

public abstract class Veiculo {
    private String id = new String();
    private int distanciaPercorrida;
    private int quantidadeRodas;
    private Roda[] rodas;
    private char letra='A';
    
    public Veiculo(int indice,String id,int rodas) //função default do veiculo para inicializar variaveis
    {
        this.id=id;
        this.distanciaPercorrida=0;
        this.quantidadeRodas=rodas;
        this.rodas = new Roda[rodas];
        int i=0;
        while(i<rodas)
        {
            this.rodas[i]= new Roda();
            i++;
        }
    }
    
    public void Retirar() //retira um veiculo inicializado anteriormente
    {
        this.quantidadeRodas=0;
        this.id="NULL";
    }
    
    public int retornaRodas() //retorna quantidade de rodas
    {
        return this.quantidadeRodas;
    }
    
    public String retornaID() //retorna id do veiculo
    {
        return this.id;
    }

    public int retornaDistancia() //retorna distancia
    {
        return this.distanciaPercorrida;
    }

    public void alterarDistancia(int velocidade) //altera distancia percorrida apos mover
    {
        this.distanciaPercorrida=this.distanciaPercorrida+velocidade;
    }

    public int retornaCalibragem() //retorna se os pneus estão calibrados
    {
        int i=0;
        int cal=1;
        while(i<this.quantidadeRodas)
        {
            if(rodas[i].getCalibragem()==0)
                cal=0;
            i++;
        }
        return cal;
    }
    
    public void CalibrarPneus() //calibra os pneus
    {
        int i=0;
        while(i<this.quantidadeRodas)
        {
            rodas[i].setCalibragem(1);
            i++;
        }
    }
    
    public void DescalibrarPneu() //descalibra os pneus
    {
        int i=0;
        while(i<this.quantidadeRodas)
        {
            rodas[i].setCalibragem(0);
            i++;
        }
    }
    
    public abstract void mover(); //função abstrata inicializada nas subclasses(ferrari,motocicleta,etc)
    
}
