package Model;

import Entity.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author gustavian
 */
public class Staff {
    public Scanner in = new Scanner(System.in);
    public ArrayList<Manusia> reg = new ArrayList<>();
    public ArrayList<Manusia> log = new ArrayList<>();
    public Manusia login = new Manusia();
    public Manusia regis = new Manusia();
    public String nama, email, user, pass;
    
    public void authKaryawan(){
        regKaryawan();
        loginKaryawan();
    }
    
    public void regKaryawan(){
        System.out.println("------- REGISTRASI -------");
        System.out.println("--------- STAFF ----------");
        System.out.print(" Nama Lengkap   : ");
        nama = in.nextLine();
        regis.setNama(nama);
        System.out.print(" Email          : ");
        email = in.next();
        regis.setEmail(email);
        System.out.print(" Username       : ");
        user = in.next();
        regis.setUser(user);
        System.out.print(" Password       : ");
        pass = in.next();
        regis.setPass(pass);
        in.reset();
        reg.clear();
        reg.add(new Manusia());
    }
    
    public void loginKaryawan(){
        System.out.println("---------- LOGIN ---------");
        System.out.print(" Username       : ");
        user = in.next();
        login.setUser(user);
        System.out.print(" Password       : ");
        pass = in.next();
        login.setPass(pass);
        in.reset();
        log.clear();
        log.add(new Manusia());
        if(login.getUser().equals(regis.getUser()) && login.getPass().equals(regis.getPass())){
            System.out.println("LOGIN BERHASIL !!!");
        }else{
            System.out.println("LOGIN GAGAL !!!");
        }
    }
}
