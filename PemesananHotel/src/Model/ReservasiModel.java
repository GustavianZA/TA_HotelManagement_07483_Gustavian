package Model;
import Entity.Reservasi;
import java.util.ArrayList;

/**
 *
 * @author gustavian
 */
public class ReservasiModel {
    private ArrayList<Reservasi> DataReservasi;
    
    public ReservasiModel(){
        DataReservasi = new ArrayList<>();
    }
    
    public ArrayList<Reservasi> getDataReservasi(){
        return DataReservasi;
        }
    
    public void insertReservasi(Object x){
        DataReservasi.add((Reservasi) x);
    }

    public void updateReservasi(int index, Reservasi reservasi){
        DataReservasi.set(index, reservasi);
    }
            
}
