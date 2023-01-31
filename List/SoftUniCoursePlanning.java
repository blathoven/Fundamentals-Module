package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courseLine = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandSplit = command.split(":");
            switch (commandSplit[0]) {
                case "Add":
                    if (!courseLine.contains(commandSplit[1])) {
                        courseLine.add(commandSplit[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandSplit[2]);
                    if (!courseLine.contains(commandSplit[1])) {
                        courseLine.add(index, commandSplit[1]);
                    }
                    break;
                case "Remove":
                    courseLine.removeIf(e -> e.equals(commandSplit[1]));
                    break;
                case "Swap":
                    if (courseLine.contains(commandSplit[1]) && courseLine.contains(commandSplit[2])) {
                        int firstCourseIndex = courseLine.indexOf(commandSplit[1]);
                        int secondCourseIndex = courseLine.indexOf(commandSplit[2]);
                        String firstCourseName = courseLine.get(firstCourseIndex);

                        courseLine.set(firstCourseIndex, courseLine.get(secondCourseIndex));
                        courseLine.set(secondCourseIndex, firstCourseName);

                        if (courseLine.contains(commandSplit[1] + "-Exercise")) {
                            courseLine.remove(courseLine.indexOf(commandSplit[1] + "-Exercise"));
                            courseLine.add(secondCourseIndex + 1, commandSplit[1] + "-Exercise");
                        }

                        String secondCourseExercise = commandSplit[2] + "-Exercise";
                        if (courseLine.contains(secondCourseExercise)) {
                            int indexOfSecondCourse = courseLine.indexOf(secondCourseExercise);
                            courseLine.remove(indexOfSecondCourse);
                            courseLine.add(firstCourseIndex + 1, secondCourseExercise);
                        }
                    }
                    break;
                case "Exercise":
                    String exerciseCourse = commandSplit[1] + "-Exercise";
                    if (!courseLine.contains(exerciseCourse)) {
                        if (courseLine.contains(commandSplit[1])) {
                            int indexOfCourse = courseLine.indexOf(commandSplit[1]);
                            courseLine.add(indexOfCourse + 1, exerciseCourse);
                        } else {
                            courseLine.add(commandSplit[1]);
                            courseLine.add(exerciseCourse);
                        }
                    }

            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < courseLine.size(); i++) {
            System.out.println(i + 1 + "." + courseLine.get(i));
        }

    }
}
