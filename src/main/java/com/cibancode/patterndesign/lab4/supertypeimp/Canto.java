/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibancode.patterndesign.lab4.supertypeimp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cibancode.patternsesign.lab4.supertype.TipoSonido;
/**
 *
 * @author JHONNY
 */


public class Canto implements TipoSonido {
    
    //public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    
    @Override
    public void makeSound(){
        logger.debug("Estoy cantando");
        System.out.println("Estoy cantando");
        
    }
}
