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
    
    @Override
    public double hitungVolume(){
        return 0.33*super.hitungLuas()*tinggiLimasPersegiPanjang;
    }
    @Override
    public double hitungLuasPermukaan() {
        return (super.hitungLuas())+(4*(0.50*panjang*tinggiLimasPersegiPanjang));
    
    }
}
