/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Lingkaran;
import bendaGeometri.GeometriRuang;

/**
 *
 * @author Lenovo
 */
public class Bola extends Lingkaran implements GeometriRuang {
    public Bola (double jari_jari){
        super(jari_jari);
    }

    @Override
    public double volume() {
        return 1.3333*Math.PI*Math.pow(jari_jari,3);
    }

}
