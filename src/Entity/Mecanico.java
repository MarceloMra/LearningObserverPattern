/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Interfaces.*;
/**
 *
 * @author Marcelo
 */
public class Mecanico implements Observer{
    private String iden;
    
    public Mecanico(String iden){
        this.iden = iden;
    }
    
    @Override
    public void update(Object o) {
        Notify notif = (Notify) o;
        if(notif.isResult() == true){
            System.out.print(iden+": A marcha ");
            switch (notif.getMarchaAtual()) {
                case 0:
                    System.out.print("Neutra");
                    break;
                case 6:
                    System.out.print("Ré");
                    break;
                default:
                    System.out.print(notif.getMarchaAtual());
                    break;
            }
            System.out.println(" foi engatada!");
        }else{
            System.out.println(iden+": Não conseguimos engatar a marcha "+notif.getMarchaTentada()+"!");
        }
    }
    
    public String getIden(){
        return this.iden;
    }
}
