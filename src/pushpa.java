import java.util.Arrays;
import java.util.Scanner;

class Codechef {
    public static Scanner sc = new Scanner(System.in);

    public static void printfun(int vijji) {
//        2
//        4
//        1 1 2 3
//        1
//        2
        while (vijji-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (n == 1) {
                System.out.println(arr[0]);
            } else {
                int maxm = 0;
                int c = 0;
                for (int i = n - 1; i >= 1; i--) {
                    if (arr[i] == arr[i - 1]) {
                        c++;
                    } else {
                        if (maxm < arr[i] + c) {
                            maxm = arr[i] + c;
                        }
                        c = 0;
                    }
                }
                System.out.println(maxm);
            }
        }
    }
}
public class pushpa {
    public static void main(String[] args) {
        int vijji= Codechef.sc.nextInt();
        Codechef.printfun(vijji);
    }
}
