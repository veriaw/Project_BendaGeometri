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
    protected double tinggiKerucut, sisimiring;
    
    public Kerucut(double jari_jari, double tinggiKerucut, double sisimiring){
        super(jari_jari);
        this.tinggiKerucut=tinggiKerucut;
        this.sisimiring=sisimiring;
        
    }
    
    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }   
    
    public double getSisimiring(){
        return sisimiring;
    }
    
    public void setSisimiring(double sisimiring){
        this.sisimiring = sisimiring;
    }
    
    @Override
    public double volume() {
        return 0.333*super.luas()*tinggiKerucut;
    }
    
    @Override
    public double luasPermukaan(){
        return r*Math.PI*Math.pow(sisimiring+r);
    }
   
    
}
