package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DateData {

    private final String day;
    private final String month;
    private final String year;

    public DateData(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern patter = Pattern.compile("\\b(?<day>\\d{2})([\\/\\-.])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");

        String inputLine = scanner.nextLine();

        Matcher matcher = patter.matcher(inputLine);

        List<DateData> datesList = new ArrayList<>();
        while (matcher.find()) {
            DateData dateData = new DateData(matcher.group("day"),
                    matcher.group("month"), matcher.group("year"));

            datesList.add(dateData);
        }
        for (DateData dateData : datesList) {
            System.out.printf("Day: %s, Month: %s, Year: %s\n", dateData.getDay(), dateData.getMonth(),
                    dateData.getYear());
        }
    }
}
