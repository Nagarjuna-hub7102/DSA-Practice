import java.util.Stack;

public class prefixevaluation {
    static int evaluation(String str){
        Stack<Integer>sc=new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char x = str.charAt(i);
            if (str.charAt(i) == ' ') {
                continue;
                
            }
            
           
            
            else if (Character.isDigit(x)){

             int n = 0;
             int j =i;
             while (Character.isDigit(str.charAt(i))) {
               
                x = str.charAt(j);
                j--;
                
             }
             j++;
             for (int k = j; k <= i; k++) {
                n = n*10+(int)(x-'0');
                
                
             }
             sc.push(n);
            }
            else{
            
               int val1 = sc.pop();
                int val2 = sc.pop();
            switch (x) {
                case '+' :
                    
                    sc.push(val1+val2);
                    break;
                case '-' :    
                    
                    sc.push(val1-val2);
                    break;
                case '*' :
                    
                    sc.push(val1*val2);
                    break;
                case '/' :
                
                    sc.push(val1/val2);
                    break;
                
            }
        }

          
            
        }
        return sc.pop();
    }
    public static void main(String[] args) {
        String str = "+ 9 * 12 6";
       System.out.println(evaluation(str));
    }}

       

