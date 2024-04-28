/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri2D;

import bendaGeometri.BendaGeometri;
import bendaGeometri.Geometri2D;

/**
 *
 * @author adity
 */
public class BelahKetupat extends BendaGeometri implements Geometri2D {
    protected double diagonalHorizontal, diagonalVertikal;
    public BelahKetupat(double diagonalHorizontal, double diagonalVertikal){
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
        return 0.5 * diagonalHorizontal * diagonalVertikal;
    }
    
    
}