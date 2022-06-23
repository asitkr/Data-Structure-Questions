class Node
{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree1 
{
	Node root;

	public void TraverseTree(Node node){
		if(node != null){
			TraverseTree(node.left);
			System.out.println(" " + node.data);
			TraverseTree(node.right);
		}
	}

	public static void main(String[] args) 
	{
		BinaryTree1 tree = new BinaryTree1();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		System.out.println("Binary Tree   ");
		tree.TraverseTree(tree.root);
	}
}
