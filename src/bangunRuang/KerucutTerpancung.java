/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

/**
 *
 * @author nana
 */

import bendaGeometri.GeometriRuang;

public class KerucutTerpancung extends Kerucut implements GeometriRuang {
    private double tinggiKerucutTerpancung;

    public KerucutTerpancung(double jari_jari, double tinggiKerucut ,double tinggiKerucutTerpancung) {
        super(jari_jari, tinggiKerucut);
        this.tinggiKerucut = tinggiKerucut;
    }

    public double getTinggiKerucutTerpancung() {
        return tinggiKerucutTerpancung;
    }

    public void setTinggiKerucutTerpancung(double tinggiKerucutTerpancung) {
        this.tinggiKerucutTerpancung = tinggiKerucutTerpancung;
    }

    @Override
    public double volume() {
        double volumeKerucut = super.volume();
        double volumeKerucutTerpancung = (1.0 / 3.0) * Math.PI* Math.pow(jari_jari, 2) * tinggiKerucutTerpancung;
        return volumeKerucut-volumeKerucutTerpancung;
    }
}

