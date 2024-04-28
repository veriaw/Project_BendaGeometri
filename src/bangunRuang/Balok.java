/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.PersegiPanjang;
import bendaGeometri.*;

/**
 *
 * @author Lenovo
 */
public class Balok extends PersegiPanjang implements GeometriRuang {
    private double tinggi;
    
    public Balok (double panjang, double lebar, double tinggi){
        super(panjang,lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    PersegiPanjang alas = new PersegiPanjang(panjang, lebar);
    
    @Override
    public double volume() {
        return alas.luas()*tinggi;
    }
    
}
