package Entity;

/**
 *
 * @author gustavian
 */
public class Staff extends Customer {  
    private String password;
    
    public Staff(String no_id, String nama, String alamat, String password){
        super(no_id, nama, alamat);
        this.password = password;
    }
   
    @Override 
    public String getNo_id(){
        return no_id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNo_id(String no_id) {
        this.no_id = no_id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override 
    public String getNama(){
        return nama;
    }
    @Override 
    public String getAlamat(){
        return alamat;
    }
    public String getPassword(){
        return this.password;
    } 
}
