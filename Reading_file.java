import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading_file {
    public static void main(String[] args) throws IOException {
        File file = new File("Sample.txt");
        FileReader reader = new FileReader(file);
        
        int i;
        while ((i = reader.read()) != -1) {
            System.out.printf("%c", i);
        }

    }
}
