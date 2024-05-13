/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bendaGeometri.GeometriRuang;

/**
 *
 * @author Lenovo
 */
public class TemberengBola extends Bola implements GeometriRuang {
    private double sudutTembereng;

    public TemberengBola(double jariJari, double sudutTembereng) {
        super(jariJari);
        this.sudutTembereng = sudutTembereng;
    }

    @Override
    public double volume() {
        return sudutTembereng/360*super.volume();
    }

    @Override
    public double luasPermukaan() {
        return sudutTembereng/360*Math.PI*Math.pow(jari_jari, 2);
    }
}
