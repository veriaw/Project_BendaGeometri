/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.PersegiPanjang;
import bendaGeometri.GeometriRuang;
/**
 *
 * @author HP
 */
public class LimasPersegiPanjang extends PersegiPanjang implements GeometriRuang{
    private double tinggiLimasPersegiPanjang;
    
    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimasPersegiPanjang){
        super(panjang, lebar);
        this.tinggiLimasPersegiPanjang = tinggiLimasPersegiPanjang;
    }
    public double getTinggiLimasPersegiPanjang(){
        return tinggiLimasPersegiPanjang;
    }
    public void setTinggiLimasPersegiPanjang(double tinggiLimasPersegiPanjang){
        this.tinggiLimasPersegiPanjang = tinggiLimasPersegiPanjang;
    }
    
    PersegiPanjang alas = new PersegiPanjang(panjang, lebar);
    
    @Override

    public double volume(){
        return 0.33*alas.luas()*tinggiLimasPersegiPanjang;
    }
    
}
