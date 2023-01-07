package Model;

import Entity.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author gustavian
 */
public class abouthCRUD {
    public Scanner in = new Scanner(System.in);
    public ArrayList<Manusia> cust = new ArrayList<>();
    public Kamar jt = new Kamar();
    public Pesan psn = new Pesan();
    
    public void createCust(){
        System.out.print(" ID Pemesan        : ");
        String nik = in.next();
        System.out.print(" Nama Pemesan      : ");
        String nama = in.next();
        System.out.print(" Pilih Jenis Kamar : ");
        psn.addJenisKamar();
        System.out.print(" Pilih  No.Kamar   : ");
        String seat = in.next();
        cust.add(new Manusia());
        
        System.out.println("");
        System.out.println(" ---------- CETAK RESERVASI ----------- ");
        System.out.println(" ID           : " + nik);
        System.out.println(" Nama         : " + nama);
        System.out.println(" Jenis Kamar  : " + jt.getJenisKamar());
        System.out.println(" Harga Kamar  : " + psn.total);
        System.out.println(" No. Kamar    :" + seat);
    }
    
    public void updateCust(){
        
    }
    
    public void showCust(){
        
    }
    
    public void deleteCust(){
        
    }
}
