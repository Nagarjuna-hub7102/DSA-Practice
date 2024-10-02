//program to swap the variable using xor
public class swap {
      static void swapnumber(int a,int b){
        
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
         swapnumber(4,5);
    }
    
    
}
