import java.io.*;

public class File_reading {
    public static void main(String[] args) throws IOException {
        File file = new File("Sample.txt");
        FileReader reader = new FileReader(file);
        
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char)i);
        }

    }
}
