// Trailing zeroes in factorial of (n);

public class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        int n = 251, cnt = 0;

        while(n >= 5) {
            cnt += (n / 5);
            n /= 5;
        }


        System.out.println(cnt);

    }
}
