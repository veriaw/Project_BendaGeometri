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
    
    @Override
    public double hitungVolume() {
        return super.hitungLuas()*tinggiPrismaSegitiga;
    }
    @Override
    public double hitungLuasPermukaan() {
        return (2 * super.hitungLuas()) + (super.hitungKeliling()* tinggiPrismaSegitiga);
    }
}
