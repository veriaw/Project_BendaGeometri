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
public class Kerucut extends Lingkaran implements GeometriRuang {
    protected double tinggiKerucut;
    
    public Kerucut(double jari_jari, double tinggiKerucut){
        super(jari_jari);
        this.tinggiKerucut=tinggiKerucut;
        
    }
    
    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }   
    
    @Override
    public double hitungVolume() {
        return 0.333*super.hitungLuas()*tinggiKerucut;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double sisiMiring = Math.sqrt(Math.pow(super.getJari_jari(), 2) + Math.pow(tinggiKerucut, 2));
        return super.hitungLuas() + Math.PI * super.getJari_jari() * sisiMiring;
    }   
}
