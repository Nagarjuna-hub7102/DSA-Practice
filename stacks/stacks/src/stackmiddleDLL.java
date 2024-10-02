
class DLLNode {
	DLLNode prev;
	int data;
	DLLNode next;
	DLLNode(int data) { this.data = data; }
}

public class stackmiddleDLL {
	DLLNode head;
	DLLNode mid;
	DLLNode prev;
	DLLNode next;
	int size;
	
	void push(int new_data)
	{

	
		DLLNode new_node = new DLLNode(new_data);
		
		if (size == 0) {
			head = new_node;
			mid = new_node;
			size++;
			return;
		}
		head.next = new_node;
		new_node.prev = head;

		head = head.next;
		if (size % 2 != 0) {
			mid = mid.next;
		}
		size++;
	}
	int pop()
	{
		int data = -1;
		
		if (size == 0) {
			System.out.println("Stack is empty");
			
		}

		if (size != 0) {
			data = head.data;
			if (size == 1) {
				head = null;
				mid = null;
			}
			else {			 
				head = head.prev;
				head.next = null;
				if (size % 2 == 0) {
					mid = mid.prev;
				}
			}
			size--;
		}
		return data;
	}

	
	int findMiddle()
	{
		if (size == 0) {
			System.out.println("Stack is empty now");
			return -1;
		}
		return mid.data;
	}
	void deleteMiddleElement()
	{
		
		if (size != 0) {
			if (size == 1) {
				head = null;
				mid = null;
			}
			else if (size == 2) {
				head = head.prev;
				mid = mid.prev;
				head.next = null;
			}
			else {
				mid.next.prev = mid.prev;
				mid.prev.next = mid.next;
				if (size % 2 == 0) {
					mid = mid.prev;
				}
				else {
					mid = mid.next;
				}
			}
			size--;
		}
	}


	public static void main(String args[])
	{
		stackmiddleDLL smDLL = new stackmiddleDLL();
		smDLL.push(11);
		smDLL.push(22);
		smDLL.push(33);
		smDLL.push(44);
		smDLL.push(55);
		smDLL.push(66);
		smDLL.push(77);
		smDLL.push(88);
		smDLL.push(99);

		System.out.println("Popped : " + smDLL.pop());
		System.out.println("Popped : " + smDLL.pop());
		System.out.println("Middle Element : "
						+ smDLL.findMiddle());
		smDLL.deleteMiddleElement();
		System.out.println("New Middle Element : "
						+ smDLL.findMiddle());
	}
}


