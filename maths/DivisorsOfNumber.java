import java.util.ArrayList;

public class DivisorsOfNumber {
    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list;
    }

    public static ArrayList<Integer> getDivisorsOptimized(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = 1;

        while(i * i < n) {
            if (n % i == 0) {
                list.add(i);
            }
            i++;
        }

        while(i * i >= 1) {
            if (n % i == 0) {
                list.add(n/i);
            }
            i--;
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = getDivisors(15);
        System.out.println(list1);
        ArrayList<Integer> list2 = getDivisorsOptimized(15);
        System.out.println(list2);
    }
}
