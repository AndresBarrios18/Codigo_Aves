/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ave;

/**
 *
 * @author pipe2
 */
public abstract class Ave {

    private TipoSonido tipoSonido;
    private TipoVuelo tipoVuelo;
    
    public void setTipoSonido(TipoSonido tipoSonido){
        this.tipoSonido = tipoSonido;
    }
    
    public void setTipoVuelo(TipoVuelo tipoVuelo){
        this.tipoVuelo = tipoVuelo;
    }
    
    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    
    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}
