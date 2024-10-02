import java.util.Stack;

public class nxtgreaterele_2 {
   
    static void printNGE(int[] arr, int n,Stack<Character> s)
        {
            int i = 0;
            
            
            int element, next;
     
            
            s.push((char) arr[0]);
     
           
            for (i = 1; i < n; i++) {
                next = arr[i];
     
                if (s.isEmpty() == false) {
     
                  
                    element = s.pop();
     
                   
                    while (element < next) {
                        System.out.println(element + " --> "
                                           + next);
                        if (s.isEmpty() == true)
                            break;
                        element = s.pop();
                    }
     
                  
                    if (element > next)
                        s.push((char)element);
                }
     
               
                s.push((char)next );
            }
     
            
            while (s.isEmpty() == false) {
                element = s.pop();
                next = -1;
                System.out.println(element + " --> " + next);
            }
        }
     
        
        public static void main(String[] args)
        {
            Stack<Character> s = new Stack<>();
            int arr[] = { 11,13,21,3 };
            int n = arr.length;
            printNGE(arr, n, s);
        }
    }

