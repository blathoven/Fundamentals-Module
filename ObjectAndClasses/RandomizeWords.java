package ObjectAndClasses;

import java.util.*;
import java.util.stream.Collectors;


public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> modifiedList = new ArrayList<>();
        Random rnd = new Random();

        while (modifiedList.size() < listLine.size()) {

            int randomNumber = rnd.nextInt(listLine.size());
            if (!modifiedList.contains(listLine.get(randomNumber))) {
                modifiedList.add(listLine.get(randomNumber));
            }
        }
        for (String currentWord : modifiedList) {
            System.out.println(currentWord);
        }
    }
}
 //isEmpty() -> Функция, проверяваща дали листът е празен.