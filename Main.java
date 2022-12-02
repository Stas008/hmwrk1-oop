import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Base> whiteTeam = new ArrayList<>();
        for (int i=0; i<=10; i++){
            Random rand = new Random();
            int randInt=rand.nextInt(4);
            switch(randInt){
                case 0 -> whiteTeam.add(new Monk(whiteTeam));
                case 1 -> whiteTeam.add(new Peasant(whiteTeam));
                case 2 -> whiteTeam.add(new Robber(whiteTeam));
                default -> whiteTeam.add(new Sniper(whiteTeam));
            }


        }

        ArrayList<Base> blackTeam = new ArrayList<>();
        for (int i=0; i<=10; i++){
            Random rand = new Random();
            int randInt=rand.nextInt(4);
            switch(randInt){
                case 0 -> blackTeam.add(new Peasant(blackTeam));
                case 1 -> blackTeam.add(new Spearman(blackTeam));
                case 2 -> blackTeam.add(new Xbowman(blackTeam));
                default -> blackTeam.add(new Wizzard(blackTeam));
            }

        }



        // list.add(new Monk());
        // list.add(new Peasant());
        // list.add(new Robber());
        // list.add(new Sniper());
        // list.add(new Spearman());
        // list.add(new Wizzard());
        // list.add(new Xbowman());

        // Monk monk00 = new Monk();
        // Peasant peasant00 = new Peasant();
        // System.out.println("Крестьянин "+ peasant00);
        // Robber robber00 = new Robber();
        // System.out.println("разбойник" + robber00);
        // Sniper sniper00 = new Sniper();
        // System.out.println("Снайпер " + sniper00);





        whiteTeam.forEach(System.out::println);
        System.out.println();
        blackTeam.forEach(System.out::println);
        


    }
    
}
