import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");

        System.out.println(staff);

        //The list is currently: TNPG
        /*
         * The listIterator method creates a new list iterator
         * that is positioned at the head of the list.
         */
        ListIterator<String> iterator = staff.listIterator();

        /* The next method advances the iterator over the next in the list */
        iterator.next(); //T|NPG

        String avenger = iterator.next(); //TN|PG
        System.out.println(avenger);

        /* The add method inserts at the iterator position, moving it ahead */
        iterator.add("Steve");
        iterator.add("Clint"); //TNSC|PG
        System.out.println(staff);

        /* The remove method removes what next or previous found last time */
        iterator.next(); //to avoid IllegalStateException
        iterator.remove(); //TNSC|G
        System.out.println(staff);

        /* The set method sets what next or previous passed over last time */
        iterator.previous(); //to avoid IllegalStateException
        iterator.set("T'Challa"); //TNST|G
        System.out.println(staff);

        /* hasNext is used to determine if there is a next node
         * after the iterator.
         */
        iterator = staff.listIterator(); //|TNSTG
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if(n.equals("Natasha")) //TN|STG
                iterator.remove(); //T|STG
        } //TSTG|

        for(String n: staff)
            System.out.print(n + " ");
        System.out.println();

        /* ConcurrentModificationException: Cannot modify a LinkedList
         * while using an iterator unless you use the iterator to do
         * the modification
         */
        iterator = staff.listIterator(); //|TNSTG
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if(n.equals("Tony"))
                iterator.remove()
                ;
        }

        for(String n: staff)
        {
            if(n.equals("Tony"))
                iterator.add("Bruce");
        }
    }
}
