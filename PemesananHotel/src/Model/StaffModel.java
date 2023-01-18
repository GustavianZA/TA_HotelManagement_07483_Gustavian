package Model;
import Entity.Staff;
import java.util.ArrayList;

/**
 *
 * @author gustavian
 */
public class StaffModel implements ModelInterfaces {
    public ArrayList<Staff> DataStaff;
    
    public StaffModel(){
        DataStaff = new ArrayList<>();
    }
    
    public ArrayList<Staff> getDataStaff(){
        return DataStaff;
    }
    
   @Override
    public void view(){
    
    }
    
    @Override
    public void insert(Object x){
        DataStaff.add((Staff) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataStaff.set(index ,(Staff) x);
    }
    
    @Override
    public void delete(int index){
        DataStaff.remove(index);
    }
    
    public Staff showDataStaff(int index){
        return DataStaff.get(index);
    }

    public int cekStaff(String id, String password){
        int loop = 0;
        for(Staff staffEntity : getDataStaff()){
            if(staffEntity.getNo_id().equals(id) && staffEntity.getPassword().equals(password)){
                break;
            }else{
                  loop++;
            }
        }
        return loop;
    };
}
