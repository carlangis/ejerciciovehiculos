/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquileresvehiculos;


public final class microbuss extends coche {

    private final int  fijoconstante = 2; 
    
    
    public microbuss(String matricula, int diasalquiler, int numeroplazas) {
        super(matricula, diasalquiler, numeroplazas);
    }

    @Override
    public int getDiasalquiler() {
        return super.getDiasalquiler();
    }

    @Override
    public int getNumeroplazas() {
        return super.getNumeroplazas(); 
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
    public final double  calcularalquiler() {
        return fijoconstante*super.calcularalquiler();
    }
    
}
