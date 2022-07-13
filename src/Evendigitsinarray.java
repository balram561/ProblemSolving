public class Evendigitsinarray {
    public static void main(String[] args) {
      int[]  nums = {
              437,315,322,431,686,264,442};
//        int num;
//        int digits;
//        int count=0;
//        for(int e : nums){
//         num= (int)(Math.log10(e)+1) ;
//         if(num%2==0){
//             count++;
//         }

        int count=0;
        int total=0;
        for(int a  :nums){

            while(a>0){
                count++;
                a= (a/10);

            }

            if(count%2==0){
                total++;

            }

        }

        System.out.println(total);
      }



    }

