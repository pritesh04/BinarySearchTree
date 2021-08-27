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


}
