package Entity;
/**
 *
 * @author gustavian
 */
public class Manusia {
    String nik;
    String nama;
    String user;
    String pass;
    String alamat;
    String noTelp;
    String email;
    
    public Manusia(){
        
    }
    
    public Manusia(String nik, String nama, String user, String pass, String alamat, String noTelp, String email){
        this.nik = nik;
        this.nama = nama;
        this.user = user;
        this.pass = pass;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
}
