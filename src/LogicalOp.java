import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int size = sc.nextInt();

            int[] arr = new int[size];
            for(int j=0;j<arr.length;j++){
                int ele = sc.nextInt();
                arr[j]=ele;
            }
            int que = sc.nextInt();
            for(int k=0;k<que;k++){
                int count=0;
                int count1=0;

                int start = sc.nextInt();
                int end = sc.nextInt();
                int r= sc.nextInt();
                for(int l=start-1;l<end;l++){

                    int xor = arr[l]^r;
                    int and= arr[l]&r;
                    if(xor>and){
                        count++;
                    }
                    if(and>xor){
                        count1++;
                    }
                }
                if(count>count1){
                    System.out.println(count);
                }
                else{
                    System.out.println(count1);
                }
            }

        }

        // static int array(int[] arr,int start,int end){

        // }

    }
}
