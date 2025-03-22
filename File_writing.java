import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_writing {
    public static void main(String[] args) throws IOException {
		
        File file = new File("Sample_1.txt"); 
        FileWriter writer = new FileWriter(file);
        
        writer.write("Hello, How are you!");
        writer.close();  

        System.out.println("File written successfully.");
    }
}