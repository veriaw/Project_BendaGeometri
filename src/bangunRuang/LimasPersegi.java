/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.Persegi;
import bendaGeometri.GeometriRuang;
        
/**
 *
 * @author HP
 */
public class LimasPersegi extends Persegi implements GeometriRuang{
    private double tinggiLimasPersegi;
    
    public LimasPersegi(double panjang, double tinggiLimasPersegi){
        super(panjang);
        this.tinggiLimasPersegi = tinggiLimasPersegi;
    }
    public double getTinggiLimasPersegi(){
        return tinggiLimasPersegi;
    }
    public void setTinggiLimasPersegi(double tinggiLimasPersegi){
        this.tinggiLimasPersegi = tinggiLimasPersegi;
    }
    
    Persegi alasPersegi = new Persegi(panjang);
    
    @Override
    public double volume(){
        return 0.33*alasPersegi.luas()*tinggiLimasPersegi;
    }
}