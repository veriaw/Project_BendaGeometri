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
public class CincinBola extends Bola implements GeometriRuang {
    private double jariJariLuar, jariJariDalam;

    public CincinBola(double jariJariLuar, double jariJariDalam) {
        super(jariJariLuar);
        this.jariJariLuar = jariJariLuar;
        this.jariJariDalam = jariJariDalam;
    }

    @Override
    public double volume() {
        return super.volume() * (jariJariLuar * jariJariLuar - jariJariDalam * jariJariDalam);
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * jariJariLuar * (jariJariLuar + jariJariDalam);
    }
}