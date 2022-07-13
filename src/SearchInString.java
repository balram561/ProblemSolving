import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String s = "Balram";
        System.out.println(search(s,'B'));
        System.out.println(Arrays.toString(s.toCharArray()));

    }
    static boolean search (String s , char target){
        char [] arr= s.toCharArray();
        for ( char el : arr){
            if(el==target){
              return  true;
            }

        }

            return false;
    }
}
