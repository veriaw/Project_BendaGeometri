/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Lingkaran;
import bendaGeometri.GeometriRuang;

/**
 *
 * @author nana
 */
public class JuringBola extends Bola implements GeometriRuang {
    private double jumlahSisi;

    public JuringBola(double jariJari, double jumlahSisi) {
        super(jariJari);
        this.jumlahSisi = jumlahSisi;
    }

    @Override
    public double hitungVolume() {
        return super.hitungVolume() * (4.0 / 3.0) * Math.PI * jumlahSisi;
    }

    @Override
    public double hitungLuasPermukaan() {
    return 4 * Math.PI * jari_jari * jari_jari + jumlahSisi * 2 * Math.PI * jari_jari * Math.sin(Math.PI / jumlahSisi);
    }
}