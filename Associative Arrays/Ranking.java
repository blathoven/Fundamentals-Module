package AssociativeArrays;

import java.util.*;

public class RankingIMPORTANT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lines = scanner.nextLine();

        Map<String, String> contestsData = new LinkedHashMap<>();
        while (!lines.equals("end of contests")) {
            String[] tokens = lines.split(":");
            String contest = tokens[0];
            String password = tokens[1];

            contestsData.put(contest, password);
            lines = scanner.nextLine();
        }

        String secondLine = scanner.nextLine();

        Map<String, Map<String, Integer>> candidatesContestAndPoints = new TreeMap<>();
        while (!secondLine.equals("end of submissions")) {
            String[] tokens = secondLine.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if (contestsData.containsKey(contest) && contestsData.get(contest).equals(password)) {

                if (!candidatesContestAndPoints.containsKey(username)) {
                    candidatesContestAndPoints.put(username, new TreeMap<>());
                    Map<String, Integer> innerMap = candidatesContestAndPoints.get(username);
                    innerMap.put(contest, points);
                } else {
                    boolean found = false;
                    for (Map.Entry<String, Map<String, Integer>> entry : candidatesContestAndPoints.entrySet()) {
                        if (entry.getValue().containsKey(contest)) {
                            if (entry.getKey().equals(username)) {
                                found = true;
                                break;
                            }
                        }
                    }
                    if (found) {
                        if (candidatesContestAndPoints.get(username).get(contest) < points) {
                            candidatesContestAndPoints.get(username).put(contest, points);
                        }
                    } else {
                        candidatesContestAndPoints.get(username).put(contest, points);
                    }
                }
            }
            secondLine = scanner.nextLine();
        }
        int highestPoints = 0;
        String participant = null;
        for (Map.Entry<String, Map<String, Integer>> entry : candidatesContestAndPoints.entrySet()) {
            int currentParticipantPoints = 0;
            for (int points : entry.getValue().values()) {
                currentParticipantPoints += points;

            }
            if (currentParticipantPoints > highestPoints) {
                highestPoints = currentParticipantPoints;
                participant = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.\nRanking:\n", participant, highestPoints);
        for (Map.Entry<String, Map<String, Integer>> entry : candidatesContestAndPoints.entrySet()) {
            System.out.println(entry.getKey());
            Map<String, Integer> innerMap = entry.getValue();
            innerMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .forEach(value -> System.out.printf("#  %s -> %d\n", value.getKey(), value.getValue()));
//            for (Map.Entry<String, Integer> entryMap : innerMap.entrySet()) {
//                System.out.printf("#  %s -> %d\n", entryMap.getKey(), entryMap.getValue());
//            }
        }
    }
}
