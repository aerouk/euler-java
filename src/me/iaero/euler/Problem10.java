package me.iaero.euler;

import java.util.ArrayList;

/**
 * Summation of primes below 2 million.
 *
 * @author Tom Brookes
 */
public class Problem10
{
    static int max = 2000000;

    public static void main(String[] args)
    {
        long sum = 0;

        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        int cur = 3;

        boolean inLimit = true;

        while (inLimit) {
            boolean valid = true;

            for (Integer prime : primes) {
                if (cur % prime == 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                primes.add(cur);
            }

            cur += 2;

            if (cur > max) {
                inLimit = false;
            }
        }

        for (Integer prime : primes) {
            sum += prime;
        }

        System.out.println(sum);
    }
}
