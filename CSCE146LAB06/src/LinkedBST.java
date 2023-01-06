
public class LinkedBST <T extends Comparable> //variable for object type
//any objects we use in this BST implements this comparable Interface
{
	private class Node
	{
		T data; //data contained in the node which is COMPARABLE
		Node leftChild;
		Node rightChild;
		
		//constructor to assign value
		public Node(T aData) {
			this.data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root; //head
	public LinkedBST()//constructor to assign value to root
	{
		root = null;
	}
	public void add(T aData) {
		//if root is null then point the new node to root with the data
		if(root == null) {
			root = new Node(aData);
		}
		else {
			add(root,aData);
		}
	}
	private Node add (Node aNode, T aData)
	{
		//when we reach a leaf(NULL)
		if(aNode == null)//reached a leaf
			aNode = new Node(aData);
		else if(aData.compareTo(aNode.data)<0)//go left
			aNode.leftChild = add(aNode.leftChild, aData);
		else if(aData.compareTo(aNode.data)>0)//go right
			aNode.rightChild = add(aNode.rightChild, aData);
		return aNode;
		
	}
	
	public void printPreorder()//stack call
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null) {
			return;
		} 
		System.out.println(aNode.data);//process
		printPreorder(aNode.leftChild);//left
		printPreorder(aNode.rightChild);//right
	}
	
	public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(Node aNode)
	{
		if(aNode == null)
			return;
		printInorder(aNode.leftChild);//left
		System.out.println(aNode.data);//process
		printInorder(aNode.rightChild);//right		
	}
	
	public boolean search(T aData)
	{
		return search(root,aData);
	}
	private boolean search(Node aNode, T aData)
	{
		if(aNode == null) 
			return false;
		else if(aData.compareTo(aNode.data)<0)// go left
			return search(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)//go right
			return search(aNode.rightChild,aData);
		else
			return true;
	}
	public void remove(T aData)
	{
		root = remove(root, aData);
	}
	private Node remove(Node aNode, T aData)
	{
		//find the node
		if(aNode == null)
			return null;
		else if(aData.compareTo(aNode.data)<0)//left
			aNode.leftChild = remove(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)//right
			aNode.rightChild = remove(aNode.rightChild, aData);
		else//found it
		{
			if(aNode.rightChild == null)
				return aNode.leftChild;
			else if(aNode.leftChild == null)
				return aNode.rightChild;
			Node temp = findMinInTree(aNode.rightChild);
			aNode.data = temp.data; //now have a duplicate node
			aNode.rightChild = remove(aNode.rightChild, temp.data);
		}
			return aNode;
	}
	private Node findMinInTree(Node aNode) 
	{
		if(aNode == null)
			return null;
		else if(aNode.leftChild == null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
	}
	
	public void printPostorder() {
		
	}
	//goes left, right, and then process
	private void printPostorder(Node aNode) {
		if(aNode == null)
			return;
		printPostorder(aNode.leftChild);//recursive left 
		printPostorder(aNode.rightChild);//recursive right 
		System.out.println(aNode.data);//process //print
	}
	
}

