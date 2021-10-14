/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Marcelo
 */
public class CaixaDeMarcha {
    private int marcha = 0;
    //0- Neutro 6- Ré
    
    public boolean engatarMarcha(int m){
        if(m >= 0 && m <= 6){
            marcha = m;
            return true;
        }
        return false;
    }
    
    public int getMarcha(){
        return marcha;
    }
}
