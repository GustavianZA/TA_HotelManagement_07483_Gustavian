package Entity;
import java.util.Date;
/**
 *
 * @author gustavian
 */
public class Reservasi {
    private String status;
    private Manusia manusia;
    private Kamar kamar;
    private int noPesan,jumlah;
    private Date tglCheckIn,tglCheckOut;
    
    public Reservasi( String status,Manusia manusia,Kamar kamar,int noPesan,int jumlah,Date tglCheckIn, Date tglCheckOut){
        this.status=status;
        this.manusia=manusia;
        this.tglCheckIn=tglCheckIn;
        this.kamar = kamar;
        this.noPesan = noPesan;
        this.jumlah=jumlah;
        this.tglCheckOut = tglCheckOut;
        
    }

    public Reservasi() {

    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Manusia getManusia() {
        return manusia;
    }

    public void setManusia(Manusia manusia) {
        this.manusia = manusia;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public int getNoPesan() {
        return noPesan;
    }

    public void setNoPesan(int noPesan) {
        this.noPesan = noPesan;
    }

    public Date getTglCheckIn() {
        return tglCheckIn;
    }

    public void setTglCheckIn(Date tglCheckIn) {
        this.tglCheckIn = tglCheckIn;
    }

    public Date getTglCheckOut() {
        return tglCheckOut;
    }

    public void setTglCheckOut(Date tglCheckOut) {
        this.tglCheckOut = tglCheckOut;
    }
     
}    
