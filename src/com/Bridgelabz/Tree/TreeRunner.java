package com.Bridgelabz.Tree;

public class TreeRunner {
	public static void main(String[] args) {
		MyBinaryTree t= new MyBinaryTree();
		
		t.add(23);
		t.add(54);
		t.add(67);
		t.print();
		
		t.searchNodeInTree(23);
		
		
	}

}
