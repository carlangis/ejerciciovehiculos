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
public class coche extends vehiculos {

    private final int numeroplazas;

    public coche(String matricula, int diasalquiler, int numeroplazas) {
        super(matricula, diasalquiler);

        this.numeroplazas = numeroplazas;
    }

    @Override
    public int getDiasalquiler() {
        return super.getDiasalquiler();
    }

    public int getNumeroplazas() {
        return numeroplazas;
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
    public double calcularalquiler() {
        double alquilerbase = (diasalquiler * 50) * (1.5 * numeroplazas);
        return alquilerbase;
    }

}
