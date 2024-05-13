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
public class PersegiPanjang extends BendaGeometri implements GeometriDatar{
    protected double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar){
        this.panjang= panjang;
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
    public double hitungLuas() {
        return panjang*lebar;
    }
    @Override
    public double hitungKeliling() {
        return 2 * (panjang+lebar);
    }
}
