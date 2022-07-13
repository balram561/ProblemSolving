import com.sun.tools.javac.Main;
import org.w3c.dom.Node;

public class Stack {
    static class Node{
        int data ;
        Node next ;
       public Node(int data){
            this.data= data;
            next = null;
        }

    }
     public static  class stack {
        public static Node Head;
        int data;
        public static boolean isEmpty(){
            return Head==null;
        }
        public static void push(int data){
           Node newNode = new Node(data);
           if(isEmpty()){
               Head = newNode;
               return;
           }
           newNode.next=Head;
           Head=newNode;

        }
        public static int pop(){
            int top = Head.data;
            if(isEmpty()){
                return -1 ;
            }
            Head = Head.next;
            return top;


        }
        public static int peek(){
            int top = Head.data;
            if(isEmpty()){
                return -1;

            }
            return top;
        }

    }

    public static void main(String[] args) {

        stack s = new stack();
        s.push(1);
         s.push(20);
         s.push(41);
         s.push(15);
           while(!s.isEmpty()){
               System.out.println(s.peek());
               s.pop();

           }
    }
}
