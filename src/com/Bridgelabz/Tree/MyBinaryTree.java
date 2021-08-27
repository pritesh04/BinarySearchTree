package com.Bridgelabz.Tree;

public class MyBinaryTree<K extends Comparable<K>> {

	MyBinaryTreeNode root;

	public void add(K key) {
		root = this.addRecursively(root, key);
	}

	private MyBinaryTreeNode<K> addRecursively(MyBinaryTreeNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryTreeNode<>(key);
		}
		int Result = key.compareTo(current.key);
		if (Result == 0)
			return current;
		if (Result < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	private void getTreeNodes(MyBinaryTreeNode<K> root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.key);
			getTreeNodes(root.left);
			getTreeNodes(root.right);
		}
	}
	public void print() {
		this.getTreeNodes(root);
	}

	public void searchNodeInTree(K key) {
		if (this.search(root, key)) {
			System.out.println(key + " present ");
		} else {
			System.out.println(key + " not present");
		}
	}

	private boolean search(MyBinaryTreeNode<K> root, K key) {
		if (root == null)
			return false;
		int compareKey = key.compareTo(root.key);
		if (compareKey == 0)
			return true;
		if (compareKey < 0)
			return search(root.left, key);
		else
			return search(root.right, key);
	}
}
