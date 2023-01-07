package Entity;
/**
 *
 * @author gustavian
 */
public class Kamar {
    String noKamar;
    int jenisKamar;
    String seat;
    float hrgKamar;
    
    public Kamar(){
        
    }
    
    public Kamar(String noKamar, int jenisKamar, String seat, float hrgKamar){
        this.noKamar = noKamar;
        this.jenisKamar = jenisKamar;
        this.seat = seat;
        this.hrgKamar = hrgKamar;
    }

    public String getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    public int getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(int jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public float getHrgKamar() {
        return hrgKamar;
    }

    public void setHrgKamar(float hrgKamar) {
        this.hrgKamar = hrgKamar;
    }

}
