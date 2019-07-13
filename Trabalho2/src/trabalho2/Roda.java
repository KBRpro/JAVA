/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

public class Roda {
    private int calibragemPneu;
    
    public void Roda() //função default
    {
        this.calibragemPneu=0;
    }
    
    public void setCalibragem(int calibragem) //seta a calibragem do pneu pra 1 ou 0
    {
        this.calibragemPneu=calibragem;    
    }
    
    public int getCalibragem() //retorna a calibragem do pneu
    {
        return this.calibragemPneu;
    }
}
