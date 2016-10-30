/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquileresvehiculos;

/**
 *
 * @author carlos
 */
public abstract class vehiculos {
   
 
protected String matricula;
protected int diasalquiler;

    public vehiculos(String matricula, int diasalquiler) {
        this.matricula = matricula;
        this.diasalquiler = diasalquiler;
    }

    public int getDiasalquiler() {
        return diasalquiler;
    }

    public void setDiasalquiler(int diasalquiler) {
        this.diasalquiler = diasalquiler;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

public abstract double calcularalquiler();
    


    
}
