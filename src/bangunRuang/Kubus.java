/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Persegi;
import bendaGeometri.GeometriRuang;

/**
 *
 * @author Lenovo
 */
public class Kubus extends Persegi implements GeometriRuang  {

    public Kubus (double panjang){
    super (panjang);    
    }
    Persegi alas = new Persegi(panjang);
    @Override
    public double volume() {
        return super.luas()*panjang;
    }
    @Override
    public double luasPermukaan() {
        return 6*(panjang*panjang);
    }
}
