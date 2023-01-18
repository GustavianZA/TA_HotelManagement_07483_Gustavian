package Model;
import Entity.Kamar;
import java.util.ArrayList;
/**
 *
 * @author gustavian
 */
public class KamarModel implements ModelInterfaces{
    private ArrayList<Kamar> DataKamar;
    public ArrayList<Kamar> getDataKamar;
    
    public KamarModel(){
        DataKamar = new ArrayList<>();
        }
    
    public ArrayList<Kamar> getDataKamar(){
        return DataKamar;
        }
    
    @Override
    public void view(){
    
    }
    
    @Override
    public void insert(Object x){
        DataKamar.add((Kamar) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataKamar.set(index ,(Kamar) x);
    }
    
    @Override
    public void delete(int index){
        DataKamar.remove(index);
    }

    public void get_where(int index){
        DataKamar.get(index);
    }    
}
