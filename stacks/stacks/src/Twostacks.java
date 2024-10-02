class twostacks {
    int[] arr;
    int size;
    int top1;
    int top2;
    twostacks(int x){
        size = x;
        arr = new int[x];
        top1 = size/2+1;
        top2 = size/2;

    }
    void push1(int x){
        if(top1>0){
            top1--;
            arr[top1] = x;
        }
        else{
            System.out.println("stackoverflow"+ "by element" + x);
            return;
        }
    }
    int pop1(){
          if(top1<=size/2){
            int x = arr[top1];
            top1++;
            return x;
          }
          else{
            System.out.println("stack underflow");
            return 0;
          }
    }
    void push2(int x){
        if(top2<size-1){
            top2++;
            arr[top2] = x;
        }
        else{
            System.out.println("stack overflow"+ "by element"+ x);
            return;
        }
    }
    int pop2(){
        if (top2>size/2){
            int x = arr[top2];
            top2--;
            return x;
        }
        else{
            System.out.println("stack underflow");
            return -1;
        }
    }
    public static void main(String[] args) {
        twostacks ts = new twostacks(100);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("popped element from stack1 :" + ts.pop1());
        System.out.println("popped element from stack1 :" + ts.pop1());
        System.out.println("popped element from stack2 :" + ts.pop2());
        System.out.println("popped element from stack1 :" + ts.pop1());
    }
}