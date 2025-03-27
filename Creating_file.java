import java.io.*;

public class Creating_file
{
	public static void main(String[] args)
	{
		try {
			File file = new File("Sample_3.txt");
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("File created Successfully.");
			}
		} catch (IOException e) {
			System.out.println("I/O Exception occurred.");
		}
	}
}