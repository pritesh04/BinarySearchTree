package com.Bridgelabz.Tree;

public class MyBinaryTreeNode<K extends Comparable<K>> {
	K key;
	MyBinaryTreeNode left;
	MyBinaryTreeNode right;

	public MyBinaryTreeNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public MyBinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(MyBinaryTreeNode left) {
		this.left = left;
	}

	public MyBinaryTreeNode getRight() {
		return right;
	}

	public void setRight(MyBinaryTreeNode right) {
		this.right = right;
	}

}
