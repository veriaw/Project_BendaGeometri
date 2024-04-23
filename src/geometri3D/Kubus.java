/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri3D;

import bendaGeometri.Geometri3D;
import geometri2D.Persegi;

/**
 *
 * @author Lenovo
 */
public class Kubus extends Persegi implements Geometri3D  {

    public Kubus (double panjang){
    super (panjang);    
    }
    Persegi alas = new Persegi(panjang);
    @Override
    public double volume() {
        return alas.luas()*panjang;
    }
    
}
