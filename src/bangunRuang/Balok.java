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
    
    @Override
    public double hitungVolume() {
        return super.hitungLuas()*tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return (2*super.hitungLuas())+(panjang*tinggi)+(lebar*tinggi);
    }
    
}
