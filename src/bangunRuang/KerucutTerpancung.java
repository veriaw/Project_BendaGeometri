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
    public double hitungVolume() {
        double volumeKerucutTerpancung = (1.0 / 3.0) * Math.PI* Math.pow(jari_jari, 2) * tinggiKerucutTerpancung;
        return super.hitungVolume()-volumeKerucutTerpancung;
    }
    public double hitungLuasPermukaan(){
        double sisiMiring = Math.sqrt(Math.pow(getJari_jari() - getJari_jari() * tinggiKerucutTerpancung / getTinggiKerucut(), 2) + Math.pow(tinggiKerucutTerpancung, 2));
        double luasKerucutTerpancung = Math.PI * (getJari_jari() + getJari_jari() * sisiMiring);
        return super.hitungLuasPermukaan() + luasKerucutTerpancung;
    }
}

