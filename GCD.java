/**
 * GCD.java
 * Created by willeppy on 8/30/15.
 *
 * Contains static method for calculating the Greatest Common Denominator (gcd) for two ints.
 *
 */
public class GCD {

    // recursively calculates the gcd of two ints using Euclid's algorithm
    public static int gcd(int larger, int smaller ) {
        if(smaller == larger) return smaller;
        else if (smaller > larger) return gcd(smaller, larger);

        int multiplier = larger / smaller;
        int remainder = larger - (smaller * multiplier);

        System.out.println(larger + " = (" + smaller + " * " + multiplier + ") + " + remainder);

        if (remainder == 0) return smaller;
        else return gcd(smaller, remainder);
    }

}
