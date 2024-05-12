/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendaGeometri;

import bangunRuang.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class MenuGeometriRuang extends JFrame implements ActionListener {
    final private String[] bangunRuang = {"Balok","Kubus","Prisma","Tabung","Kerucut","Bola","Limas Persegi","Limas Persegi Panjang","Limas Segitiga","Kerucut Terpancung","Juring Bola","Tembereng Bola","Cincin Bola"};
    JLabel welcome = new JLabel("Benda Geometri 3D");
    JLabel deskripsi = new JLabel("Pilih Bangun Datar Terlebih Dahulu");
    JComboBox bangun = new JComboBox(bangunRuang);
    JButton pilih = new JButton("Pilih");
    JLabel param1 = new JLabel("Parameter 1");
    JLabel param2 = new JLabel("Parameter 2");
    JLabel param3 = new JLabel("Parameter 3");
    JLabel param4 = new JLabel("Parameter 4");
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    JTextField input3 = new JTextField();
    JTextField input4 = new JTextField();
    JButton hitung = new JButton("Hitung");
    JButton kembali = new JButton("kembali");
    JLabel hasilVolume = new JLabel("Volume Bangun");
    JLabel valueVolume = new JLabel("[Tipe data double]");
    JLabel hasilLuasPermukaan = new JLabel("Luas Permukaan Bangun");
    JLabel valueLuasPermukaan = new JLabel("[Tipe data double]");
    public MenuGeometriRuang(){
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
        bangun.setBounds(40, 100, 150, 35);
        
        add(pilih);
        pilih.setBounds(200, 100, 100, 35);
        pilih.addActionListener(this);
        
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
        
        add(param4);
        param4.setBounds(40, 285, 100, 35);
        param4.setFont(new Font("Arial", Font.PLAIN, 12));
        
        add(input4);
        input4.setBounds(150, 285, 100, 30);
        
        add(hitung);
        hitung.setBounds(40, 325, 100, 30);
        hitung.addActionListener(this);
        
        add(kembali);
        kembali.setBounds(150, 325, 100, 30);
        kembali.addActionListener(this);
        
        add(hasilVolume);
        hasilVolume.setBounds(40, 365, 100, 30);
                
        add(valueVolume);
        valueVolume.setBounds(150, 365, 120, 30);
        
        add(hasilLuasPermukaan);
        hasilLuasPermukaan.setBounds(40, 405, 100, 30);
        
        add(valueLuasPermukaan);
        valueLuasPermukaan.setBounds(150, 405, 120, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pilih){
            if(bangun.getSelectedItem()=="Kubus"){
                param1.setText("Sisi");
                param2.setText("Not Used");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Balok"){
                param1.setText("Panjang");
                param2.setText("Lebar");
                param3.setText("Tinggi");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Bola"){
                param1.setText("Jari Jari");
                param2.setText("Not Used");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Tabung"){
                param1.setText("Jari Jari");
                param2.setText("Tinggi");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Prisma"){
                param1.setText("Alas");
                param2.setText("Tinggi");
                param3.setText("Tinggi Prisma");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Kerucut"){
                param1.setText("Jari Jari");
                param2.setText("Tinggi Kerucut");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Limas Persegi"){
                param1.setText("Panjang");
                param2.setText("Tinggi Limas");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Limas Persegi Panjang"){
                param1.setText("Panjang");
                param2.setText("Lebar");
                param3.setText("Tinggi Limas");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Limas Segitiga"){
                param1.setText("Alas");
                param2.setText("Tinggi");
                param3.setText("Tinggi Limas");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Kerucut Terpancung"){
                param1.setText("Jari Jari");
                param2.setText("Tinggi Kerucut");
                param3.setText("Tinggi Kerucut Terpancung");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Juring Bola"){
                param1.setText("Jari Jari");
                param2.setText("Jumlah Sisi");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Tembereng Bola"){
                param1.setText("Jari Jari");
                param2.setText("Sudut Tembereng");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Cincin Bola"){
                param1.setText("Jari Jari");
                param2.setText("Jumlah Sisi");
                param3.setText("Not Used");
                param4.setText("Not Used");
            }
        }else if(e.getSource()==hitung){
            if(bangun.getSelectedItem()=="Kubus"){
                Kubus b1 = new Kubus(Double.parseDouble(input1.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Balok"){
                Balok b1 = new Balok(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()), Double.parseDouble(input3.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Bola"){
                Bola b1 = new Bola(Double.parseDouble(input1.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Tabung"){
                Tabung b1 = new Tabung(Double.parseDouble(input1.getText()), Double.parseDouble(input1.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Prisma"){
                PrismaSegitiga b1 = new PrismaSegitiga(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()), Double.parseDouble(input3.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Kerucut"){
                Kerucut b1 = new Kerucut(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Limas Persegi"){
                LimasPersegi b1 = new LimasPersegi(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Limas Persegi Panjang"){
                LimasPersegiPanjang b1 = new LimasPersegiPanjang(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()), Double.parseDouble(input3.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Limas Segitiga"){
                LimasSegitiga b1 = new LimasSegitiga(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()), Double.parseDouble(input3.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Kerucut Terpancung"){
                KerucutTerpancung b1 = new KerucutTerpancung(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()), Double.parseDouble(input3.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Juring Bola"){
                JuringBola b1 = new JuringBola(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Tembereng Bola"){
                TemberengBola b1 = new TemberengBola(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }else if(bangun.getSelectedItem()=="Cincin Bola"){
                CincinBola b1 = new CincinBola(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueVolume.setText(String.valueOf(b1.volume()));
                valueLuasPermukaan.setText(String.valueOf(b1.luasPermukaan()));
            }
        }else if(e.getSource()==kembali){
            new MainMenu();
        }
    }
    
    
}
