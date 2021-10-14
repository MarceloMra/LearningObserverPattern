/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Launch;

import Entity.Carro;
import Entity.Mecanico;

/**
 *
 * @author Marcelo
 */
public class Main {
    public static void main(String[] args) {
       Carro carro = new Carro();
       Mecanico a = new Mecanico("A");
       Mecanico b = new Mecanico("B");
       Mecanico c = new Mecanico("C");
       
       carro.registerObserver(a);
       carro.registerObserver(b);
       carro.registerObserver(c);
       
       carro.mudarMarcha(0);
       carro.mudarMarcha(8);
       carro.mudarMarcha(6);
    }
}
