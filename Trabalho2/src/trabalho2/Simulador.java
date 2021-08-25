/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;
import java . util . Scanner ;

public class Simulador {
    private Veiculo[] veiculos;
    private int i;
    
    public Simulador()
    {
        this.veiculos= new Veiculo[20];
        this.i=0;
    }
 
    
    public void IncluirVeiculo(char letra) //função do menu(a)
    {
        int rodas;
        String id;
        if(letra=='B' || letra=='F' || letra=='C' || letra=='M')
        {
            if(letra=='B'){
                id="B";
                id+=this.i;
                System.out.println(id);
                veiculos[this.i]=new Bicicleta(this.i,id,2);
            }
            else if(letra=='C')
            {
                id="C";
                id+=this.i;
                veiculos[this.i]=new CarroPopular(this.i,id,4);
            }
            else if(letra=='M')
            {
                id="M";
                id+=this.i;
                veiculos[this.i]=new Motocicleta(this.i,id,2);
            }
            else if(letra=='F')
            {
                id="F";
                id+=this.i;
                veiculos[this.i]=new Ferrari(this.i,id,4);
            }
            else
                System.out.println("Veiculo com id errada");
        }
        else;
        System.out.println("O id do seu veiculo é "+letra+""+this.i+"");
        this.i++;
    }
    
    public void RemoverVeiculo(String id) //função do menu(b)
    {
        String id1=id.substring(1, 2);
        int indice=Integer.parseInt(id1);
        veiculos[indice].Retirar();
    }
    
    public void AbastecerVeiculo(String id) //função do menu(c)
    {
        char letra;
        String numero = id.substring(1, 2);
        letra=id.charAt(0);
        int num = Integer.parseInt(numero);
        VeiculoMotorizado vm = (VeiculoMotorizado)veiculos[num];
        if(letra=='B')
            System.out.println("Impossivel colocar combustivel na sua bike parceiro");
        else if(letra=='F' || letra=='C' || letra=='M')
            vm.Abastecer();
        else
            System.out.println("Esse veiculo é inexistente");
    }
    
    public void MovimentarVeiculo(String id) // função do menu(d)
    {
        String numero = id.substring(1, 2);
        char tipo=id.charAt(0);
        int num = Integer.parseInt(numero);
        if(num<this.i && (tipo=='B'|| tipo=='b' || tipo=='C' || tipo=='c' || tipo=='M' || tipo=='m' || tipo=='F' || tipo=='f'))
            veiculos[num].mover();
        else
          System.out.println("Veiculo com id errada");
    }
    
    public void MovimentarVeiculosTipo(char tipo) // função do menu (e)
    {
        int cont=0;
        if(tipo=='B'|| tipo=='b' || tipo=='C' || tipo=='c' || tipo=='M' || tipo=='m' || tipo=='F' || tipo=='f')
        {
            while(cont<this.i)
            {
                if(veiculos[cont].retornaID().charAt(0)==tipo)
                    veiculos[cont].mover();
                cont++;
            }
        }
        else
            System.out.println("tipo de veiculo não existente");
    }
    
    public void ImprimirDadosTipo(char tipo) //função do menu(f)
    {
        int cont=0;
        VeiculoMotorizado vm;
        while (cont<this.i)
        {
            if(veiculos[cont].retornaID().charAt(0)==tipo)
            {
                System.out.println("-id do veiculo:"+veiculos[cont].retornaID()+"");
                System.out.println("-distancia percorrida:"+veiculos[cont].retornaDistancia()+"");
                System.out.println("-numero de rodas:"+veiculos[cont].retornaRodas()+"");
                if(veiculos[cont].retornaCalibragem()==1)
                    System.out.println("Todas as rodas estão calibradas");
                else
                    System.out.println("As rodas estão descalibradas");
                if(tipo!='B'){
                    vm = (VeiculoMotorizado)veiculos[cont];
                    System.out.println("-Tanque de combustivel:"+vm.getCombustivel()+"");
                }
            }
            cont++;
        }
    }
    
    public void ImprimirPista() //função do menu (g)
    {
        int cont=0;
        while (cont<this.i)
        {
            if(veiculos[cont].retornaRodas()!=0)
            {
                int j=0;
                while(j<veiculos[cont].retornaDistancia())
                {
                    System.out.printf("-");
                    j++;
                }
                System.out.printf("%s",veiculos[cont].retornaID());
                System.out.printf("\n");
            }
            cont++;
        }
    }
    
    public void EsvaziarPneus(String id) //função do menu (h)
    {
        int num;
        String id1=id.substring(1,2);
        num=Integer.parseInt(id1);
        veiculos[num].DescalibrarPneu();
    }
    
    public void CalibrarPneus(String id) //função do menu (i)
    {
        int num;
        String id1=id.substring(1,2);
        num=Integer.parseInt(id1);
        veiculos[num].CalibrarPneus();
    }
    
     public static void main(String[] args) 
    {
        Simulador S= new Simulador();
        Scanner sc = new Scanner(System.in);
        char escolha;
        String a;
        escolha='z';
        while(escolha!='j' || escolha!='J')
        {
            System.out.println("(a) Incluir veıculo(**digite o tipo do veiculo em letra maiusculo**)");
            System.out.println("(b) Remover um veıculo (deve-se informar o identificador do veıculo)");
            System.out.println("(c) Abastecer veıculo (deve-se informar o identificador do veıculo e a quantidade de com-bustıvel em litros)");
            System.out.println("(d) Movimentar veıculo (deve-se informar o identificador do veıculo)");
            System.out.println("(e) Movimentar veıculos por tipo (deve-se informar o tipo de veıculo)");
            System.out.println("(f) Imprimir dados de veıculos por tipo (deve-se informar o tipo de veıculo");
            System.out.println("(g) Imprimir pista de corrida (imprime na ordem em que estao no array os veıculos)");
            System.out.println("(h) Esvaziar pneus de um veıculo");
            System.out.println("(i) Calibrar pneus de um veıculo");
            System.out.println("(j) Sair da aplicacao");
            System.out.println("Digite a opção desejada");
            escolha= sc.next().charAt(0);
            if(escolha=='a' || escolha=='A'){
                System.out.println("Digite o tipo de veiculo que deseja incluir");
                a=sc.next();
                S.IncluirVeiculo(a.charAt(0));
            }
            else if(escolha=='b' || escolha=='B'){
                System.out.println("Digite a id do veiculo que deseja remover");
                a=sc.next();
                S.RemoverVeiculo(a);
            }
            else if(escolha=='c' || escolha=='C'){
                System.out.println("Digite a id do veiculo que deseja abastecer");
                a=sc.next();
                S.AbastecerVeiculo(a);
            }
            else if(escolha=='d' || escolha=='D'){
                System.out.println("Digite a id do veiculo que deseja movimentar");
                a=sc.next();
                S.MovimentarVeiculo(a);
            }
            else if(escolha=='e' || escolha=='E'){
                System.out.println("Digite o tipo de veiculo que deseja mover");
                a=sc.next();
                S.MovimentarVeiculosTipo(a.charAt(0));
            }
            else if(escolha=='f' || escolha=='F'){
                System.out.println("Qual o tipo de veiculos que deseja saber os dados?");
                a=sc.next();
                S.ImprimirDadosTipo(a.charAt(0));
            }
            else if(escolha=='g' || escolha=='G'){
                S.ImprimirPista();
            }
            else if(escolha=='h' || escolha=='H'){
                System.out.println("Digite a id do veiculo que deseja esvaziar os pneus");
                a=sc.next();
                S.EsvaziarPneus(a);
            }
            else if(escolha=='i' || escolha=='I'){
                System.out.println("Digite a id do veiculo que deseja calibrar os pneus");
                a=sc.next();
                S.CalibrarPneus(a);
            }
            else if(escolha=='j' || escolha=='J')
                break;
        }
    }
}
