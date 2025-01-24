public class ComputePower {
    public static int computePower(int num, int pow) {
        int ans = 1;

        if (pow == 0) return 1;
        if (pow == 1) return num;

        for (int i = 1; i <= pow; ++i) {
            ans *= num;
        }
        return ans;
    }

    public static int computePowerOptimizedRecursive (int num, int pow) {
        int ans = 1;

        if (pow == 0) return 1;
        if (pow == 1) return num;

        if (pow % 2 == 0) {
            return computePowerOptimizedRecursive(num, pow / 2) * computePowerOptimizedRecursive(num, pow / 2);
        }
        else {
            return num * computePowerOptimizedRecursive(num, pow - 1);
        }

    }

//    It is also known as Binary Exponentiation;
    public static int computePowerOptimizedIterative(int num, int pow) {
        int ans = 1;

        if (pow == 0) return 1;
        if (pow == 1) return num;

        while (pow > 0) {
            if ((pow %2 == 1)) {
                ans *= num;
                pow -= 1;
            }
            else {
                num *= num;
                pow /= 2;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        System.out.println(computePower(8, 3));
        System.out.println(computePowerOptimizedRecursive(2, 10));
        System.out.println(computePowerOptimizedIterative(2, 10));
    }
}
