import java.util.Stack;

public class deletemiddle {
    static void delmiddle(Stack<Character>sc, int n, int curr){

        //using recursion
        if (sc.isEmpty() || curr==n) {
            return;
            
        }
        char x = sc.pop();
        delmiddle(sc, n, curr+1);
        if (curr!=n/2) {
            sc.push(x);
            
        }
    }
    //using another stack
    static  void delmiddle(Stack<Character>sc){
        int n=sc.size();
        Stack<Character>temp= new Stack<>();
        int count = 0;
        while (count<n/2) {
            char p = sc.peek();
            sc.pop();
            temp.push(p);
            count++;
            
            
        }
        sc.pop();
        while (!temp.isEmpty()) {
            
            sc.push(temp.peek());
            temp.pop();
            
        }
    }
    
    public static void main(String[] args) {
        Stack<Character> sc = new Stack<>();
        sc.push('1');
        sc.push('2');
        sc.push('3');
        sc.push('4');
        sc.push('5');
        
       
        //delmiddle(sc, sc.size(), 0);
        delmiddle(sc);
        while(!sc.isEmpty()){
            char x = sc.peek();

            System.out.print(x+ " ");
            sc.pop();
        
        }


    }
    
    }

