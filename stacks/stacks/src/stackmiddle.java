class stackmiddle{
    static node root;
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }

    }
    void push(int value){
        node newnode = new node(value);
        if(root == null){
            root = newnode;

        }
        else{
            node temp = root;
            root = newnode;
            newnode.next = temp;
        }
        System.out.println(value + "pushed into stack");
    }
    int pop(){
        int popped = Integer.MIN_VALUE;
        if(root == null){
            System.out.println("stack is empty");
            
        }
        else{
            popped = root.data;
            root = root.next;
        }
        return popped;
    }
    public int middle(node root){
        node fast = root;
        node slow = root;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;

        
        

    }
    int middlepop(){
        int popped = Integer.MIN_VALUE;
        if(root == null){
            System.out.println("stack is empty");

        }
        else{
            popped = middle(root);
        }
        return popped;
    }
    public static void main(String[] args) {
        stackmiddle sm = new stackmiddle();
        sm.push(11);
        sm.push(22);
        sm.push(33);
        sm.push(44);
        sm.push(55);
        sm.push(66);
        sm.push(77);
        sm.push(88);
        sm.push(99);
        System.out.println("popped element" + sm.pop());
        System.out.println("popped element" + sm.pop());
        System.out.println("middle element" + sm.middle(root));
        sm.middlepop();
        while(root != null){
            System.out.println(root.data + "  ");
            root = root.next;
        }
    }
    
}