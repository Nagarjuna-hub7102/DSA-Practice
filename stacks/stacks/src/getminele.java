import java.util.Stack;


    class MyStack{
        Stack<Integer>sc;
        int minele;
         MyStack(){
            sc=new Stack<>();
        }
        void getmin(){
            if(sc.isEmpty()){
                System.out.println("stack is empty");
            }
            else{
                System.out.println("minimum element :" + minele);
            }
        }
        void peek(){
            if(sc.isEmpty()){
                System.out.println("stack is empty");
            }
            else{
                int t = sc.peek();
                if(t<minele){
                    System.out.println("peek element"+ minele);
                }
                   
                 else{
                        System.out.println("peek element"+t);
                    }

                
            }
        }
        void push(int x){
            if(sc.isEmpty()){
                minele=x;
                sc.push(x);
                
            }
            
            if (x<minele) {
                
                sc.push(2*x-minele);
                minele=x;
            }
            else{
                sc.push(x);
            }
            System.out.println("pushed element:"+" "+x);
        }
        void pop(){
            if(sc.isEmpty()){
                System.out.println("stack is empty");
            }
            System.out.print("popped element:");
            int t=sc.pop();
            if(t<minele){
                System.out.println(minele);
                minele=2*minele-t;

            }
            else{
                System.out.println(t);
            }
        
        
        }
    }
    public class getminele {
    public static void main(String[] args) {
        MyStack sc = new MyStack();
        sc.push(3);
        sc.push(5);
        sc.getmin();
        sc.push(2);
        sc.push(1);
        sc.getmin();
        sc.pop();
        sc.getmin();
        sc.pop();
        sc.peek();
    }
}
