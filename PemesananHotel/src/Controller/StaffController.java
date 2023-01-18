package Controller;
import Entity.Staff;
import Model.StaffModel;
import java.util.ArrayList;

/**
 *
 * @author gustavian
 */
public class StaffController {
    public StaffModel staff_m = new StaffModel();
    int loginStaff = 0;
     
    public StaffController(){
    
    }
    
    public ArrayList<Staff> view(){
        return staff_m.getDataStaff();
        }
  
    public void insert(Staff staff){
        staff_m.insert(staff);
    }

    public void update(int index, Staff staff){
        staff_m.update(index, staff);
    }

    public void delete(int index){
        staff_m.delete(index);
    }
    
     public void dataStaff(){
        String no_id [] = {"06","2021","07483"};
        String nama [] = {"Gustavian","Zamrud","Arisandi"};
        String alamat [] = {"Surabaya","Madura","Sidoarjo"};
        String password [] = {"123","123","123"};
       
        for(int i = 0; i<nama.length; i++){
        staff_m.insert(new Staff(no_id[i],nama[i],alamat[i],
                password[i]));
        }
    }
     
     public void cekStaff(String id, String password) {
        loginStaff = staff_m.cekStaff(id, password);
     }
     
     public Staff staffEntity(){
        return staff_m.showDataStaff(loginStaff);
    }
//     public Staff staffEntity(){
//        return staff_m.showDataAslab(indexLogin);
//    }
}
