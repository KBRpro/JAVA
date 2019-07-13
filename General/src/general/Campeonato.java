
package general;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java . util . Scanner ;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Campeonato 
{
    private Jogador[] jogadores = new Jogador[5];
    private int cartela[][] = new int[13][5];
    private int jogando=0;
    
    public void incluirJogador()
    {
        if(jogando<5) // limite de jogadores
        {
            this.jogadores[jogando] = new Jogador(); //inclui jogador e seu nome
            jogadores[jogando].Jogador();
            this.jogando++;
            System.out.println("Jogador Incluido");
        }
        else
            System.out.println("Jogador não Incluido,pois o limite foi atingido");
    }
    
    public void removerJogador()
    {
        if(jogando>0){
        System.out.println("O ultimo jogador inserido foi removido");
        this.jogando--; //remove o ultimo jogador
        }
    }
    
    public void iniciarCampeonato()
    {
        
        int opcao;
        int jogada;
        int cont;
        int i;
        int j;
        String nome= new String(); //string de nome
        for(i=0;i<this.jogando;i++)
        {
            nome = jogadores[i].NOME(); //pega o nome do jogador
            System.out.println("vez de "+nome+":");
            System.out.println("");
            for(j=0;j<13;j++)
            {
                System.out.println("escolha a jogada que deseja marcar");
                System.out.println("1,2,3,4,5,6,7(T),8(Q),9(G),10(X),11(S+),12(S-),13(F)");
                jogadores[i].escolherJogada();
            }
            j=0;
        }
    }
    
    public void mostrarCartela() //forma a tabela da cartela
    {
       int i;
       String nome = new String();
       System.out.println("---------------------");
       for(i=0;i<jogando;i++)
       {
           nome = jogadores[i].NOME();
           System.out.println("Jogador:"+nome+"");
           System.out.println("---------------------");
           jogadores[i].mostraJogadasExecutadas(); //mostra as jogadas executadas do jogador
           System.out.println("---------------------");
       }
       System.out.println("---------------------");
    }
    
    public void gravarEmArquivo() throws IOException
    {
        try (FileWriter arq = new FileWriter("C:\\Users\\Public\\Pictures\\general.txt") //mostra o arquivo a ser gravado
        ) {
            PrintWriter gravarArq = new PrintWriter(arq); //cria uma nova printWriter
            int i;
            int tabel[]= new int[13]; //tabela a ser recebida
            String nome= new String(); //string de nome
            
            for(i=0;i<jogando;i++)
            {
                nome = jogadores[i].NOME();
                tabel =jogadores[i].TOSTRING();
                gravarArq.println("---------------------");
                gravarArq.println("Jogador:"+nome+"");
                gravarArq.println("---------------------");
                gravarArq.println("Pontuações:");
                gravarArq.println("---------------------");
                gravarArq.println("Jogadas de 1:"+tabel[0]+"");
                gravarArq.println("Jogadas de 2:"+tabel[1]+"");
                gravarArq.println("Jogadas de 3:"+tabel[2]+"");
                gravarArq.println("Jogadas de 4:"+tabel[3]+"");
                gravarArq.println("Jogadas de 5:"+tabel[4]+"");
                gravarArq.println("Jogadas de 6:"+tabel[5]+"");
                gravarArq.println("Trincas:"+tabel[6]+"");
                gravarArq.println("Quadras:"+tabel[7]+"");
                gravarArq.println("General:"+tabel[8]+"");
                gravarArq.println("Jogada Aleatoria:"+tabel[9]+"");
                gravarArq.println("Sequencia Alta:"+tabel[10]+"");
                gravarArq.println("Sequencia Baixa:"+tabel[11]+"");
                gravarArq.println("Full House:"+tabel[12]+"");
                gravarArq.println("---------------------");
                int j;
                int total=0;
                for(j=0;j<13;j++)
                    total=total+tabel[j];
                gravarArq.println("Total:"+total+"");
            }
            gravarArq.println("---------------------");
        } 
    }
    
    public void lerDoArquivo() throws IOException
    {
       int lerint;    
       Scanner in= new Scanner(new FileReader("C:\\Users\\Public\\Pictures\\general.txt"));
       String linha=in.nextLine();
       //lerint=Integer.valueOf(linha);
       do{
           lerint=Integer.valueOf(linha);
           switch(lerint)
           {
               case 1:
                   incluirJogador();
                   linha=in.nextLine();
                   break;
               case 2:  
                   removerJogador();
                   break;
               case 3:
                   iniciarCampeonato();
                   break;
               case 4:
                   mostrarCartela();
                   break;
               case 5:
                   gravarEmArquivo();
                   break;
               case 6:
                   //lerDoArquivo();
                   break;
               default:
                   System.out.println("Opcao invalida. Tente novamente");
           }
       }while(lerint!=7 && in.hasNextLine());
    }
    
    
    public static void main( String[] args) throws IOException
    {
       Campeonato camp = new Campeonato();
       Scanner teclado =new Scanner(System . in );
       int opcao;
       do
       {
           System.out.println("");
           System.out.println("(1) Incluir jogador");
           System.out.println("(2) Remover jogador");
           System.out.println("(3) Iniciar/reiniciar o campeonato");
           System.out.println("(4) Mostrar a cartela de resultados");
           System.out.println("(5) Gravar os dados do campeonato em arquivo");
           System.out.println("(6) Ler os dados do campeonato em arquivo (os comandos devem estar separados por linas)");
           System.out.println("(7) Sair da aplicacao");
           System.out.println("");
           System.out.printf("opção desejada:");
           opcao = teclado.nextInt();
           switch(opcao)
           {
               case 1:
                   camp.incluirJogador();
                   break;
               case 2:
                   camp.removerJogador();
                   break;
               case 3:
                   camp.iniciarCampeonato();
                   break;
               case 4:
                   camp.mostrarCartela();
                   break;
               case 5:
                   camp.gravarEmArquivo();
                   break;
               case 6:
                   camp.lerDoArquivo();
                   break;
               default:
                   System.out.println("Opcao invalida. Tente novamente");
           }
       }while(opcao!=7);
    }
    
}
