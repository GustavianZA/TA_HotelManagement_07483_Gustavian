package Entity;
/**
 *
 * @author gustavian
 */
public class Kamar {
    private String kode_kamar, jenis_kamar, tipe_kamar , tahun;
    private int jumlah;
    
    public Kamar(String kode_kamar, String jenis_kamar, String tipe_kamar, String tahun, int jumlah){
        this.kode_kamar = kode_kamar;
        this.jenis_kamar = jenis_kamar;
        this.tipe_kamar = tipe_kamar;
        this.tahun = tahun;
        this.jumlah=jumlah;
    }

    public void setKode_kamar(String kode_kamar) {
        this.kode_kamar = kode_kamar;
    }

    public void setJenis_kamar(String jenis_kamar) {
        this.jenis_kamar = jenis_kamar;
    }

    public void setTipe_kamar(String tipe_kamar) {
        this.tipe_kamar = tipe_kamar;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public Kamar(){
    
    }
    
    public String getKodeKamar(){
        return this.kode_kamar;
    }
    
   public String getJenis(){
        return this.jenis_kamar;
    }
    
    public String getTipe(){
        return this.tipe_kamar;
    }
    
    public String getTahun(){
        return this.tahun;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }
}
