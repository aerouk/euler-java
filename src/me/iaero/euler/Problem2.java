package me.iaero.euler;

/**
 * Even Fibonacci numbers to 4,000,000.
 *
 * @author Tom
 */
public class Problem2
{
    public static void main(String[] args)
    {
        int prev = 0;
        int total = 0;

        for (int cur = 1; cur < 4000000;) {
            int temp = cur + prev;
            prev = cur;
            cur = temp;

            if (cur % 2 == 0) {
                total += cur;
            }
        }

        System.out.println(total);
    }
}
