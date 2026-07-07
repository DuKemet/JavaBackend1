
public class LinkedList<Z> {
	private class Node{
		private Z data;
		public Node next;
		
		public Node(Z data) {
			this.data=data;
		}
		
		public Z getData() {
			return data;
		}
	}
	private Node head, last;
	private int size;
	public void add(Z data) {
		Node n= new Node(data);
		if(head==null) {
			head=n; 
			last=n;
			size=1;
		}else {
			last.next= n;
		}
		last=n;
		size++;
	}
	
	public void insert(int idx, Z data) {
		Node neu= new Node(data);
		Node n= head;
		int count=0;
		if(idx==0) {
			Node ins= new Node(data);
			ins.next=head; 
			head=ins;
			return;
		} else {
			while (count < idx - 1) {
				n = n.next;
				count++;
			}
		}
		Node temp= n.next;
		n.next=neu;
		neu.next=temp;
	}
	
	public void print() {
		Node n= head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	
	public void remove(int idx) {
		Node prev= head;
		int count=0;
		if(idx==0) {
			head=head.next;
		} else {
			while (count != idx - 1) {
				prev = prev.next;
				count++;
			}
		}
		prev.next=prev.next.next;
		
		size--;
	}
}
