package me.iaero.euler;

public class Problem3
{
    static long number = 600851475143L;

    public static void main(String[] args)
    {
        long factor = 1L;

        for (long i = 3L; i <= number / i;) {
            if (number % i == 0) {
                factor = i;
                number /= i;
            } else {
                i += 2;
            }
        }

        factor = (factor < number) ? number : factor;

        System.out.println(factor);
    }
}
