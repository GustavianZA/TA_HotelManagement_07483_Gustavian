package View;
import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author gustavian
 */
public class ManusiaGUI {
    private static ManusiaController manusia_c = new ManusiaController();
    JFrame Manusia = new JFrame();
    JLabel top,labelid,labelnama,labelalamat,labelnotelp,labelidmanusia;
    JTextField textid,textnama,textalamat,textnotelp,hapustext;
    JButton btnhapus,btnback,btntambahmanusia; 
    JTable tabelmanusia = new JTable();
    JScrollPane scrolmanusia = new JScrollPane(tabelmanusia);
    int index;
     
    public ManusiaGUI(){
        
        Manusia.setSize(900,700);
        Manusia.setLayout(null);
        Manusia.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA PRIBADI");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Manusia.add(top);
        
        // TABEL
        scrolmanusia.setBounds(300,180,570,270);
        tabelmanusia.setModel(manusia_c.listmanusia());
        Manusia.add(scrolmanusia);
        
        labelid = new JLabel("ID Pemesan");
        labelid.setBounds(30,150,100,30);
        Manusia.add(labelid);
        
        textid = new JTextField();
        textid.setBounds(30,180,200,30);
        Manusia.add(textid);
                
        labelnama = new JLabel("Nama");
        labelnama.setBounds(30,210,100,30);
        Manusia.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(30,240,200,30);
        Manusia.add(textnama);
        
        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(30,270,100,30);
        Manusia.add(labelalamat);
        
        textalamat = new JTextField();
        textalamat.setBounds(30,300,200,30);
        Manusia.add(textalamat);
        
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(30,330,200,30);
        Manusia.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(30,360,200,30);
        Manusia.add(textnotelp);
        
        btntambahmanusia = new JButton("Tambah Pemesan");
        btntambahmanusia.setBounds(30,420,200,30);
        Manusia.add(btntambahmanusia);
        
        btnhapus = new JButton("Hapus Pemesan");
        btnhapus.setBounds(50,460,150,30);
        Manusia.add(btnhapus);
                               
        btnback = new JButton("back");
        btnback.setBounds(30, 570, 100, 30);
        btnback.setBackground(Color.red);
        Manusia.add(btnback);
               
        Manusia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Manusia.setVisible(true);
        Manusia.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manusia.dispose();
                ManusiaGUI manusia = new ManusiaGUI();
            }
        });
        btntambahmanusia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  try{
                      String id = textid.getText();
                      String nama = textnama.getText();
                      String alamat = textalamat.getText();
                      String notelp = textnotelp.getText();
                      allobjcontroller.manusia.insert(id, nama, alamat, notelp);
                      tabelmanusia.setModel(allobjcontroller.manusia.listmanusia());
                      JOptionPane.showMessageDialog(null,"Input Pemesan Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                  }catch(Exception exception){
                  JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }  
            }
        });
        tabelmanusia.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelmanusia.getSelectedRow();
                index=i;
                textid.setText(allobjcontroller.manusia.listmanusia().getValueAt(i, 0).toString());
                textnama.setText(allobjcontroller.manusia.listmanusia().getValueAt(i, 1).toString());
                textalamat.setText(allobjcontroller.manusia.listmanusia().getValueAt(i, 2).toString());
                textnotelp.setText(allobjcontroller.manusia.listmanusia().getValueAt(i, 3).toString());
            }            
        });
                
        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    allobjcontroller.manusia.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelmanusia.setModel(allobjcontroller.manusia.listmanusia());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    void reset(){
        textid.setText(null);
        textnama.setText(null);
        textalamat.setText(null);
        textnotelp.setText(null);
    }
}
