/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendaGeometri;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author adity
 */
public class Menu extends JFrame implements ActionListener{
    final private String[] geometri = {"2D","3D"};
    final private String[] bangunDatar = {"Persegi","Persegi Panjang","Lingkaran","Segitiga","Jajar Genjang","Layang Layang"};
    final private String[] bangunRuang = {"Balok","Kubus","Prisma","Tabung","Kerucut","Bola"};
    
    JLabel welcome = new JLabel("Benda Geometri");
    JLabel lanjutkan = new JLabel("Pilih Geometri Terlebih Dahulu");
    JComboBox bangun = new JComboBox(geometri);
    JComboBox benda2D = new JComboBox(bangunDatar);
    JComboBox benda3D = new JComboBox(bangunRuang);
    Menu () {
        setVisible(true);
        setSize(720, 550);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(welcome);
        welcome.setBounds(40, 20, 300, 35);
        welcome.setFont(new Font("Arial", Font.PLAIN, 30));

        add(lanjutkan);
        lanjutkan.setBounds(40, 55, 300, 35);
        lanjutkan.setFont(new Font("Arial", Font.ITALIC, 15));
        
        add(bangun);
        bangun.setBounds(40, 80, 300, 35);
        bangun.addActionListener(this);
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(bangun.getSelectedItem()=="2D"){
            remove(benda3D);
            add(benda2D);
            benda2D.setBounds(40, 120, 300, 35);
        }else{
            remove(benda2D);
            add(benda3D);
            benda3D.setBounds(40, 120, 300, 35);
        }
    }

     
}
