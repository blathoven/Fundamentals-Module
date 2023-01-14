package RegularExpressions;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PlanetData {

    private final int population;
    private final String attackType;
    private final int soldierCount;

    public PlanetData(int population, String attackType, int soldierCount) {

        this.population = population;
        this.attackType = attackType;
        this.soldierCount = soldierCount;

    }

    public int getPopulation() {
        return population;
    }

    public int getSoldierCount() {
        return soldierCount;
    }

    public String getAttackType() {
        return attackType;
    }
}

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[^@\\-!:>]*@(?<planetName>[A-Za-z]+)[^@\\-!:>]" +
                "*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]?->(?<soldierCount>\\d+)");

        int inputCount = Integer.parseInt(scanner.nextLine());

        Map<String, PlanetData> attackedPlanets = new TreeMap<>(Comparator.reverseOrder());
        Map<String, PlanetData> destroyedPlanets = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < inputCount; i++) {

            String currentInput = scanner.nextLine();

            int lettersCount = 0;
            for (int j = 0; j < currentInput.length(); j++) {

                char thisChar = currentInput.charAt(j);

                if (thisChar == 's' || thisChar == 't' || thisChar == 'a' || thisChar == 'r'
                || thisChar == 'S' || thisChar == 'T' || thisChar == 'A' || thisChar == 'R') {
                    lettersCount++;
                }
            }

            StringBuilder decryptedMessage = new StringBuilder();

            for (int j = 0; j < currentInput.length(); j++) {
                char modifiedChar = (char) (currentInput.charAt(j) - lettersCount);
                decryptedMessage.append(modifiedChar);
            }

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {

                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                PlanetData planetData = new PlanetData(population, attackType, soldierCount);

                if (attackType.equals("A")) {
                    attackedPlanets.put(planetName, planetData);
                } else {
                    destroyedPlanets.put(planetName, planetData);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        for (Map.Entry<String, PlanetData> entry : attackedPlanets.entrySet()) {
            System.out.println("-> " + entry.getKey());
        }
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        for (Map.Entry<String, PlanetData> entry : destroyedPlanets.entrySet()) {
            System.out.println("-> " + entry.getKey());
        }
    }
}
