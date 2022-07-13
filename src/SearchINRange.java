public class SearchINRange {
    public static void main(String[] args) {
        int arr []= {1,3,4,5,6,7,8};
        System.out.println(search(arr,4, 0,4));
    }

    private static boolean search(int[] arr, int i) {

        for (int a : arr){
            if(a==i){
                return true;
            }
        }
        return  false;
    }
    private static boolean search(int[] arr, int target, int index1, int index2) {

        for (int i=index1;i<=index2;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return  false;
    }


}
