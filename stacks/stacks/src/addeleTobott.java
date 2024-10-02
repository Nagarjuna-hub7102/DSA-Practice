import java.util.Stack;

public class addeleTobott {
    /* Using recursion */
    static Stack<Integer> sc = new Stack<>();
    
    static void addele(int n){
        
        
       recur(n);
       
        while(sc.size()>0){
            int a = sc.peek();
            System.out.println(a+"  ");
            sc.pop();
        }

    }
    static void recur(int n){
       
        if(sc.size()==0){
            sc.push(n);
        }
        else{
        int a =sc.peek();
        sc.pop();
        recur(n);
        sc.push(a);
        }
        
    } 
    /* using another stack */
    static void addele(int n, Stack<Integer>sc){
        Stack<Integer>tempStack=new Stack<>();
        while (!sc.empty()) {
            int x = sc.peek();
            tempStack.push(x);
            sc.pop();
            
        }
        sc.push(n);
        while (!tempStack.empty()) {
            int x = tempStack.peek();
            sc.push(x);
            tempStack.pop();
            
        }
        while (!sc.empty()) {
            int x = sc.peek();
            System.out.println(x);
            sc.pop();
            
        }
    }
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
        addele(6,sc);
        addele(7);

    }
}

