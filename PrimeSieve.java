/**
 * PrimeSieve.java
 * Created by willeppy on 8/30/15.
 *
 * Calculates primes number up to a max using the sieve of Eratosthenes
 *
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class PrimeSieve
{
    public static void main(String[] args)
    {
        System.out.println("This program will calculate every prime number up to a max.");
       
        //System.out.print("Please enter max: ");
        //Scanner scan = new Scanner(System.in);
        //int max = scan.nextInt();
        
        int max = 200;

        List<Integer> primes = calcPrimes(max);
        System.out.println(primes);
    }

    public static List<Integer> calcPrimes (int max)
    {
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        for ( int i = 3; i < max; i = i + 2)
        {
            numbers.add(i);
        }

        LinkedList<Integer> primes = new LinkedList<Integer>();
        primes.add(2);

        final int SQRT = (int) Math.sqrt(max);

        while(!numbers.isEmpty() && (numbers.peekFirst() <= SQRT))
        {
            int front = numbers.remove(0);
            primes.add(front);

            Iterator<Integer> iter = numbers.iterator();

            while(iter.hasNext())
            {
                int current = iter.next();
                if (current % front == 0) iter.remove();
            }
        }

        Iterator<Integer> iter = numbers.iterator();

        while(iter.hasNext())
        {
            int current = iter.next();
            primes.add(current);
        }

        return primes;

    }

}

