import java.util.ArrayList;

public class PrimeFactors {
    public static ArrayList<Integer> printPrimeFactors(int n) {
        int k = 2, j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (n > 1) {
            if (n % k == 0) {
                list.add(k);
                n /= k;
            }
            else {
                k++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = printPrimeFactors(84);
        System.out.println(list);
    }
}
