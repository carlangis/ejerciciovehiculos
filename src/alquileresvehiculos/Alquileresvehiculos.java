/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquileresvehiculos;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Alquileresvehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaracion del array para guardar los objetos
        vehiculos[] miflota = new vehiculos[4];
        miflota[0] = new coche("123", 23, 7);
        miflota[1] = new furgoneta(123, "244", 123);
        miflota[2] = new microbuss("124", 23, 7);
        miflota[3] = new camion(123, "243", 123);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una matricula: ");
        String matricula = entrada.nextLine();
        for (vehiculos miflota1 : miflota) {
            if (matricula.equalsIgnoreCase(miflota1.getMatricula())) {
                System.out.println("¿cuantos dias de alquiler has estado?");
                int diasdealquiler = Integer.parseInt(entrada.nextLine());
                miflota1.setDiasalquiler(diasdealquiler);
                System.out.println("el precio del alquiler ha sido:"+miflota1.calcularalquiler()+" €");
            }
        }

    }

}
