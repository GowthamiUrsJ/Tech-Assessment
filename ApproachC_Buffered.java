import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApproachC_Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("employees.csv"), 16 * 1024);
        String line;
        int count = 0;

        while ((line = reader.readLine()) != null) {
            count++;
        }

        reader.close();
        System.out.println("Total lines: " + count);
    }
}

