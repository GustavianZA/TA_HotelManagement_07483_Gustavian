package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author gustavian
 */
public class StaffGUI {
    JFrame LogReg = new JFrame();
    JLabel top;
    JButton btnkamar,btnmanusia,btnreservasi,btnback,btncheckout;
    
    public StaffGUI(){
        LogReg.setSize(900,700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("----MENU UTAMA----");
        top.setBounds(270,10,700,40);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);
         
        btnkamar = new JButton("List Kamar");
        btnkamar.setBounds(270,150,300,50);
        btnkamar.setBackground(Color.CYAN);
        LogReg.add(btnkamar);
        
        //====== MANUSIA =========        
        btnmanusia = new JButton("Data Manusia");
        btnmanusia.setBounds(270,250,300,50);
        btnmanusia.setBackground(Color.CYAN);
        LogReg.add(btnmanusia);
        
        //====== PEMINJAMAN =========
        btnreservasi = new JButton("Data Check In");
        btnreservasi.setBounds(270,350,300,50);
        btnreservasi.setBackground(Color.CYAN);
        LogReg.add(btnreservasi);
        
        //====== PENGEMBALIAN =======
        btncheckout = new JButton("Data Check Out");
        btncheckout.setBounds(270,450,300,50);
        btncheckout.setBackground(Color.CYAN);
        LogReg.add(btncheckout);
        
        //===== EXIT =====
        btnback = new JButton("EXIT");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        LogReg.add(btnback);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
                GUILogin gui = new GUILogin();
            }
        });
        btnkamar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KamarGUI kamargui = new KamarGUI();
            }
        });
        
        btnmanusia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManusiaGUI manusiagui = new ManusiaGUI();
            }
        });
        
    }
}
