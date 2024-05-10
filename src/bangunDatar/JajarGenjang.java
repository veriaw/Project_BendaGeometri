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
public class JajarGenjang extends BendaGeometri implements GeometriDatar {
    protected double alas, tinggi;
   
    public JajarGenjang(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return alas*tinggi;
    }
    @Override
    public double keliling(double b) {
        return (2 * (alas + sisiMiring(b)));
    }
    public double sisiMiring(double b) {
        return b;
    }    
}
