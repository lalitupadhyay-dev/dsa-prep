public class PrimeNumber {

    public static boolean isPrimeBruteForce(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeMoreOptimized (int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeBruteForce(25));
        System.out.println(isPrimeOptimized(64));
        System.out.println(isPrimeMoreOptimized(256));
    }
}
