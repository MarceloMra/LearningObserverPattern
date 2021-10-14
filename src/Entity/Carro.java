/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Interfaces.*;
import java.util.ArrayList;


/**
 *
 * @author Marcelo
 */
public class Carro implements Observable{
    private ArrayList<Observer> observers;
    private CaixaDeMarcha caixa = new CaixaDeMarcha();
    private Notify notif = new Notify();

    public Carro(){
        observers = new ArrayList<>();
    }
    
    public void mudarMarcha(int m){
        notif.setResult(caixa.engatarMarcha(m));
        notif.setMarchaTentada(m);
        notif.setMarchaAtual(caixa.getMarcha());
        notifyObservers();
    }
    
    
    @Override
    public void registerObserver(Observer ob) {
        Mecanico m = (Mecanico) ob;
        observers.add(ob);
        System.out.println("Observer ["+m.getIden()+"] registrado!");
    }

    @Override
    public void removeObserver(Observer ob) {
        Mecanico m = (Mecanico) ob;
        observers.remove(ob);
        System.out.println("Observer ["+m.getIden()+"] removido!");
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(notif);
        }
    }
}
