import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ApproachD_Stream {
    public static void main(String[] args) throws IOException {
        long count = Files.lines(Paths.get("employees.csv")).count();
        System.out.println("Total lines: " + count);
    }
}
