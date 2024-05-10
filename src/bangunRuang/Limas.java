/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Persegi;
import bendaGeometri.GeometriRuang;

/**
 *
 * @author adity
 */
public class Limas extends Persegi implements GeometriRuang {
    private double tinggiLimas;

    public Limas(double panjang, double tinggiLimas){
        super(panjang);
        this.tinggiLimas=tinggiLimas;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }

    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }
    
    @Override
    public double volume() {
        return 0.333 * super.luas() * tinggiLimas;
    
    }
    @Override
    public double luasPermukaan() {
        return (super.luas())+(4*(0.50*panjang*tinggiLimas));
    
    }
}



