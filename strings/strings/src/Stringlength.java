public class Stringlength {
    static int strLength(String str){
        int ans = 0;
        int end = str.length()-1;
        if(str.charAt(end)==' '){
            end--;
        }
        while (end>=0&&str.charAt(end)!=' ') {
            ans++;
            end--;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.print("Length of the last word in the string:");
        System.out.println(strLength(str));
    }
}
