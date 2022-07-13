public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 52, 52,};
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);

            }

        }
//        System.out.println(count);

    }
}
