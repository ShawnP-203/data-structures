import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //Create a print queue of strings
        Queue<String> jobs = new LinkedList<>();

        jobs.add("Joe: Quarter 2 Expense Report");
        jobs.add("Cathy: Top Secret Document");

        System.out.println("Printing " + jobs.remove());

        jobs.add("Cathy: Really Top Secret Document");
        jobs.add("Joe: Grocery List");
        jobs.add("Cathy: Can I Get Fired For This?");

        System.out.println("Printing " + jobs.remove());
        
        jobs.add("Boss: Cathy Termination Letter");
        
        while(jobs.size() > 0)
            System.out.println("Printing " + jobs.remove());
    }
}
