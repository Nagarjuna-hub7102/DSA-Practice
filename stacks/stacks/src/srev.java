public class srev {
    static String reverse(String s){
        char c;
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            a = c + a;;
            
        }
        return a;
        
    }
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(reverse(s));
    }
}
