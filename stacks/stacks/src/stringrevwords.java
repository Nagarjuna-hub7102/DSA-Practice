import java.util.Stack;

public class stringrevwords {
    static  void reverse(String str){
        Stack<String> s = new Stack<>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                s.add(temp);
                temp = "";
            }
            else{
                temp = temp + str.charAt(i);
            }
            
        }
        s.add(temp);
        while (!s.isEmpty()) {
            temp = s.peek();
            s.pop();
            System.out.print(temp + " ");
            
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        String str = "I Love To Code";
        reverse(str);
    }
}
