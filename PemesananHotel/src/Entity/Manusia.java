package Entity;
/**
 *
 * @author gustavian
 */
public class Manusia extends Customer{
     protected String no_telp;
    
    public Manusia(String no_id, String nama, String alamat, String no_telp){
        super(no_id, nama, alamat);
        this.no_telp = no_telp;
    }
    
    public Manusia(){
        
    }

    @Override 
    public String getNo_id(){
        return no_id;
    }
    
    @Override 
    public String getNama(){
        return nama;
    }
    
    @Override 
    public String getAlamat(){
        return alamat;
    }
    
    public String getNo_Telp(){
        return this.no_telp;
    }

    @Override
    public void setNo_id(String no_id) {
        this.no_id = no_id;
    }
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
        public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
}
