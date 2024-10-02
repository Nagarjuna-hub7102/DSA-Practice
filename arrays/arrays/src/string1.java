/*given a string we need to find the no of a color cutains ina set of size l
 
str = "bbbaaababa";
set size = 3;
ans =3
{bbb}
{aaa}
{bab}
{a}
set 2 contains max 3 a's so ans is 3
 */


import java.util.Scanner;

public class string1 {
    int solution(String str,int L){
      int count =0;
      int ans=0;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'){
            count++;
            
        }

        if((i+1)%L==0){
            ans = Math.max(ans, count);
            count=0;
        }


      }
      ans = Math.max(ans, count);

      return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String str = sc.next();
        string1 s = new string1();
        System.out.println(s.solution(str, L));
    }
}
