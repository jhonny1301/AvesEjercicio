/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibancode.patterndesign.lab4.supertypeimp;
import org.slf4j.Logger;
import com.cibancode.patternsesign.lab4.supertype.TipoVuelo;
import org.slf4j.LoggerFactory;
/**
 *
 * @author JHONNY
 */
public class SinVuelo implements TipoVuelo {
    
    public static final Logger logger = LoggerFactory.getLogger(SinVuelo.class);
    
    @Override
    public void vuelo(){
        logger.debug("no puedo volar");
        System.out.println("no puedo volar");
    }
}
