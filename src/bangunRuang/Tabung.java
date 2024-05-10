/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Lingkaran;
import bendaGeometri.GeometriRuang;

/**
 *
 * @author Lenovo
 */
public class Tabung extends Lingkaran implements GeometriRuang {
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
    
    @Override
    public double volume() {
        return super.luas()*tinggi;
    }
    @Override
    public double luasPermukaan() {
        return 2*(Math.PI*Math.pow(jari_jari,1))*(jari_jari+tinggi);
    }

}
