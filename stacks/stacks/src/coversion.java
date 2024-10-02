 import java.util.Stack;

public class coversion {
    static int prec(char x){
        if(x == '^'){
            return 3;
        }
        else if(x == '*' || x == '/'){
            return 2;
        }
        else if (x == '+' || x == '-'){
           
                return 1;
            
        }
        else{
        return -1;
        }

    }
    static char asso(char x){
        if(x == '^'){
            return 'R';
        }
        return 'L';
    }
    static void infixTopostfix(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if ((x>='a'&&x<='z')||(x>='A'&&x<='Z')||(x>='1'&&x<='9')) {
                result.append(x);
                
            }
            else if(x=='('){
                sc.push(x);

            }
            else if(x==')'){
                while (!sc.isEmpty()&&sc.peek()!='(') {
                    result.append(sc.pop());
                    
                }
                sc.pop();
            }
            else{
                while (!sc.isEmpty() && (prec(s.charAt(i)) < prec(sc.peek()) ||
                                             prec(s.charAt(i)) == prec(sc.peek()) &&
                                                 asso(s.charAt(i)) == 'L')) {
                    result.append(sc.pop());
                   }
                   sc.push(x);
            
            
            
        }

    }
    while(!sc.isEmpty()){
        
        result.append(sc.pop());
    }
    System.out.println(result);
}
public static void main(String[] args) {
    String str = ("x+y*z/w+u");
    infixTopostfix(str);
   

}
}
 
 