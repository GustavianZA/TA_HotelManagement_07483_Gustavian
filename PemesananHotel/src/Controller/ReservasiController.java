package Controller;
import Entity.Manusia;
import Entity.Kamar;
import Entity.Reservasi;
import Model.ReservasiModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import View.allobjcontroller;

/**
 *
 * @author gustavian
 */
public class ReservasiController {
    ReservasiModel reservasi_m  = new ReservasiModel();
    
    public ReservasiController(){
    
    }
    
    public ArrayList<Reservasi> view(){
        return reservasi_m.getDataReservasi();
    }
    
    public void insert(String status ,Manusia manusia ,Kamar kamar ,int noPesan, 
            int jumlah,Date tglCheckIn, Date tglCheckOut){
        Reservasi reservasi = new Reservasi();
        reservasi.setStatus(status);
        reservasi.setManusia(manusia);
        reservasi.setKamar(kamar);
        reservasi.setNoPesan(noPesan);
        reservasi.setJumlah(jumlah);
        reservasi.setTglCheckIn(tglCheckIn);
        reservasi.setTglCheckOut(tglCheckOut);
        reservasi_m.insertReservasi(reservasi);
    }
    
    public DefaultTableModel listreservasi(){
    DefaultTableModel dtmlistreservasi = new DefaultTableModel();
    Object[] kolom ={"No Reservasi","Nama","Kamar","Jumlah","Tgl Check In","Tgl Check Out","Status"};
    dtmlistreservasi.setColumnIdentifiers(kolom);
    
    int size = allobjcontroller.reservasi.view().size();
    for (int i=0; i<size; i++){
        Object [] reservasi =new Object[10];
        reservasi[0] = allobjcontroller.reservasi.view().get(i).getNoPesan();
        reservasi[1] = allobjcontroller.reservasi.view().get(i).getManusia();
        reservasi[2] = allobjcontroller.reservasi.view().get(i).getKamar();
        reservasi[3] = allobjcontroller.reservasi.view().get(i).getJumlah();
        reservasi[4] = allobjcontroller.reservasi.view().get(i).getTglCheckIn();
        reservasi[5] = allobjcontroller.reservasi.view().get(i).getTglCheckOut();
        reservasi[6] = allobjcontroller.reservasi.view().get(i).getStatus();
        dtmlistreservasi.addRow(reservasi);
    }
    return dtmlistreservasi;
    }
    
    public int cekReservasi(String idreservasi){
    int keterangan = -1;
        if(reservasi_m.getDataReservasi().size()>0){
            for(int i=0;i<reservasi_m.getDataReservasi().size();i++){
             if(idreservasi.equals(reservasi_m.getDataReservasi().get(i).getNoPesan())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    
    public Reservasi showDaftarreservasi(int index){
        return reservasi_m.getDataReservasi().get(index);
    }
}
