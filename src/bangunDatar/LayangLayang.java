/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

import bendaGeometri.BendaGeometri;
import bendaGeometri.GeometriDatar;

/**
 *
 * @author Lenovo
 */
public class LayangLayang extends BendaGeometri implements GeometriDatar {
    protected double diagonalHorizontal, diagonalVertikal;
    
    public LayangLayang(double diagonalHorizontal, double diagonalVertikal){
        this.diagonalHorizontal=diagonalHorizontal;
        this.diagonalVertikal=diagonalVertikal;
    }

    public double getDiagonalHorizontal() {
        return diagonalHorizontal;
    }

    public void setDiagonalHorizontal(double diagonalHorizontal) {
        this.diagonalHorizontal = diagonalHorizontal;
    }

    public double getDiagonalVertikal() {
        return diagonalVertikal;
    }

    public void setDiagonalVertikal(double diagonalVertikal) {
        this.diagonalVertikal = diagonalVertikal;
    }

    @Override
    public double luas() {
        return 0.5*diagonalVertikal*diagonalHorizontal;
    }
    @Override
    public double keliling() {
        return (4 * sisiMiring(diagonalHorizontal, diagonalVertikal));
    }
    public double sisiMiring(double d1, double d2) {
        return (Math.sqrt(((diagonalHorizontal / 2) * (diagonalHorizontal / 2)) + ((diagonalVertikal / 2) * (diagonalVertikal / 2))));
    }   
    
    
}
