package pemesananhotel;

import Entity.*;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author gustavian
 */
public class PemesananHotel {
    public static Scanner in = new Scanner(System.in);
    public static Pesan psn = new Pesan();
    public static Staff st = new Staff();
    public static abouthCRUD crud = new abouthCRUD();
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SELAMAT DATANG DI HOTEL BLINK ");
        System.out.println(" 1. Login");
        System.out.println(" 2. Registrasi ");
        System.out.print("Pilih : ");
        int pil = in.nextInt();
        switch(pil){
            case 1 :
                st.loginKaryawan();
                break;
            case 2 :
                st.authKaryawan();
                
                //menu
                crud.createCust();
                break;
                
        }
    }
}
