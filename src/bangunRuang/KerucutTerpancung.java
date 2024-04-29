/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

/**
 *
 * @author nana
 */

import bangunDatar.Trapesium;
import bendaGeometri.GeometriRuang;

public class KerucutTerpancung extends Trapesium implements GeometriRuang {
    private double tinggiKerucut;

    public KerucutTerpancung(double alasAtas, double alasBawah, double tinggi, double tinggiKerucut) {
        super(alasAtas, alasBawah, tinggi);
        this.tinggiKerucut = tinggiKerucut;
    }

    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * luas() * tinggiKerucut;
    }
}

