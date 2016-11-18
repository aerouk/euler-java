package me.iaero.euler;

public class Problem4
{
    public static void main(String[] args)
    {
        int max = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                Integer product = i * j;
                String reverse = new StringBuilder(product.toString()).reverse().toString();

                if (product.toString().equals(reverse)) {
                    max = Math.max(product, max);
                    break;
                }
            }
        }

        System.out.println(max);
    }
}
