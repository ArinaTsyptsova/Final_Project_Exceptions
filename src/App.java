import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "Enter data in the format: last name, first name, patronymic, date of birth, phone number, gender");
            String input = scanner.nextLine().trim();

            Parser parser = new Parser();
            Validator validator = new Validator();
            Writer writer = new Writer();

            User user = parser.parseInput(input);
            validator.validateUser(user);
            writer.writeUserToFile(user);

            System.out.println("The data has been successfully entered into the file!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
