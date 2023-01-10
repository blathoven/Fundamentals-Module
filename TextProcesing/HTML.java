package TextProcesing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titleOfArticle = scanner.nextLine();
        String contentOfArticle = scanner.nextLine();
        List<String> comments = new ArrayList<>();

        while (true) {

            String commandInput = scanner.nextLine();

            if (commandInput.equals("end of comments")) {
                break;
            }

            comments.add(commandInput);

        }

        //Creating the HTML format:
        // Title
        System.out.println("<h1>");
        System.out.println("    " + titleOfArticle);
        System.out.println("</h1>");

        //Article
        System.out.println("<article>");
        System.out.println("    " + contentOfArticle);
        System.out.println("</article>");

        //Comments
        for (String comment : comments) {
            System.out.println("<div>");
            System.out.println("    " + comment);
            System.out.println("</div>");
        }
    }
}
