package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> participantsData = new LinkedHashMap<>();

        participants.forEach(participant -> participantsData.put(participant, 0));

        Pattern patternLetters = Pattern.compile("[A-Za-z]+");
        Pattern patternDigits = Pattern.compile("\\d");

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end of race")) {

            StringBuilder participantName = new StringBuilder();
            int distance = 0;

            Matcher letterMatcher = patternLetters.matcher(inputLine);
            while (letterMatcher.find()) {
                participantName.append(letterMatcher.group());
            }

            Matcher digitMatcher = patternDigits.matcher(inputLine);
            while (digitMatcher.find()) {
                distance += Integer.parseInt(digitMatcher.group());
            }

            String participantNameToString = participantName.toString();

            if (participantsData.containsKey(participantNameToString)) {
                participantsData.put(participantNameToString, participantsData.get(participantNameToString) + distance);
            }

            inputLine = scanner.nextLine();
        }
        Map<String, Integer> updatedMap = new LinkedHashMap<>();
        participantsData.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .forEach(racer -> updatedMap.put(racer.getKey(), racer.getValue()));

        int count = 0;
        for (Map.Entry<String, Integer> entry : updatedMap.entrySet()) {

          count++;
          if (count == 1) {
              System.out.println("1st place: " + entry.getKey());
          } else if (count == 2) {
              System.out.println("2nd place: " + entry.getKey());
          } else {
              System.out.println("3rd place: " + entry.getKey());
          }
        }
    }
}



