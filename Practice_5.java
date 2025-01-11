import java.util.Scanner;

public class Practice_5
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count spaces in the sentence
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) 
        {
            // checks for spaces
            if (sentence.charAt(i) == ' ') 
			{
                spaceCount++;
            }
        }

        // Remove all spaces from the sentence
        String sentenceWithoutSpaces = sentence.replaceAll("\\s", "");

        System.out.println("Sentence without spaces: " + sentenceWithoutSpaces);
        System.out.println("Number of spaces removed: " + spaceCount);
    }
}