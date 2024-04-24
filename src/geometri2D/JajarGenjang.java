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
public class JajarGenjang extends BendaGeometri implements Geometri2D {
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
    
    
    
}
