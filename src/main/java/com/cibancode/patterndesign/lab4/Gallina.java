/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibancode.patterndesign.lab4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cibancode.patterndesign.lab4.supertypeimp.Grasnido;
import com.cibancode.patterndesign.lab4.supertypeimp.VueloConAlas;
/**
 *
 * @author JHONNY
 */
public class Gallina extends Ave{
    
    public static final Logger logger = LoggerFactory.getLogger(Gallina.class);
    
    public Gallina (){
        logger.debug("canario gallina");
        tipoSonido = new Grasnido();
        tipoVuelo = new VueloConAlas();
    }
    
}

