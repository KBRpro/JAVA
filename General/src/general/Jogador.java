
package general;
a

public class Jogador 
{
    private String nome = new String(); //string nome
    private JogoGeneral jogoG = new JogoGeneral(); //chama a classe jogo
    int play;
    int tabela[]= new int[13];
    
    public void Jogador()
    {
        System.out.println("Digite o nome do jogador:");
        Scanner s = new Scanner(System.in); 
        nome = s.nextLine(); //le o nome do jogador
    }
    
    public void jogarDados()
    {
        jogoG.rolarDados(); //rola os dados
    }
    
    public void escolherJogada()
    {
        System.out.println("Escolha sua jogada:"); //escolhe jogada
        Scanner s= new Scanner(System.in);
        play= s.nextInt();
        this.jogoG.pontuarJogada(play); //testa a jogada
        if(jogoG.pontuacao()==0);
        else
            tabela[play-1]=jogoG.pontuacao()+tabela[play-1];
    }
    
    public void mostraJogadasExecutadas() //printa a tabela de jogadas já executadas
    {
        System.out.println("Pontuações:");
        System.out.println("Jogadas de 1:"+tabela[0]+"");
        System.out.println("Jogadas de 2:"+tabela[1]+"");
        System.out.println("Jogadas de 3:"+tabela[2]+"");
        System.out.println("Jogadas de 4:"+tabela[3]+"");
        System.out.println("Jogadas de 5:"+tabela[4]+"");
        System.out.println("Jogadas de 6:"+tabela[5]+"");
        System.out.println("Trincas:"+tabela[6]+"");
        System.out.println("Quadras:"+tabela[7]+"");
        System.out.println("General:"+tabela[8]+"");
        System.out.println("Jogada Aleatoria:"+tabela[9]+"");
        System.out.println("Sequencia Alta:"+tabela[10]+"");
        System.out.println("Sequencia Baixa:"+tabela[11]+"");
        System.out.println("Full House:"+tabela[12]+"");
        int i;
        int total=0;
        for(i=0;i<13;i++)
            total=total+tabela[i];
        System.out.println("Total:"+total+"");
    }
    
    public int[] TOSTRING()
    {
        return this.tabela; //retorna a tabela de resultados
    }
    
    public String NOME()
    {
        return this.nome; //retorna o nome do jogador
    }

    
}
