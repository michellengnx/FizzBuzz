public class Reduce {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            System.out.println(n);
        }
    }

}
