package Model;

import Entity.Kamar;
import Entity.Manusia;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author april
 */
public class Pesan {
    public Kamar jt = new Kamar();
    public ArrayList<Kamar> tik = new ArrayList<>();
    public float hrg, total;
    public int pil, pil2;
    public Scanner in = new Scanner(System.in);
    
    public void viewMenu(){
        System.out.println("\n");
        System.out.println("------------- NAMA KAMAR ------------");
        System.out.println(" NO         NAMA           HARGA");
        System.out.println(" 1      Melati           Rp.5000000");
        System.out.println(" 2      Anggrek          Rp.2500000");
        System.out.println(" 3      Raflesia         Rp.5000000");
        System.out.println(" 4      Mawar            Rp.1500000");
        System.out.println(" 5      Matahari         Rp.500000");
        System.out.println("-------------------------------------");
    }
    public void viewKamar(){
        System.out.println("\n");
        System.out.println("------- JENIS KAMAR --------");
        System.out.println(" NO         JENIS           ");
        System.out.println(" 1      Standard Room       ");
        System.out.println(" 2.     Superior Room       ");
        System.out.println(" 3.     Deluxe Room         ");
        System.out.println(" 4.     Double Room         ");
        System.out.println(" 5.     Single Room         ");
        System.out.println("----------------------------");
    }
    
    public void addKamar(){
        viewMenu();
        pil = in.nextInt();
        
        if(pil == 1){
            System.out.println("Standard Room");
            hrg = 1000000;
            jt.setHrgKamar(hrg);
        }else if(pil == 2){
            System.out.println("Superior Room");
            hrg = 1500000;
            jt.setHrgKamar(hrg);
        }else if(pil == 3){
            System.out.println("Deluxe Room");
            hrg = 2000000;
            jt.setHrgKamar(hrg);
        }else if(pil == 4){
            System.out.println("Double Room");
            hrg = 2500000;
            jt.setHrgKamar(hrg);
        }else if(pil == 5){
            System.out.println("Single Room");
            hrg = 800000;
            jt.setHrgKamar(hrg);
        }else{
            System.out.println("Jenis Kamar Tidak Tersedia! ");
        }
        
    }
    
    public void addJenisKamar(){
        viewKamar();
        pil2 = in.nextInt();
        jt.setJenisKamar(pil2);
        
        if(pil2 == 1){
            System.out.println(" Standard Room ");
            System.out.println("---------------");
            total = hrg + 0;
        }else if(pil2 == 2){
            System.out.println(" Superior Room ");
            System.out.println("---------------");
            total = hrg + 0;
        }else if(pil2 == 3){
            System.out.println(" Deluxe Room ");
            System.out.println("-------------");
            total = hrg + 0;
        }else if(pil2 == 4){
            System.out.println(" Double Room ");
            System.out.println("-------------");
            total = jt.getHrgKamar() + 200000;
        }else if(pil2 == 5){
            System.out.println(" Single Room ");
            System.out.println("-------------");
            total = jt.getHrgKamar() + 100000;
        }else{
            System.out.println(" Jenis Kamar Tidak Tersedia! ");
        }
    }
}
