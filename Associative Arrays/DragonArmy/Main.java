package AssociativeArrays.DragonArmy;

import java.util.*;

class DragonsData {

    private final int damage;
    private final int health;
    private final int armor;

    public DragonsData(int damage, int health, int armor) {
        this.damage = damage;
        this.health = health;
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDragons = Integer.parseInt(scanner.nextLine());

        Map<String, DragonsData> dragonStats = new LinkedHashMap<>();

        for (int i = 0; i < numberOfDragons; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String type = tokens[0];
            String name = tokens[1];
            int damage = 45;
            int health = 250;
            int armor = 10;

            if (!tokens[2].equals("null")) {
                damage = Integer.parseInt(tokens[2]);
            }
            if (!tokens[3].equals("null")) {
                health = Integer.parseInt(tokens[3]);
            }
            if (!tokens[4].equals("null")) {
                armor = Integer.parseInt(tokens[4]);
            }

            String currentDragon = type + " - " + name;

            if (!dragonStats.containsKey(currentDragon)) {
                dragonStats.put(currentDragon, new DragonsData(damage, health, armor));
            } else {
                dragonStats.put(currentDragon, new DragonsData(damage, health, armor));
            }
        }
        Map<String, Map<String, DragonsData>> typeSortedDragons = new LinkedHashMap<>();

        for (Map.Entry<String, DragonsData> entry : dragonStats.entrySet()) {
            String dragonType = entry.getKey().split(" - ")[0];
            String dragonName = entry.getKey().split(" - ")[1];

            if (!typeSortedDragons.containsKey(dragonType)) {
                typeSortedDragons.put(dragonType, new HashMap<>());
                typeSortedDragons.get(dragonType).put(dragonName, entry.getValue());
            } else {
                typeSortedDragons.get(dragonType).put(dragonName, entry.getValue());
            }
        }

        for (Map.Entry<String, Map<String, DragonsData>> entry : typeSortedDragons.entrySet()) {

            double avgDamage = 0;
            double avgHealth = 0;
            double avgArmor = 0;

            Map<String, DragonsData> currentDragons = entry.getValue();
            for (Map.Entry<String, DragonsData> entries : currentDragons.entrySet()) {
                avgDamage += entries.getValue().getDamage();
                avgHealth += entries.getValue().getHealth();
                avgArmor += entries.getValue().getArmor();
            }

            avgDamage /= entry.getValue().size();
            avgHealth /= entry.getValue().size();
            avgArmor /= entry.getValue().size();

            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", entry.getKey(), avgDamage, avgHealth, avgArmor);

            currentDragons.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(key -> System.out.printf("" +
                            "-%s -> damage: %d, health: %d, armor: %d\n", key.getKey(), key.getValue().getDamage(),
                    key.getValue().getHealth(), key.getValue().getArmor()));
        }
    }

}

