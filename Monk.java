import java.util.ArrayList;


public class Monk extends Base implements BaseInterface {
    public Monk(ArrayList<Base> team){
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, false, true, "");
        super.team=team;
    }
    boolean magic;
    
    public int findWeak(ArrayList<Base> team){
        double result=100;
        int ind=0;
        for (int i=0; i<team.size(); i++){
            if (team.get(i).getHealth()<result){
                result=team.get(i).getHealth();
                ind=i;
            }

        }
        return ind;

    }
    @Override
    public void step(ArrayList<Base> team){
        double newHealth;
        newHealth=team.get(findWeak(team)).getHealth()+getDamage()[0];
        team.set(findWeak(team), null).setHealth(newHealth);

    }

    @Override
    public String getInfo() {

        return super.getInfo()+" magician "+magic;
    }
}
