/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendaGeometri;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author adity
 */
public class Menu extends JFrame implements ActionListener{

    JLabel welcome = new JLabel("Selamat Datang!");
    JLabel lanjutkan = new JLabel("Silakan Masuk Untuk Lanjutkan");
    
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
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     
}
