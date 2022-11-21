import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Base> list = new ArrayList<>();
        list.add(new Monk());
        list.add(new Peasant());
        list.add(new Robber());
        list.add(new Sniper());
        list.add(new Spearman());
        list.add(new Wizzard());
        list.add(new Xbowman());

        Monk monk00 = new Monk();
        Peasant peasant00 = new Peasant();
        System.out.println("Крестьянин "+ peasant00);
        Robber robber00 = new Robber();
        System.out.println("разбойник" + robber00);
        Sniper sniper00 = new Sniper();
        System.out.println("Снайпер " + sniper00);





        list.forEach(System.out::println);
        monk00.getPlayerId();

        System.out.println("МОНАХ "+monk00);
    }
    
}
