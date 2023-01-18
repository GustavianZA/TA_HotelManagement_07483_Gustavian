package Controller;
import Entity.Manusia;
import Model.ManusiaModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.*;

/**
 *
 * @author gustavian
 */
public class ManusiaController {
        public ManusiaModel manusia_m = new ManusiaModel();

    public ManusiaController(){
        
    }
        
    public ArrayList<Manusia> view(){
        return manusia_m.getDataManusia();
        }

    public void insert(String id,String nama,String alamat,String notelp){
            Manusia manusia = new Manusia ();
            manusia.setNo_id(id);
            manusia.setNama(nama);
            manusia.setAlamat(alamat);
            manusia.setNo_telp(notelp);
            manusia_m.insert(manusia);
    }

    public void delete(int index){
        manusia_m.delete(index);
    }
    
    public DefaultTableModel listmanusia(){
        DefaultTableModel dtmdaftarmanusia = new DefaultTableModel();
        Object[] kolom = {"No ID","Nama","Alamat","No Telepon"};
        dtmdaftarmanusia.setColumnIdentifiers(kolom);
        
        int size = allobjcontroller.manusia.view().size();
         for (int i=0; i<size; i++){
             Object [] data = new Object[8];
            data[0] = allobjcontroller.manusia.view().get(i).getNo_id();
                data[1] = allobjcontroller.manusia.view().get(i).getNama();
                data[2] = allobjcontroller.manusia.view().get(i).getAlamat();
                data[3] = allobjcontroller.manusia.view().get(i).getNo_Telp();

                dtmdaftarmanusia.addRow(data);

         }
            return dtmdaftarmanusia;
    }
    
    public int cekManusia(String idManusia){
        int keterangan = -1;
        if(manusia_m.getDataManusia().size()>0){
            for(int i=0;i<manusia_m.getDataManusia().size();i++){
             if(idManusia.equals(manusia_m.getDataManusia().get(i).getNo_id())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public Manusia showDaftarManusia(int index){
        return manusia_m.getDataManusia().get(index);
    }
}
