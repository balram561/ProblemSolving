import java.util.Scanner;

public class StringAddition {
    public static void main(String[] args) {
        String str = "Balram";
       String rev = "";
       char c ;
       for(int i =0;i<str.length();i++){
           c= str.charAt(i);
           rev = c + rev;
           Scanner sc = new Scanner(System.in);

       }
       System.out.println(rev);
    }
}
