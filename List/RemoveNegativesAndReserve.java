package List;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReserve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        listLine.removeIf(e -> e < 0);
        Collections.reverse(listLine);

        if (listLine.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(listLine.toString().replaceAll("[\\[\\],]", ""));
            }
        }
    }

