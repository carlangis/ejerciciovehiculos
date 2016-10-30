
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
public class camion extends furgoneta {

    private final int fijocamion = 40;

    public camion(double pma, String matricula, int diasalquiler) {
        super(pma, matricula, diasalquiler);

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

    @Override
    public double getPma() {
        return super.getPma(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularalquiler() {
        return super.calcularalquiler() + fijocamion; //To change body of generated methods, choose Tools | Templates.
    }

}
