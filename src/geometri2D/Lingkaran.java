/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri2D;

import bendaGeometri.BendaGeometri;
import bendaGeometri.Geometri2D;

/**
 *
 * @author Lenovo
 */
public class Lingkaran extends BendaGeometri implements Geometri2D{
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
        return Math.PI*jari_jari*jari_jari;
    }
    
}
