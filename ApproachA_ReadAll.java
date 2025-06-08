import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ApproachA_ReadAll {
    public static void main(String[] args) throws IOException {
        // Print the process ID
        System.out.println("PID: " + ProcessHandle.current().pid());

        System.out.println("Reading full file into memory...");
        List<String> lines = Files.readAllLines(Paths.get("employees.csv"));
        System.out.println("Total lines: " + lines.size());
    }
}
