
package general;

public class JogoGeneral 
{
    private Dado[] dados = new Dado[5];
    private int[] jogadas = new int[13];
    private int a,b,c,d,e,f,pontos;
    
     public void rolarDados()
    {
        dados[0].roll();
        dados[1].roll();
        dados[2].roll();
        dados[3].roll();
        dados[4].roll();
    }
     
    public void jogoGeneral()
    {
      //rolarDados(); //rola os 5 dados
      int i;
      this.a=0; //consiste no valor 1 do dado
      this.b=0; //consiste no valor 2 do dado
      this.c=0; //consiste no valor 3 do dado
      this.d=0; //consiste no valor 4 do dado
      this.e=0; //consiste no valor 5 do dado
      this.f=0; //consiste no valor 6 do dado
      int dado;
      System.out.printf("Seus numeros de dado são: ");
      for(i=0;i<5;i++)
      {
          this.dados[i] = new Dado();
          dados[i].roll();
          dado=dados[i].getSideUp();
          System.out.printf("%d ",dado);
          if(this.dados[i].getSideUp()==1)
              this.a++; //coleta o numero de 1s dos 5 dados
          if(this.dados[i].getSideUp()==2)
              this.b++; //coleta o numero de 2s dos 5 dados
          if(this.dados[i].getSideUp()==3)
              this.c++; //coleta o numero de 3s dos 5 dados
          if(this.dados[i].getSideUp()==4)
              this.d++; //coleta o numero de 4s dos 5 dados
          if(this.dados[i].getSideUp()==5)
              this.e++; //coleta o numero de 5s dos 5 dados
          if(this.dados[i].getSideUp()==6)
              this.f++; //coleta o nunero de 6s dos 6 dados
      }
      System.out.printf("\n");
    }   
     
    public void validarJogada(int jogada)
    {
        jogoGeneral();
        pontos=0;
        if(jogada==1 && a>0) //jogada de 1
            pontos= 1*a;
        else if(jogada==2 && b>0) //jogada de 2
            pontos= 2*b;
        else if(jogada==3 && c>0) //jogada de 3
            pontos= 3*c;
        else if(jogada==4 && d>0) //jogada de 4
            pontos= 4*d;
        else if(jogada==5 && e>0) //jogada de 5
            pontos= 5*e;
        else if(jogada==6 && f>0) //jogada de 6
            pontos= 6*f;
        else if(jogada==7 && (a==3 || b==3 || c==3 || d==3 || e==3 || f==3)) //trinca
            pontos= a*1 + b*2 + c*3 + d*4 + e*5 + f*6;
        else if(jogada==8 && (a==4 || b==4 || c==4 || d==4 || e==4 || f==4)) //quadra
            pontos= a*1 + b*2 + c*3 + d*4 + e*5 + f*6;
        else if(jogada==9 && (a==5 || b==5 || c==5 || d==5 || e==5 || f==5)) //general
            pontos= 50;
        else if(jogada==10) //jogada aleatoria
            pontos= a*1 + b*2 + c*3 + d*4 + e*5 + f*6;
        else if(jogada==11 && b==1 && c==1 && d==1 && e==1 && f==1) //sequencia alta
            pontos= 30;
        else if(jogada==12 &&  a==1 && b==1 && c==1 && d==1 && e==1) //sequencia baixa
            pontos= 40;
        else if(jogada==13 && (a==2 || b==2 || c==2 || d==2 || e==2 || f==2) && (a==3|| b==3 || c==3 || d==3 || e==3 || f==3)) //full house
            pontos= 25;
        else
            pontos= 0;
    }
    
    public void pontuarJogada(int jogada)
    {
        validarJogada(jogada);
        if(pontos==0)
            System.out.println("Jogada invalida"); //se a pontuação for 0,a jogada foi invalida
        else
            System.out.println("Jogada valida"); //se a pontuação for >0,a jogada foi valida
    }
    
    public String ToString()
    {
        String pontuacao= new String();
        pontuacao=""+pontos;
        return pontuacao; //retorna a pontuação da jogada em forma de string;
    }
    
    public int pontuacao()
    {
        return this.pontos;
    }
}
