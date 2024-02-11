import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void writeUserToFile(User user) throws IOException {
        try (FileWriter fileWriter = new FileWriter(user.getLastName() + ".txt", true)) {
            fileWriter.write(user.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file:");
            e.printStackTrace();
        }
    }
}
