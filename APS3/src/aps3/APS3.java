
package aps3;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class APS3 
{
    class complexo
    {
        int real;
        int imaginario;
    }
    complexo inicializaNumero()
    {
        Scanner ler=new Scanner(System.in);
        complexo A=new complexo();
        System.out.println("Digite o numero real");
        A.real=ler.nextInt();
        System.out.println("Digite o numero imaginario");
        A.imaginario=ler.nextInt();
        return A;
    }
    void imprimeNumero(complexo A)
    {
        System.out.println("O numero complexo é "+A.real+" + "+A.imaginario+"i");
    }
    boolean eIgual(complexo A,complexo B)
    {
        return (A.real==B.real) && (A.imaginario == B.imaginario);
    }
    complexo soma(complexo A,complexo B)
    {
        complexo C= new complexo();
        C.real = A.real + B.real;
        C.imaginario = A.imaginario + B.imaginario;
        return C;
    }
    complexo subtrai(complexo A,complexo B)
    {
        complexo C= new complexo();
        C.real = A.real - B.real;
        C.imaginario = A.imaginario - B.imaginario;
        return C;
    }
    complexo multiplica(complexo A,complexo B)
    {
        complexo C= new complexo();
        C.real = A.real * B.real - A.imaginario * B.imaginario;
        C.imaginario = A.real * B.imaginario + A.imaginario * B.real;
        return C;
    }
    complexo divide(complexo A,complexo B)
    {
        complexo C= new complexo();
        C.imaginario = (A.real * B.real - A.imaginario * B.imaginario)/(B.real*B.real +B.imaginario*B.imaginario);
        C.real = (A.real * B.imaginario + A.imaginario * B.real)/(B.real*B.real +B.imaginario*B.imaginario);
        return C;
    }    

    public static void main(String[] args) 
    {

        complexo A = new complexo();
        A = inicializaNumero();
        complexo B = new complexo();
        B = inicializaNumero();
        imprimeNumero(A);
        complexo C = soma(A,B);
        imprimeNumero(C);
        C = subtrai(A,B);
        imprimeNumero(C);
        C = multiplica(A,B);
        imprimeNumero(C);
        C = divide(A,B);
        imprimeNumero(C);
    }
}    

