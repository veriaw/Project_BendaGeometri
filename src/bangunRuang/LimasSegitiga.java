/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.Segitiga;
import bendaGeometri.GeometriRuang;

/**
 *
 * @author HP
 */
public class LimasSegitiga extends Segitiga implements GeometriRuang{
    private double tinggiLimasSegitiga;
    
    public LimasSegitiga(double alas, double tinggi, double tinggiLimasSegitiga){
        super(alas, tinggi);
        this.tinggiLimasSegitiga = tinggiLimasSegitiga;
    }
    public double getTinggiLimasSegitiga(){
        return tinggiLimasSegitiga;
    }
    public void setTinggiLimasSegitiga(double tinggiLimasSegitiga){
        this.tinggiLimasSegitiga = tinggiLimasSegitiga;
    }
    
    @Override
    public double volume(){
        return 0.33*super.luas()*tinggiLimasSegitiga;
    
    }
    @Override
    public double luasPermukaan() {
        return (super.luas())+(4*(0.50*alas*tinggiLimasSegitiga));
    
    }
}
