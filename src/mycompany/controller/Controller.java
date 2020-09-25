/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 *
 * @author rubir
 */
public class Controller {
   // public String getGreeting() throws FileNotFoundException, IOException{
        /*File fich = new File("fich.obj");
        FileInputStream fis =  new FileInputStream(fich);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ois.
        
        
        return "y";*/
        public static String muestraContenido() throws FileNotFoundException, IOException {
        String cadena;
        String archivo = "C:\\Users\\rubir\\Desktop\\HOLA.txt";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        b.close();
            return cadena;
    }

   }

