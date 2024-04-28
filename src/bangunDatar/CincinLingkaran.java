/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nana
 */
package bangunDatar;

import bendaGeometri.BendaGeometri;
import bendaGeometri.GeometriDatar;

public class CincinLingkaran extends BendaGeometri implements GeometriDatar {
    protected double jari_jari, tinggi;

    public CincinLingkaran(double jari_jari, double tinggi) {
        this.jari_jari = jari_jari;
        this.tinggi = tinggi;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        // Rumus luas permukaan cincin: 2 * π * r * t
        return 2 * Math.PI * jari_jari * tinggi;
    }
}

