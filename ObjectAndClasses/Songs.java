package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class currentSong {

        private String typeList;
        private String name;
        private String time;

        public currentSong(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<currentSong> listOfSongs = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String inputLine = scanner.nextLine();
            String[] songInfoArr = inputLine.split("_");

            currentSong currentSong = new currentSong(songInfoArr[0], songInfoArr[1], songInfoArr[2]);

            listOfSongs.add(currentSong);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (currentSong item : listOfSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (currentSong item : listOfSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }

    }
}

