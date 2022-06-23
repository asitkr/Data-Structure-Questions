import java.util.Queue;
import java.util.LinkedList;

class CreateTree
{
	static Node root;

	static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
		}
	}

	private void insert(int data){
		Node node =  new Node(data);

		if(root == null){
			root = node;
		}
		else{
			Queue<Node> q = new LinkedList<>();
			Node temp = root;

			q.add(temp);

			while(!q.isEmpty()){
				temp = q.poll();

				if(temp.left != null){
					q.add(temp.left);
				}
				else{
					temp.left = node;
					break;
				}

				if(temp.right != null){
					q.add(temp.right);
				}
				else{
					temp.right = node;
					break;
				}
			}
		}
	}

	private void levelOrderTraversal(){
		Queue<Node> q = new LinkedList<>();

		Node temp = root;

		q.add(temp);

		while(!q.isEmpty()){

			temp = q.poll();
			System.out.print(temp.data + " " );

			if(temp.left != null){
				q.add(temp.left);
			}

			if(temp.right != null){
				q.add(temp.right);
			}
		}
	}

	public static void main(String[] args) 
	{
		CreateTree tree = new CreateTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.levelOrderTraversal();
	}
}