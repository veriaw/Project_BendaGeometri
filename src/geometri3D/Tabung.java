/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri3D;

import bendaGeometri.Geometri3D;
import geometri2D.Lingkaran;

/**
 *
 * @author Lenovo
 */
public class Tabung extends Lingkaran implements Geometri3D {
    private double tinggi;
    
    public Tabung(double jari_jari, double tinggi){
        super(jari_jari);
        this.tinggi=tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    Lingkaran alas = new Lingkaran(jari_jari);
    
    @Override
    public double volume() {
        return alas.luas()*tinggi;
    }
    
}
