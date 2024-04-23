/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri3D;

import bendaGeometri.*;
import geometri2D.Persegi;

/**
 *
 * @author Lenovo
 */
public class Balok extends Persegi implements Geometri3D {
    private double tinggi;
    
    public Balok (double tinggi){
        this.tinggi = tinggi;
    }
    
    Persegi alas = new Persegi(panjang, lebar);
    
    @Override
    public double volume() {
        return alas.luas()*lebar*tinggi;
    }
    
}
