/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri3D;

import bendaGeometri.Geometri3D;
import geometri2D.Segitiga;

/**
 *
 * @author Lenovo
 */
public class Kerucut extends Segitiga implements Geometri3D {
    private double tinggiKerucut;
    
    public Kerucut(double alas, double tinggi, double tinggiKerucut){
        super(alas, tinggi);
        this.tinggiKerucut=tinggiKerucut;
    }

    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }

    Segitiga segi3 = new Segitiga(alas, tinggi);    
    
    @Override
    public double volume() {
        return 0.333*segi3.luas()*tinggiKerucut;
    }
    
    
}
