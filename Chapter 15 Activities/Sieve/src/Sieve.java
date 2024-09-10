import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        Set<Integer> nums = new HashSet<Integer>();
        for(int i = 2; i <= n; i++) nums.add(i);

        for(int fac = 2; fac <= (int) Math.sqrt(n); fac++)
        {
            //The sentry variable starts at fac*2
            //so the factor itself is not removed
            for(int chk = fac * 2; chk <= n; chk += fac)
                nums.remove(chk);
        }

        System.out.println(nums);
        in.close();
    }
}
