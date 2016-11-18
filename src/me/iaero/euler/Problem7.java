package me.iaero.euler;

import java.util.ArrayList;

/**
 * 10001st prime.
 *
 * @author Tom
 */
public class Problem7
{
    static int index = 10001;

    public static void main(String[] args)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int cur = 3;

        primes.add(2);

        while (primes.size() < index) {
            boolean valid = true;

            for (Integer prime : primes) {
                if (cur % prime == 0) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                primes.add(cur);

            cur += 2;
        }

        System.out.println(primes.get(10000));
    }
}
