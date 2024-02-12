/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    
     public static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
      
        Main s1 = new Main();
    
        s1.canarioTestCase();       
    }
    
    public void canarioTestCase(){
    
        Canario canario = new Canario();
        assert canario != null : "El objeto Canario no debe ser nulo";
    
        logger.debug("canario realizaVuelo");
        System.out.println("canario realizaVuelo");
        canario.realizaVuelo();
        logger.debug("canario realizaSonido");
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
        System.out.println("canario cambiando sonido ave");
        canario.setTipoSonido(new Grasnido());
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
    }  
}
