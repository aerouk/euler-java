package me.iaero.euler;

/**
 * Smallest multiple of numbers 1 to 20.
 *
 * @author Tom
 */
public class Problem5
{
    static int[] divisors = new int[]{5, 7, 9, 11, 13, 16, 17, 19};

    public static void main(String[] args)
    {
        long total = 1;

        for (int divisor : divisors) {
            total *= divisor;
        }

        System.out.println(total);
    }
}
