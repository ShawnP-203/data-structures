import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Integer, String> wordMap = new HashMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                // Update the map here
                // Modify Worked Example 15.1
                if(wordMap.get(len) == null)
                    wordMap.put(len, word);
                else
                    wordMap.put(len, wordMap.get(len) + ", " + word);
            }

            // Print the strings, in increasing order of their length
            // Use this format: 1: i, a, i
            for(Integer key: wordMap.keySet())
                System.out.println(key + ": " + wordMap.get(key));
                
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
