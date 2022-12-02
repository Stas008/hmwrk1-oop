import java.util.ArrayList;

//копейщик

public class Spearman extends Base {
    public Spearman(ArrayList<Base> team){
        super(4, 5, 0, new int[]{1,3}, 10, 4, false, false, "");
        super.team=team;
    }
    
}
