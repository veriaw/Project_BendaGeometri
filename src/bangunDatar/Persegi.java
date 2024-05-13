/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

import bendaGeometri.*;

/**
 *
 * @author Lenovo
 */
public class Persegi extends BendaGeometri implements GeometriDatar{
    protected double panjang;
    
    public Persegi(double panjang){
        this.panjang=panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    @Override
    public double hitungLuas() {
        return panjang*panjang;
    }
    @Override
    public double hitungKeliling() {
        return 4*panjang;
    }
}
