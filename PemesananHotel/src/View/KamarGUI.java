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
public class KamarGUI {
    private static KamarController kamar_c = new KamarController();
    JFrame Kamar = new JFrame();
    JLabel top,tambahkamar,labelkodekamar,labeljenis,labeltipe,labeltahun,labeljumlah,labelKodekamar;
    JTextField textkodekamar,textjenis,texttipe,texttahun,textjumlah,hapustext;
    JButton btneditkamar,btnhapus,btnback,btntambahkamar; 
    JTable tabelkamar = new JTable();
    JScrollPane scrolkamar = new JScrollPane(tabelkamar);
    int index;
     
    public KamarGUI(){
        
        Kamar.setSize(900,700);
        Kamar.setLayout(null);
        Kamar.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("PILIHAN KAMAR");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Kamar.add(top);
            
        scrolkamar.setBounds(300,180,600,270);
        tabelkamar.setModel(kamar_c.listkamar());
        Kamar.add(scrolkamar);
        
        labelkodekamar = new JLabel("NOMOR KAMAR");
        labelkodekamar.setBounds(30,150,100,30);
        Kamar.add(labelkodekamar);
        
        textkodekamar = new JTextField();
        textkodekamar.setBounds(30,180,200,30);
        Kamar.add(textkodekamar);
                
        labeljenis = new JLabel("JENIS KAMAR");
        labeljenis.setBounds(30,210,100,30);
        Kamar.add(labeljenis);
        
        textjenis = new JTextField();
        textjenis.setBounds(30,240,200,30);
        Kamar.add(textjenis);
        
        labeltipe = new JLabel("TIPE KAMAR");
        labeltipe.setBounds(30,270,100,30);
        Kamar.add(labeltipe);
        
        texttipe = new JTextField();
        texttipe.setBounds(30,300,200,30);
        Kamar.add(texttipe);
        
        labeltahun = new JLabel("TAHUN");
        labeltahun.setBounds(30,330,200,30);
        Kamar.add(labeltahun);
        
        texttahun = new JTextField();
        texttahun.setBounds(30,360,200,30);
        Kamar.add(texttahun);
        
        labeljumlah = new JLabel("JUMLAH");
        labeljumlah.setBounds(30,390,200,30);
        Kamar.add(labeljumlah);
        
        textjumlah = new JTextField();
        textjumlah.setBounds(30,420,200,30);
        Kamar.add(textjumlah);
        
        btntambahkamar = new JButton("Tambah Kamar");
        btntambahkamar.setBounds(50,470,150,30);
        Kamar.add(btntambahkamar);
        
        btneditkamar = new JButton("Edit Kamar");
        btneditkamar.setBounds(50,510,150,30);
        Kamar.add(btneditkamar);
        
        btnhapus = new JButton("Hapus Kamar");
        btnhapus.setBounds(50,550,150,30);
        Kamar.add(btnhapus);              
               
        btnback = new JButton("back");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        Kamar.add(btnback);
               
        Kamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Kamar.setVisible(true);
        Kamar.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Kamar.dispose();
                StaffGUI staff = new StaffGUI();
            }
        });
        
        btntambahkamar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String kodekamar = textkodekamar.getText();
                    String jenis =  textjenis.getText();
                    String tipe = texttipe.getText();
                    String tahun = texttahun.getText();
                    int jumlah = Integer.valueOf(textjumlah.getText());
                    allobjcontroller.kamar.insert(kodekamar,jenis,tipe,tahun,jumlah);
                    JOptionPane.showMessageDialog(null,"Pesan Kamar Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelkamar.setModel(allobjcontroller.kamar.listkamar());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
        
        btneditkamar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String kodekamar = textkodekamar.getText();
                    String jenis =  textjenis.getText();
                    String tipe = texttipe.getText();
                    String tahun = texttahun.getText();
                    int jumlah = Integer.valueOf(textjumlah.getText());
                    allobjcontroller.kamar.update(index,kodekamar,jenis,tipe,tahun,jumlah);
                    JOptionPane.showMessageDialog(null,"Edit Kamar Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelkamar.setModel(allobjcontroller.kamar.listkamar());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
        tabelkamar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelkamar.getSelectedRow();
                index=i;
                textkodekamar.setText(allobjcontroller.kamar.listkamar().getValueAt(i, 0).toString());
                textjenis.setText(allobjcontroller.kamar.listkamar().getValueAt(i, 1).toString());
                texttipe.setText(allobjcontroller.kamar.listkamar().getValueAt(i, 2).toString());
                texttahun.setText(allobjcontroller.kamar.listkamar().getValueAt(i, 3).toString());
                textjumlah.setText(allobjcontroller.kamar.listkamar().getValueAt(i, 4).toString()); 
            }            
        });
        
        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    allobjcontroller.kamar.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus Kamar Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelkamar.setModel(allobjcontroller.kamar.listkamar());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
    }
    void reset(){
        textkodekamar.setText(null);//ISI
        textjenis.setText(null);
        texttipe.setText(null);
        texttahun.setText(null);
        textjumlah.setText(null);
    }
}
