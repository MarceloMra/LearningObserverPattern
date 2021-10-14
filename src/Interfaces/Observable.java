/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Marcelo
 */
public interface Observable {
    public void registerObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObservers();
}
