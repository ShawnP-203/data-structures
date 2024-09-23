import java.util.Stack;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        // Complete the constructor
        driveway = new Stack<>();
        street = new Stack<>();
    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        driveway.push(licensePlate);
        print();
    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
        for(int moveOrRemove = driveway.pop();
                moveOrRemove != licensePlate;
                moveOrRemove = driveway.pop())
            street.push(moveOrRemove);
        print();
        System.out.println("\nThose in the street will go to the driveway now.");
        while(street.size() != 0)
            driveway.push(street.pop());
        print();
    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        if(driveway.size() == 0)
            System.out.println("<empty>");
        else
        {
            for(int i: driveway)
                System.out.println(i);
        }

        System.out.println("\nIn Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        if(street.size() == 0)
            System.out.println("<empty>");
        else
        {
            for(int i: street)
                System.out.println(i);
        }
    }
}
