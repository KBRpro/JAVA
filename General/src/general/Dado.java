
package general;
import java.util.Random;

public class Dado {
    private int sideup;
    
    public void dado()
    {
      sideup=0; //seta o valor para 0 até que o dado seja jogado
    }
    
    public void roll()
    {
	double numero = (Math.random()*1000); //criando numero randomico
	if(numero > 0 && numero <= 1000/6*1){ //retorna um numero até 6
		this.sideup=1;
	}else if(numero > 1000/6*1 && numero <= 1000/6*2){
		this.sideup=2;
	}else if(numero > 1000/6*2 && numero <= 1000/6*3){
		this.sideup=3;
	}else if(numero > 1000/6*3 && numero <= 1000/6*4){
		this.sideup=4;
	}else if(numero > 1000/6*4 && numero <= 1000/6*5){
		this.sideup=5;
	}else if(numero > 1000/6*5 && numero < 1000){
		this.sideup=6;
	}else{
		this.sideup=0;
	}
    }
        
    public int getSideUp()
    {   
        return this.sideup; //retorna o valor coletado no dado em int
    }
    
    @Override
    public String toString()
    {
        String retorno= new String();
        retorno= ""+sideup; //cria uma string com o valor do dado
        return retorno; //retorna o valor do dado em string
    }  
}
