import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
         * The map interface is generic.
         * The first type given is the type of the key.
         * The second type given is the type of the value.
         */
        Map<String, Color> favColors = new HashMap<String, Color>();

        //Add elements to the map using the put method
        favColors.put("Henry", Color.BLUE);
        favColors.put("Jack", Color.RED);
        favColors.put("Priya", Color.GREEN);

        //Duplicate values are allowed
        favColors.put("Dr. Miller", Color.GREEN);

        //If there is a duplicate key, the new value is a replacement
        favColors.put("Jack", Color.MAGENTA);

        //Create a set of the map's keys
        Set<String> keys = favColors.keySet();
        for(String key: keys)
            System.out.println(key + " (" + key.hashCode() + ")");
    }
}
