/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

import bendaGeometri.BendaGeometri;
import bendaGeometri.GeometriDatar;

/**
 *
 * @author adity
 */
public class TemberengLingkaran extends BendaGeometri implements GeometriDatar {

    protected double jari_jari, derajat_sudut;
    public TemberengLingkaran(double jari_jari,double derajat_sudut ){
        this.jari_jari=jari_jari;
        this.derajat_sudut=derajat_sudut;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getDerajat_sudut() {
        return derajat_sudut;
    }

    public void setDerajat_sudut(double derajat_sudut) {
        this.derajat_sudut = derajat_sudut;
    }
    
    @Override
    public double luas() {
         return (derajat_sudut/360 * Math.PI*Math.pow(jari_jari,2))-(0.5 * jari_jari*jari_jari);
    }
    
}
