import java.util.ArrayList;

//арбалетчик
public class Xbowman extends Base {
    public Xbowman(ArrayList<Base> team){
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "");
        super.team=team;
    }
    
}
