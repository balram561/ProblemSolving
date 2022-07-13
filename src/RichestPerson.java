public class RichestPerson {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int[] a : accounts) {
            sum=0;
            for (int b : a) {

                sum = sum + b;
                if (sum > max) {
                    max = sum;
                }

            }

        }
        System.out.println(max);
    }
}
