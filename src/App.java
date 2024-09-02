import java.util.ArrayList;
import java.util.List;

import TallestMountain.Formation;
import TallestMountain.Mesa;
import TallestMountain.Mountain;

public class App {

    private static ArrayList<Formation> Formations = new ArrayList<>(List.of(
        new Mountain(5000, "Old Man Mountain"),
        new Mesa(3565, "Devil's Tower", 20),
        new Mountain(2300, "Heartbreak Hill"),
        new Mountain(5350, "Grand Ridge"),
        new Mesa(2750, "Old Butte", 5),
        new Mesa(4779, "Naranja Grande", 350)
    ));

    public static void main(String[] args) throws Exception {
        showInfo(Formations);
        System.out.println("And this is the tallest formation:");
        System.out.println(findTallest(Formations).getInfo());

        Formations.add(new Mesa(7777, "God's Table", 100));
        System.out.println("New tallest formation:");
        System.out.println(findTallest(Formations).getInfo());
        
        Formations.add(3, new Mountain(1000000, "Skybreaker"));
        System.out.println("New tallest formation:");
        System.out.println(findTallest(Formations).getInfo());
        showInfo(Formations);

        System.out.println("And the tallest mesa is:");
        System.out.println(findTallestMesa(Formations).getInfo());
    }

    public static void showInfo(List<Formation> formations) {
        for (Formation formation : formations) {
            System.out.println(formation.getInfo());
        }
    }

    public static Formation findTallest(List<Formation> formations) {
        Formation tallest = null;
        for (Formation formation : formations) {
            if (tallest == null || tallest.getHeight() < formation.getHeight()) {
                tallest = formation;
            }
        }
        return tallest;
    }

    public static Mesa findTallestMesa(List<Formation> formations) {
        Mesa tallest = null;
        for (Formation formation : formations) {
            if (formation instanceof Mesa && (tallest == null || tallest.getHeight() < formation.getHeight()))
                tallest = (Mesa)formation;
        }
        return tallest;
    }
}
