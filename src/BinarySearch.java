public class BinarySearch {
    public static void main(String[] args) {
   int [] arr = { -3,10,11,12,13,142,};
        System.out.println(Binarysearch(arr,0));

    }
    static int Binarysearch(int[] arr, int target){
        int start=0;
        int mid;
        int end= arr.length-1;

        while(start<=end){

            mid = start + (end-start)/2;
            if(target<arr[mid]){
                end-=1;

            }
            if(target>arr[mid]){
                start+=1;

            }
            if(target==arr[mid]){
                return mid;

            }

        }
        return  -1;


    }
}
