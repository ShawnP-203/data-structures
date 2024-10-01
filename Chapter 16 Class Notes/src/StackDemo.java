public class StackDemo
{
    public static void main(String[] args)
    {
        
        LinkedListStack stack = new LinkedListStack();

        stack.push("Tom");
        stack.push("Diana");
        stack.push("Harry");

        while(!stack.empty())
        {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nExpected: Harry Diana Tom");
    }
}
