/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.model;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mycompany.controller.Controller;
/**
 * Model implementation where return the greeting.
 * @author Ruben Rabadan Hierro
 */
public class ModelImplementation implements Model{
/**
 * Return the greeting
 * @return a String that contains the greeting.
 */
    @Override
    
    public String getGreeting() {        
    //String greeting="hola";
    String greeting=null;
        try {
            greeting = Controller.muestraContenido();
        } catch (IOException ex) {
            Logger.getLogger(ModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    return greeting;
    }
      
            
}
