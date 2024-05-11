/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Lingkaran;
import bendaGeometri.GeometriDatar;

/**
 *
 * @author nana
 */


public class CincinLingkaran extends Lingkaran implements GeometriDatar {
    protected double jari_jariKecil;

    public CincinLingkaran(double jari_jari, double jari_jariKecil) {
        super(jari_jari);
        this.jari_jariKecil = jari_jariKecil;
    }

    public double getJari_jariKecil() {
        return jari_jariKecil;
    }

    public void setJari_jariKecil(double jari_jariKecil) {
        this.jari_jariKecil = jari_jariKecil;
    }
    
    Lingkaran besar = new Lingkaran(jari_jari);
    Lingkaran kecil = new Lingkaran(jari_jariKecil);
    
    @Override
    public double luas() {
        return besar.luas()-kecil.luas();
    }
}
