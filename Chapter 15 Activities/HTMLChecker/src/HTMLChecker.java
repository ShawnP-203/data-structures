import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "TagSample1.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            Stack<String> tags = new Stack<>();
            boolean goodTags = true;
            while(in.hasNext() && goodTags)
            {
                String tag = in.next();
                if(tag.contains("/"))
                {
                    if(!tags.pop().substring(1).equals(tag.substring(2)))
                    {
                        System.out.println("Tags are not nested properly.");
                        goodTags = false;
                    }
                } else
                    tags.push(tag);
            }
            if(goodTags)
                System.out.println("Tags are nested properly.");

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
