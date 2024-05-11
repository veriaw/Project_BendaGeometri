/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendaGeometri;

import bangunDatar.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class MenuGeometriDatar extends JFrame implements ActionListener {
    final private String[] bangunDatar = {"Select Bangun...","Persegi","Persegi Panjang","Lingkaran","Segitiga","Jajar Genjang","Layang Layang", "Belah Ketupat", "Trapesium","Juring Lingkaran","Tembereng Lingkaran","Cincin Lingkaran"};
    JLabel welcome = new JLabel("Benda Geometri 2D");
    JLabel deskripsi = new JLabel("Pilih Bangun Datar Terlebih Dahulu");
    JComboBox bangun = new JComboBox(bangunDatar);
    JButton pilih = new JButton("Pilih");
    JLabel param1 = new JLabel("Parameter 1");
    JLabel param2 = new JLabel("Parameter 2");
    JLabel param3 = new JLabel("Parameter 3");
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    JTextField input3 = new JTextField();
    JButton hitung = new JButton("Hitung");
    JButton kembali = new JButton("kembali");
    JLabel hasilLuas = new JLabel("Luas Bangun");
    JLabel valueLuas = new JLabel("[Tipe data double]");
    JLabel hasilKeliling = new JLabel("Keliling Bangun");
    JLabel valueKeliling = new JLabel("[Tipe data double]");
    MenuGeometriDatar () {
        setVisible(true);
        setSize(720, 550);
        setTitle("Menu Geometri 2D");
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
        
        add(hitung);
        hitung.setBounds(40, 285, 100, 30);
        hitung.addActionListener(this);
                
        add(kembali);
       
        kembali.setBounds(150, 285, 100, 30);
        kembali.addActionListener(this);
        
        add(hasilLuas);
        hasilLuas.setBounds(40, 325, 100, 30);
                
        add(valueLuas);
        valueLuas.setBounds(150, 325, 120, 30);
        
        add(hasilKeliling);
        hasilKeliling.setBounds(40, 365, 100, 30);
        
        add(valueKeliling);
        valueKeliling.setBounds(150, 365, 120, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pilih){
            if(bangun.getSelectedItem()=="Persegi"){
                param1.setText("Sisi");
                param2.setText("Not Used");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Persegi Panjang"){
                param1.setText("Panjang");
                param2.setText("Lebar");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Lingkaran"){
                param1.setText("Jari Jari");
                param2.setText("Not Used");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Segitiga"){
                param1.setText("Alas");
                param2.setText("Tinggi");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Jajar Genjang"){
                param1.setText("Alas");
                param2.setText("Tinggi");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Layang Layang"){
                param1.setText("Diagonal Horizontal");
                param2.setText("Diagonal Vertikal");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Belah Ketupat"){
                param1.setText("Diagonal Horizontal");
                param2.setText("Diagonal Vertikal");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Trapesium"){
                param1.setText("Sisi Atas");
                param2.setText("Sisi Bawah");
                param3.setText("Tinggi");
            }else if(bangun.getSelectedItem()=="Juring Lingkaran"){
                param1.setText("Jari Jari");
                param2.setText("Derajat Sudut");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Tembereng Lingkaran"){
                param1.setText("Jari Jari");
                param2.setText("Derajat Sudut");
                param3.setText("Not Used");
            }else if(bangun.getSelectedItem()=="Cincin Lingkaran"){
                param1.setText("Jari Jari");
                param2.setText("Tinggi");
                param3.setText("Not Used");
            }
        }else if(e.getSource()==hitung){
            if(bangun.getSelectedItem()=="Persegi"){
                Persegi b1 = new Persegi(Double.parseDouble(input1.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }else if(bangun.getSelectedItem()=="Persegi Panjang"){
                PersegiPanjang b1 = new PersegiPanjang(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }else if(bangun.getSelectedItem()=="Lingkaran"){
                Lingkaran b1 = new Lingkaran(Double.parseDouble(input1.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }else if(bangun.getSelectedItem()=="Segitiga"){
                Segitiga b1 = new Segitiga(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }else if(bangun.getSelectedItem()=="Jajar Genjang"){
                JajarGenjang b1 = new JajarGenjang(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }else if(bangun.getSelectedItem()=="Trapesium"){
                Trapesium b1 = new Trapesium(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()), Double.parseDouble(input3.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }else if(bangun.getSelectedItem()=="Layang Layang"){
                LayangLayang b1 = new LayangLayang(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }else if(bangun.getSelectedItem()=="Belah Ketupat"){
                BelahKetupat b1 = new BelahKetupat(Double.parseDouble(input1.getText()), Double.parseDouble(input2.getText()));
                valueLuas.setText(String.valueOf(b1.luas()));
                valueKeliling.setText(String.valueOf(b1.keliling()));
            }
        }else if(e.getSource()==kembali){
            new MainMenu();
        }
    }   
}
