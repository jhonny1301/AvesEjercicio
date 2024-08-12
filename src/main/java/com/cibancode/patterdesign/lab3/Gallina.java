/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibancode.patterdesign.lab3;
import com.cibancode.patterndesign.lab3.interfaces.Volar;
/**
 *
 * @author JHONNY
 */
public class Gallina extends Ave implements Volar {
    
    
    @Override
    public void makeSound(){
        System.out.println("Grasna");
    }
    
    @Override
    public void vuela(){
        System.out.println("vuela con alas");
    }
}
