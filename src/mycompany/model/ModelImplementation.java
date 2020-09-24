/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.model;

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
    String greeting=null;
    greeting="hola";
    return greeting;
    }
      
            
}
