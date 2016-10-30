/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquileresvehiculos;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Alquileresvehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        vehiculos coche1 = new coche("123", 23, 7);
        vehiculos furgoneta1 = new furgoneta(123, "243", 123);
        vehiculos microbus1 = new microbuss("123", 23, 7);
        vehiculos camion1 = new camion(123, "243", 123);
        //declaracion del array para guardar los objetos:
        Object miflota[] = {coche1, camion1, furgoneta1, microbus1};
        
       

    }

}
