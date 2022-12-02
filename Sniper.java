import java.util.ArrayList;

public class Sniper extends Base {
    public Sniper(ArrayList<Base> team){
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "");
        super.team=team;
    }
    
}
