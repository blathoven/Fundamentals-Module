package AssociativeArrays;

import java.util.*;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        Map<String, Map<String, Integer>> playersData = new LinkedHashMap<>();
        while (!userInput.equals("Season end")) {
            String[] tokens = userInput.split(" -> | vs ");

            String playerOne = "";
            String playerTwo = "";
            String position = "";
            int points = 0;

            //Adding the members to the data.
            if (tokens.length == 3) {
                playerOne = tokens[0];
                position = tokens[1];
                points = Integer.parseInt(tokens[2]);

                if (!isFound(playersData, playerOne)) {
                    playersData.put(playerOne, new TreeMap<>());
                    playersData.get(playerOne).put(position, points);
                } else {
                    if (!playersData.get(playerOne).containsKey(position)) {
                        playersData.get(playerOne).put(position, points);
                    } else {
                        if (playersData.get(playerOne).get(position) < points) {
                            playersData.get(playerOne).remove(position);
                            playersData.get(playerOne).put(position, points);
                        }
                    }
                }
                //Combating the players.
            } else {
                playerOne = tokens[0];
                playerTwo = tokens[1];

                if (isFound(playersData, playerOne) && isFound(playersData, playerTwo)) {
                    if (ifSamePositions(playersData, playerOne, playerTwo)) {
                        Map<String, Integer> firstPlayer = playersData.get(playerOne);
                        Map<String, Integer> secondPlayer = playersData.get(playerTwo);
                        int firstPlayerSum = firstPlayer.values().stream().mapToInt(Integer::intValue).sum();
                        int secondPlayerSum = secondPlayer.values().stream().mapToInt(Integer::intValue).sum();

                        if (firstPlayerSum > secondPlayerSum) {
                            playersData.remove(playerTwo);
                        } else if (firstPlayerSum < secondPlayerSum) {
                            playersData.remove(playerOne);
                        }
                    }
                }
            }
            userInput = scanner.nextLine();
        }

        Comparator<String> skillComparator = new Comparator<String>() {
            @Override
            public int compare(String player1, String player2) {
                int totalSkill1 = playersData.get(player1).values().stream().mapToInt(Integer::intValue).sum();
                int totalSkill2 = playersData.get(player2).values().stream().mapToInt(Integer::intValue).sum();
                return Integer.compare(totalSkill2, totalSkill1);
            }
        };

        Map<String, Integer> sortedPlayers = new TreeMap<>(skillComparator);
        for (Map.Entry<String, Map<String, Integer>> entry : playersData.entrySet()) {
            String player = entry.getKey();
            Map<String, Integer> playerData = entry.getValue();
            int totalSkill = playerData.values().stream().mapToInt(Integer::intValue).sum();
            sortedPlayers.put(player, totalSkill);
        }

        for (Map.Entry<String, Integer> entry : sortedPlayers.entrySet()) {
            System.out.printf("%s: %d skill\n", entry.getKey(), entry.getValue());

            Map<String, Integer> playerData = playersData.get(entry.getKey());

            playerData.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .forEach(value -> System.out.printf("- %s <::> %d\n", value.getKey(), value.getValue()));
        }
    }

    public static boolean isFound(Map<String, Map<String, Integer>> players, String player) {
        return players.containsKey(player);
    }

    public static boolean ifSamePositions(Map<String, Map<String, Integer>> playersData, String player, String player2) {

        Map<String, Integer> currentPlayer1 = playersData.get(player);
        Map<String, Integer> currentPlayer2 = playersData.get(player2);
        List<String> playerOne = new ArrayList<>(currentPlayer1.keySet());
        List<String> playerSecond = new ArrayList<>(currentPlayer2.keySet());

        for (String position : playerOne) {

            for (int i = 0; i < playerSecond.size(); i++) {
                if (position.equals(playerSecond.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}


//    Comparator<Integer> valueComparator = new Comparator<Integer>() {
//        @Override
//        public int compare(Integer value1, Integer value2) {
//            return Integer.compare(value2, value1);
//        }
//    };