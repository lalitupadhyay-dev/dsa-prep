public class SieveOfEratosthenes {

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i*i <= n; i +=6) {
            if (n % i == 0 || n % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void sieve(int n) {
        for (int i = 2; i <= n; ++i) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean[] generateOptimizedSieveHash(int n) {
        boolean[] sieveHash = new boolean[n + 1];

        sieveHash[0] = false;
        sieveHash[1] = false;

        for(int i = 2; i <= n; ++i) {
            sieveHash[i] = true;
        }

        int startIndex = 4;

        for (int i = 2; i * i <= n; ++i) {
            for (int j = i * i; j <= n; j += i) {
                sieveHash[j] = false;
            }
        }
        return sieveHash;
    }

    public static void main(String[] args) {
//        sieve(11);

//        optimised sieve algorithm;
        boolean[] sieveHash = generateOptimizedSieveHash(1000);

        System.out.println(sieveHash[59]);

    }
}
