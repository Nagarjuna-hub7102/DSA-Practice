 import java.util.Stack;

    class queueimplstack {
    
       private static Stack<Integer> s1 = new Stack<>();
       private static Stack<Integer> s2 = new Stack<>();
        
         void enqueue(int x){
           s1.push(x);
        }
        
         int dequeue(){
            if(s1.empty() && s2.empty()){
               return -1;
            }
            else if(s2.empty()){
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
    public static void main(String[] args) {
        queueimplstack q = new queueimplstack(); 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3);
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue());  
    }
    }
