import java.util.StringTokenizer;

class constr{
    int x;
    int y ;
    public constr(){
//       this(1);
        this(10,11);
    }
     public constr(int x){
        this.x=x;
    }
    constr (int x, int y){
        this.y = y;
    }

}
class Balram {
    String name;
    int salary;
    String dept;

    Balram(String name, int salary, String dept){
        this.name= name;
        this.salary= salary;
        this.dept= dept;

    }

}
public class hashcode {
    public static void main(String[] args) {
        Balram b1 = new Balram("Balram",100000,"sales");
//        System.out.println(b1.hashCode());
//        System.out.println(b1.toString());
//        String s1 = new String();
//        s1= "Balram";
//        s1.concat("ram");
//        System.out.println(s1);
//        String s2 = s1.concat(" Shejal");
//        System.out.println(s2);
//        System.out.println(s2.toLowerCase());
//        StringBuffer s = new StringBuffer("Lavdu");
//        System.out.println(s);
//           s.append(" Shubham");
//           System.out.println(s.reverse());
//           StringBuilder sb = new StringBuilder("Shubham");
//           sb.append(" Mahale");
//           sb.reverse();
//           System.out.println(sb);
//            StringTokenizer st = new StringTokenizer("Java is an Object Oriented Programming Language");
//            while(st.hasMoreTokens()){
//                System.out.println(st.nextToken());
//            }
        //Math Class
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(10.9623));
        System.out.println(Math.floor(10.9623));
        System.out.println(Math.max(10,152.0));
        System.out.println(Math.min(154,45));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(100));







    }
}
