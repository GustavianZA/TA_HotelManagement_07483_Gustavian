package Controller;
import Entity.Kamar;
import Model.KamarModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.allobjcontroller;
/**
 *
 * @author gustavian
 */
public class KamarController {
    public KamarModel kamar_m = new KamarModel();

    public KamarController(){
        
    }
    
    public ArrayList<Kamar> view(){
        return kamar_m.getDataKamar();
        }

    public void insert(String kodekamar, String jenis, String tipe, String tahun, int jumlah){
        Kamar kamar = new Kamar();
        kamar.setKode_kamar(kodekamar);
        kamar.setJenis_kamar(jenis);
        kamar.setTipe_kamar(tipe);
        kamar.setTipe_kamar(tipe);
        kamar.setTahun(tahun);
        kamar.setJumlah(jumlah);
        kamar_m.insert(kamar);
    }
    
    public void update(int index,String kodekamar, String jenis, String tipe, String tahun, int jumlah){
        Kamar kamar = new Kamar();
        kamar.setKode_kamar(kodekamar);
        kamar.setJenis_kamar(jenis);
        kamar.setTipe_kamar (tipe);
        kamar.setTipe_kamar(tipe);
        kamar.setTahun(tahun);
        kamar.setJumlah(jumlah);
        kamar_m.update(index,kamar);
    }
    
    public void delete(int index){
        kamar_m.delete(index);
    }
    
    public DefaultTableModel listkamar(){
    DefaultTableModel dtmlistkamar = new DefaultTableModel();
    Object[] kolom ={"Kode Kamar","Jenis Kamar","Tipe Kamar","Tahun","Jumlah"};
    dtmlistkamar.setColumnIdentifiers(kolom);
    int size = allobjcontroller.kamar.view().size();
    for (int i=0; i<size; i++){
        Object [] kamar =new Object[7];
        kamar[0] = allobjcontroller.kamar.view().get(i).getKodeKamar();
        kamar[1] = allobjcontroller.kamar.view().get(i).getJenis();
        kamar[2] = allobjcontroller.kamar.view().get(i).getTipe();
        kamar[3] = allobjcontroller.kamar.view().get(i).getTahun();
        kamar[4] = allobjcontroller.kamar.view().get(i).getJumlah();
        dtmlistkamar.addRow(kamar);
    }
    return dtmlistkamar;
}
    
    public int cekKamar(String idKamar){
    int keterangan = -1;
        if(kamar_m.getDataKamar().size()>0){
            for(int i=0;i<kamar_m.getDataKamar().size();i++){
             if(idKamar.equals(kamar_m.getDataKamar().get(i).getKodeKamar())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public Kamar showDaftarKamar(int index){
        return kamar_m.getDataKamar.get(index);
    }
}
