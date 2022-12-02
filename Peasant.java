import java.util.ArrayList;

public class Peasant extends Base {
    public Peasant(ArrayList<Base> team){
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "");
        super.team=team;
    }
    
    
}
