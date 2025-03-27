// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

import java.io.*;

public class File_writing {
    public static void main(String[] args) throws IOException {
		
        FileWriter writer = new FileWriter("Sample_1.txt");
        
        writer.write("Hello, How are you!");
        writer.close();  

        System.out.println("File written successfully.");
    }
}