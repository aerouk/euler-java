package me.iaero.euler;

/**
 * Special Pythagorean triplet (1000).
 *
 * @author Tom Brookes
 */
public class Problem9
{
    static int sum = 1000;

    public static void main(String[] args)
    {
        for (int a = 1; a < sum / 3; a++) {
            for (int b = 1; b < sum / 2; b++) {
                int c = sum - a - b;

                if (a * a + b * b == c * c) {
                    System.out.println(a * b * c);
                }
            }
        }
    }
}
