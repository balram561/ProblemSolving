import java.lang.reflect.Array;
import java.util.Scanner;

public class NumberReversing {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int count = 0;
        int r=0;
        int i = 0;
        int j = s.length()-1 ;
       while(i<s.length()){
           if (s.charAt(i)==s.charAt(j)){
               count++;
           }
           i++;
           j--;
           r++;
       }


        System.out.println(count);
         }


    }

