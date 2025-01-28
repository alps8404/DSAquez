package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Node {
	
	
	public int val;
	Node left;
	Node right;
	
	public Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("alpes");
		
		
		Node head = null;
		head = NodeCreation();
		List<Integer> ls = new ArrayList<>();
		List<Integer> ls2 = new ArrayList<>();
		List<Integer> ls3 = new ArrayList<>();
		//10 5 4 -1 -1 -1 13 -1 16 -1 -1
		System.out.println("Done....."+head.val);
		Inorder(head,ls);
		System.out.println("Inorder:"+ls);
		PreOrder(head,ls2);
		System.out.println("Preorder:"+ls2);
		PostOrder(head,ls3);
		System.out.println("Postorder:"+ls3);
	}

	private static void PreOrder(Node head, List<Integer> ls) {
		// TODO Auto-generated method stub
		if(head==null)
			return ;
		
		ls.add(head.val);
		Inorder(head.left,ls);
		Inorder(head.right,ls);
		
	}
	
	private static void PostOrder(Node head, List<Integer> ls) {
		// TODO Auto-generated method stub
		if(head==null)
			return ;
		
		Inorder(head.left,ls);
		Inorder(head.right,ls);
		ls.add(head.val);
	}

	private static void Inorder(Node head,List<Integer> ls) {
		// TODO Auto-generated method stub
		
		if(head==null)
			return ;
		
		Inorder(head.left,ls);
		ls.add(head.val);
		Inorder(head.right,ls);
		
	}

	private static Node NodeCreation() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Enter a value for node: ");
		int x = sc.nextInt();
		if(x==-1)
			return null;
		Node fisrt = new Node(x);
		 System.out.println("Enter left of"+fisrt.val);
		 fisrt.left = NodeCreation();
		 System.out.println("Enter right of"+fisrt.val);
		 fisrt.right = NodeCreation();
		 return fisrt;
	}
}
