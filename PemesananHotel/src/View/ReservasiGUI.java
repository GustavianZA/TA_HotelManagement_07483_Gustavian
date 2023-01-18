package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.*;
import Entity.JenisManusia;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date; 

/**
 *
 * @author gustavian
 */
public class ReservasiGUI {
    private static ReservasiController reservasi_c = new ReservasiController();
    private static JenisManusia jenismanusia = new JenisManusia();
    private static String [] statusReservasi = {"Belum Dikembalikan", "Dikembalikan"};
    
    JFrame Reservasi = new JFrame();
    JLabel top,labelidreservasi,labelidkamar;
    JTable tabelreservasi = new JTable();
    JScrollPane scrolreservasi = new JScrollPane();
    JButton btnback;
    
    public ReservasiGUI(){
        Reservasi.setSize(900,700);
        Reservasi.setLayout(null);
        Reservasi.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA RESERVASI");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Reservasi.add(top);
            
        scrolreservasi.setBounds(100,180,650,270);
        tabelreservasi.setModel(reservasi_c.listreservasi());
        Reservasi.add(scrolreservasi);
        
        labelidreservasi = new JLabel();
        labelidreservasi.setBounds(30,250,100,30);
        Reservasi.add(labelidreservasi);
        
        btnback = new JButton("back");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        Reservasi.add(btnback);
               
        Reservasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Reservasi.setVisible(true);
        Reservasi.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reservasi.dispose();
                StaffGUI staff = new StaffGUI();
            }
        });
    }
}
