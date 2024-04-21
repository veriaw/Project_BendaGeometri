/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri2D;

import bendaGeometri.BendaGeometri;

/**
 *
 * @author Lenovo
 */
public class Persegi extends BendaGeometri {
    private double panjang, lebar;
    
    public Persegi(double panjang, double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang*lebar;
    }
    
}
