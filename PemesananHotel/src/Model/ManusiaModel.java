package Model;
import Entity.Manusia;
import java.util.ArrayList;
/**
 *
 * @author gustavian
 */
public class ManusiaModel implements ModelInterfaces{
    private ArrayList<Manusia> DataManusia;
    
    public ManusiaModel(){
        DataManusia = new ArrayList<>();
    }
    
    public ArrayList<Manusia> getDataManusia(){
        return DataManusia;
    }
    
    @Override
    public void view(){
    
    }
    
    @Override
    public void insert(Object x){
        DataManusia.add((Manusia) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataManusia.set(index ,(Manusia) x);
    }
    
    @Override
    public void delete(int index){
        DataManusia.remove(index);
    }

    public void get_where(int index){
        DataManusia.get(index);
    }
}
