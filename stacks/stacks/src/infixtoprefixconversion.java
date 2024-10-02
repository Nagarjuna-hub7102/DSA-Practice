
import java.util.Stack;
public class infixtoprefixconversion {
    

    
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
        static String infixTopostfix(String s){
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
                    while (!sc.isEmpty() && (prec(s.charAt(i)) < prec(sc.peek()) 
                                                  &&
                                                     asso(s.charAt(i)) == 'L')) {
                        result.append(sc.pop());
                       }
                       sc.push(x);
                
                
                
            }
    
        }
        while(!sc.isEmpty()){
            
            result.append(sc.pop());
        }
        String a = result.toString();
        return a;
    }
    static String reverse(String s){
        char c;
        String a = "";
        for (int i = 0; i <s.length(); i++) {
            c = s.charAt(i);
            a = c + a;
            
        }
        return a;
        
    }
    static void infixToprefix(String s){
         s = reverse(s);
         char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c == '('){
                c = ')';
            }
            else if(c == ')'){
                c = '(';
            }
        }
        
          s = infixTopostfix(s);
          s = reverse(s); 
        System.out.println("prefix expression"+" "+ s);  
    }
    public static void main(String[] args) {
        String s = ("x+y*z/w+u");
           infixToprefix(s);  
          

      
    }
   
    }
     
     

