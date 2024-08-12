/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibancode.patterndesign.lab4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cibancode.patterndesign.lab4.supertypeimp.SinCanto;
import com.cibancode.patterndesign.lab4.supertypeimp.SinVuelo;

/**
 *
 * @author JHONNY
 */
public class Avestruz extends Ave{
    
    public static final Logger logger = LoggerFactory.getLogger(Avestruz.class);
    
    public Avestruz (){
        logger.debug("instanciando aveztruz");
        tipoSonido = new SinCanto();
        tipoVuelo = new SinVuelo();
    }
}
