
public class BinaryTree {
	public class Node {
		private int data;
		public Node left, right;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}
	}

	private Node root;

	public void add(int data) {
		Node n = new Node(data);

		if (root == null) {
			root = n;
		}
		Node t = root;
		while (true) {
			
			if (data == t.data)
				break;
			if (data < t.data) {
				if (t.left == null) {
					t.left = n;
				}
				t = t.left;
			} else {
				if (t.right == null) {
					t.right = n;
				}
				t = t.right;
			}
		}
	}

	public void traverse(Node t) {
		if(t==null) {
			return;
		}
		traverse(t.left);
		System.out.println(t.getData()+" ");
		traverse(t.right);
	}

	public void print() {
		traverse(root);
		System.out.println();
	}
}



//builder design pattern
// stack
//queue
