public class QueueDemo
{
    public static void main(String[] args)
    {
        
        CircularArrayQueue queue = new CircularArrayQueue();

        queue.add("Tom");
        queue.add("Diana");
        queue.add("Harry");
        queue.add("Romeo");
        queue.add("Juliet");
        queue.add("Maria");
        queue.add("Arnav");
        queue.add("Isaac");
        queue.add("Jinan");
        queue.add("Yutian");
        queue.add("Ryan");

        System.out.print(queue.remove());
        while(!queue.empty())
        {
            System.out.print(", " + queue.remove());
        }
    }
}
