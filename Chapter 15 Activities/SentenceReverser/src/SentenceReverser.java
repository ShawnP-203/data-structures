import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.
        String data = "";
        Stack<String> words = new Stack<>();

        while(scanner.hasNext())
        {
            String word = scanner.next();
            word = word.toLowerCase();
            
            words.push(word);

            if(word.contains("."))
            {
                String firstWord = words.pop();
                data += firstWord.substring(0, 1).toUpperCase()
                        + firstWord.substring(1, firstWord.length() - 1) + " ";
                while(words.size() > 0)
                {
                    data += words.pop();
                    if(words.size() > 0)
                        data += " ";
                }
                data += ". ";
            }
        }

        scanner.close();
        return data;
    }
}
