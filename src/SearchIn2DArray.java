import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 11, 12, 13},
                {14, 1532, 16},
                {17},
                {18, 19, 20, 21, 22, 230}
        };

        System.out.println(Research(arr));
    }

    private static int search(int[][] arr, int target) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j]==target){
                if (arr[i][j] > max) {
                    max = arr[i][j];
//                    return new int []{i,j};
                    //return new int[] {i,j,};
                }
            }

        }
        return max;
    }

    private static int Research(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] e : arr) {
            for (int a : e) {
                if (a > max) {
                    max = a;
                }

            }
        }
        return max;
    }
}