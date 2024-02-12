/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author pipe2
 */
public class Canto implements TipoSonido{
    
    public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    
    public void makeSound(){
        logger.debug("estoy cantando");
        System.out.println("estoy cantando");
    
    }
}
