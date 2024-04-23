/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bendaGeometri;

import geometri3D.*;
import geometri2D.*;
/**
 *
 * @author Lenovo
 */
public class BendaGeometri {
    
    public static void main(String[] args) {
        Balok b1 = new Balok(5,4,3);
        Kubus b2 = new Kubus(5);
        Prisma b3 = new Prisma(12,3,5);
        System.out.println(b3.volume());
        System.out.println("halah");
    }
    
}
