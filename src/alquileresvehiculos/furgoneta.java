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
public class furgoneta extends vehiculos {

    private final  double pma;

    public furgoneta(double pma, String matricula, int diasalquiler) {
        super(matricula, diasalquiler);
        this.pma = pma;
    }

    @Override
    public int getDiasalquiler() {
        return super.getDiasalquiler(); 
    }

    @Override
    public String getMatricula() {
        return super.getMatricula(); 
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula); 
    }

    public double getPma() {
        return pma;
    }

    @Override
    public double calcularalquiler() {
        double alquilerfurgo;
        return alquilerfurgo = pma * 20 + diasalquiler * 50;
    }

}
