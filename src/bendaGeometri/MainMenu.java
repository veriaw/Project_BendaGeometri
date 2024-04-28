/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendaGeometri;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author adity
 */
public class MainMenu extends JFrame implements ActionListener{
    
    JLabel welcome = new JLabel("Benda Geometri");
    JLabel deskripsi = new JLabel("Pilih Geometri Terlebih Dahulu");
    JButton geometri2D = new JButton("2D");
    JButton geometri3D = new JButton("3D");
    MainMenu () {
        setVisible(true);
        setSize(720, 550);
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(welcome);
        welcome.setBounds(40, 20, 300, 35);
        welcome.setFont(new Font("Arial", Font.PLAIN, 30));

        add(deskripsi);
        deskripsi.setBounds(40, 55, 300, 35);
        deskripsi.setFont(new Font("Arial", Font.ITALIC, 15));
        
        add(geometri2D);
        geometri2D.setBounds(40, 100, 200, 30);
        geometri2D.setFont(new Font("Arial", Font.ITALIC, 15));
        geometri2D.addActionListener(this);
        
        add(geometri3D);
        geometri3D.setBounds(40, 140, 200, 30);
        geometri3D.setFont(new Font("Arial", Font.ITALIC, 15));
        geometri3D.addActionListener(this);
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==geometri2D){
            new MenuGeometriDatar();
            this.dispose();
        }else{
            new MenuGeometriRuang();
            this.dispose();
        }
        
    }

     
}
