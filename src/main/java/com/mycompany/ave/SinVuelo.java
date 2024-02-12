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
public class SinVuelo implements TipoVuelo {
    
    
    public static final Logger logger = LoggerFactory.getLogger(SinVuelo.class);
    
    public void vuelo(){
        logger.debug("no puedo volar");
        System.out.println("no puedo volar");
    
    }
}
