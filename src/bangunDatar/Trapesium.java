/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

import bendaGeometri.BendaGeometri;
import bendaGeometri.GeometriDatar;

/**
 *
 * @author adity
 */
public class Trapesium extends BendaGeometri implements GeometriDatar {
protected double atas, bawah, tinggi;
    public Trapesium(double atas, double bawah, double tinggi){
        this.atas= atas;
        this.bawah= bawah;
        this.tinggi= tinggi;
    }

    public double getAtas() {
        return atas;
    }

    public void setAtas(double atas) {
        this.atas = atas;
    }

    public double getBawah() {
        return bawah;
    }

    public void setBawah(double bawah) {
        this.bawah = bawah;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    @Override
    public double hitungLuas() {
        return 0.5 * (atas+bawah) * tinggi;
    }
    
    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow((bawah - atas) / 2, 2) + Math.pow(tinggi, 2));
        return atas + bawah + 2 * sisiMiring;
    }
    }
