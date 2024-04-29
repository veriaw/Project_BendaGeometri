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
public class TemberengLingkaran extends Lingkaran implements GeometriDatar {

    protected double derajat_sudut;
    public TemberengLingkaran(double jari_jari,double derajat_sudut ){
        super(jari_jari);
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
    
    Lingkaran b1 = new Lingkaran(jari_jari);
    
    @Override
    public double luas() {
         return (derajat_sudut/360 * b1.luas())-(0.5 * jari_jari*jari_jari);
    }
    
}
