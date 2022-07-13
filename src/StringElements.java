import java.util.Scanner;

public class StringElements {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            char [] arr= s.toCharArray();
            int count1=0,count2=0,count3=0,count4=0,count5=0;

            int i =0;
            int end = s.length()-1;
            while(i<=end){
                if(s.charAt(i)=='o'){
                    count1++;
                }
                if(s.charAt(i)=='b'){
                    count2++;
                }
                if(s.charAt(i)=='r'){
                    count3++;
                }
                if(s.charAt(i)=='y'){
                    count4++;
                } if(s.charAt(i)=='g'){
                    count5++;
                }
                i++;


            }

              if (count1>0){
                  System.out.println("Orange:"+count1);
              }  if (count2>0){
                  System.out.println("Blue:"+count2);
              }  if (count3>0){
                  System.out.println("Red:"+count3);
              }  if (count4>0){
                  System.out.println("Yellow:"+count4);
              }
              if (count5>0){
                  System.out.println("Green:"+count4);
              }



        }

    }

