/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibancode.patterndesign.lab4;

import com.cibancode.patternsesign.lab4.supertype.TipoSonido;
import com.cibancode.patternsesign.lab4.supertype.TipoVuelo;

/**
 *
 * @author JHONNY
 */
public abstract class Ave {

    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;
    
    public void realizaVuelo(){
       tipoVuelo.vuelo();
    
    }
    
    public void realizaSonido (){
      tipoSonido.makeSound();  
}
   
}
