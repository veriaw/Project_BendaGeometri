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
 * @author Lenovo
 */
public class Menu3D extends JFrame implements ActionListener {
    final private String[] bangunRuang = {"Balok","Kubus","Prisma","Tabung","Kerucut","Bola"};
    JLabel welcome = new JLabel("Benda Geometri 3D");
    JLabel deskripsi = new JLabel("Pilih Bangun Datar Terlebih Dahulu");
    JComboBox bangun = new JComboBox(bangunRuang);
    JLabel param1 = new JLabel("Parameter 1");
    JLabel param2 = new JLabel("Parameter 2");
    JLabel param3 = new JLabel("Parameter 3");
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    JTextField input3 = new JTextField();
    JButton hitung = new JButton("Hitung");
    JButton kembali = new JButton("kembali");
    public Menu3D(){
        setVisible(true);
        setSize(720, 550);
        setTitle("Menu Geometri 3D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(welcome);
        welcome.setBounds(40, 20, 300, 35);
        welcome.setFont(new Font("Arial", Font.PLAIN, 30));

        add(deskripsi);
        deskripsi.setBounds(40, 55, 300, 35);
        deskripsi.setFont(new Font("Arial", Font.ITALIC, 15));
        
        add(bangun);
        bangun.setBounds(40, 100, 250, 35);
        bangun.addActionListener(this);
        
        add(param1);
        param1.setBounds(40, 150, 100, 35);
        param1.setFont(new Font("Arial", Font.PLAIN, 12));
        
        add(input1);
        input1.setBounds(150, 150, 100, 30);
        
        add(param2);
        param2.setBounds(40, 195, 100, 35);
        param2.setFont(new Font("Arial", Font.PLAIN, 12));
        
        add(input2);
        input2.setBounds(150, 195, 100, 30);
        
        add(param3);
        param3.setBounds(40, 240, 100, 35);
        param3.setFont(new Font("Arial", Font.PLAIN, 12));
        
        add(input3);
        input3.setBounds(150, 240, 100, 30);
        
        add(hitung);
        hitung.setBounds(40, 285, 100, 30);
        hitung.addActionListener(this);
        
        add(kembali);
        kembali.setBounds(150, 285, 100, 30);
        kembali.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
