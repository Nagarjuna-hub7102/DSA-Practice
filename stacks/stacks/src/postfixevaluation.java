  import java.util.Stack;

public class postfixevaluation {
    static int evaluation(String str){
        Stack<Integer>sc=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == ' ') {
                continue;
                
            }
            
            else if (Character.isDigit(x)){
             int n = 0;
             while (Character.isDigit(x)) {
                n = n*10+(int)(x-'0');
                i++;
                 x = str.charAt(i); 
                
             }
             i--;
             sc.push(n);
            }
            else{
            
               int val1 = sc.pop();
                int val2 = sc.pop();
            switch (x) {
                case '+' :
                    
                    sc.push(val2+val1);
                    break;
                case '-' :    
                    
                    sc.push(val2-val1);
                    break;
                case '*' :
                    
                    sc.push(val2*val1);
                    break;
                case '/' :
                
                    sc.push(val2/val1);
                    break;
                
            }
        }

          
            
        }
        return sc.pop();
    }
    public static void main(String[] args) {
        String str = "100 200 + 2 / 5 * 7 +";
       System.out.println(" ans: "+evaluation(str));
    }}

        
       