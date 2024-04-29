/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Segitiga;
import bendaGeometri.GeometriRuang;

/**
 *
 * @author Lenovo
 */
public class PrismaSegitiga extends Segitiga implements GeometriRuang {
    private double tinggiPrismaSegitiga;
    
    public PrismaSegitiga(double alas, double tinggi, double tinggiPrismaSegitiga){
        super(alas, tinggi);
        this.tinggiPrismaSegitiga=tinggiPrismaSegitiga;
    }

    public double getTinggiPrismaSegitiga() {
        return tinggiPrismaSegitiga;
    }

    public void setTinggiPrismaSegitiga(double tinggiPrismaSegitiga) {
        this.tinggiPrismaSegitiga = tinggiPrismaSegitiga;
    }
    
    Segitiga segi3 = new Segitiga(alas, tinggi);
    
    @Override
    public double volume() {
        return segi3.luas()*tinggiPrismaSegitiga;
    }
}
