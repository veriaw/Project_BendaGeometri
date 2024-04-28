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
public class Prisma extends Segitiga implements GeometriRuang {
    private double tinggiPrisma;
    
    public Prisma(double alas, double tinggi, double tinggiPrisma){
        super(alas, tinggi);
        this.tinggiPrisma=tinggiPrisma;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }
    
    Segitiga segi3 = new Segitiga(alas, tinggi);
    
    @Override
    public double volume() {
        return segi3.luas()*tinggiPrisma;
    }
}
