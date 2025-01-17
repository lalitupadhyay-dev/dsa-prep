
public class GCD {
    public static int findGcdBruteForce(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= a; ++i) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int findGcdOptimizedLoop (int a, int b) {
        while (b % a != 0) {
            int c = b % a;
            b = a;
            a = c;
        }
        return a;
    }

    public static int findGcdOptimizedRecursion(int a, int b) {
        if (a == 0) return b;
        return findGcdOptimizedRecursion(b % a, a);
    }

    public static void main (String[] args) {


        System.out.println(findGcdBruteForce(100, 200));
        System.out.println(findGcdOptimizedLoop(200, 100));
        System.out.println(findGcdOptimizedRecursion(300, 50));
    }
}
