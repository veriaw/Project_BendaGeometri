/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

import bendaGeometri.BendaGeometri;
import bendaGeometri.GeometriDatar;

/**
 *
 * @author Lenovo
 */
public class Lingkaran extends BendaGeometri implements GeometriDatar{
    protected double jari_jari;
    public Lingkaran(double jari_jari){
        this.jari_jari=jari_jari;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    
    @Override
    public double luas() {
        return Math.PI*Math.pow(jari_jari,2);
    }
    
    @Override
    public double keliling() {
        return 2*Math.PI*Math.pow(jari_jari,1);
    }
}
