package me.iaero.euler;

/**
 * Sum square difference of first 100 natural numbers.
 *
 * @author Tom
 */
public class Problem6
{
    static int amt = 100;

    public static void main(String[] args)
    {
        int sumOfNatural = (amt * (amt + 1)) / 2;
        int sumOfSquares = (amt * (amt + 1) * ((2 * amt) + 1)) / 6;

        int result = sumOfNatural * sumOfNatural - sumOfSquares;

        System.out.println(Integer.toString(result));
    }
}
