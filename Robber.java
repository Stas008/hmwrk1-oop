import java.util.ArrayList;

public class Robber extends Base {
    public Robber(ArrayList<Base> team){
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "");
        super.team=team;
    }
    
}
