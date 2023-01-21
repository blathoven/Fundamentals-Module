package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class currentStudent {
        private String firstName;
        private String lastname;
        private String age;
        private String hometown;

        public currentStudent(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastname = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastname() {
            return this.lastname;
        }

        public String getAge() {
            return this.age;
        }

        public String getHometown() {
            return this.hometown;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<currentStudent> studentList = new ArrayList<>();
        while (!command.equals("end")) {
            String[] studentInfo = command.split(" ");

            currentStudent studentData = new currentStudent(studentInfo[0], studentInfo[1], studentInfo[2],
                    studentInfo[3]);

            studentList.add(studentData);

            command = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (currentStudent item : studentList) {
            if (item.getHometown().equals(city)) {
                System.out.println(item.getFirstName() + " " + item.getLastname() + " is " + item.getAge()
                        + " years old");
            }
        }

    }
}
